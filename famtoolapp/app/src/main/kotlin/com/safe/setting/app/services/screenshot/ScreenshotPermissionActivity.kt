package com.safe.setting.app.services.screenshot

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.projection.MediaProjectionManager
import android.os.Bundle

class ScreenshotPermissionActivity : Activity() {

    companion object {
        const val REQUEST_CODE = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mediaProjectionManager = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
        startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), REQUEST_CODE)
    }

    @SuppressLint("UseKtx")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                // अनुमति की जानकारी को सर्विस को भेजें
                ScreenshotListenerService.startServiceWithPermission(this, resultCode, data)

                // अनुमति मिलने पर SharedPreferences में सेव करें
                getSharedPreferences("AppPrefs", Context.MODE_PRIVATE).edit()
                    .putBoolean("screenshot_service_enabled", true).apply()
            }
        }
        finish()
    }
}
