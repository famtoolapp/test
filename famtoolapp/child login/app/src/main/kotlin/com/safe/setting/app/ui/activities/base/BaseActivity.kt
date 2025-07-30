package com.safe.setting.app.ui.activities.base

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.R
import com.safe.setting.app.di.component.ActivityComponent
import com.safe.setting.app.di.component.DaggerActivityComponent
import com.safe.setting.app.di.module.ActivityModule
import com.safe.setting.app.utils.ConstFun.alertDialog
import com.safe.setting.app.utils.ConstFun.openAppSystemSettings
import com.pawegio.kandroid.longToast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.widget.PopupMenu
import android.view.View
import androidx.core.view.WindowInsetsControllerCompat
import androidx.viewbinding.ViewBinding
import com.safe.setting.app.app.Hom
import com.safe.setting.app.ui.fragments.base.BaseFragment
import com.safe.setting.app.ui.widget.toolbar.CustomToolbar
import com.safe.setting.app.utils.ConstFun.adjustFontScale
import com.safe.setting.app.utils.Consts.TEXT
import com.jakewharton.rxbinding4.widget.textChanges
import com.tbruyelle.rxpermissions3.Permission
import com.tbruyelle.rxpermissions3.RxPermissions
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

abstract class BaseActivity<VB: ViewBinding> : AppCompatActivity(),
    InterfaceView, BaseFragment.Callback {

    private var alertDialog: SweetAlertDialog? = null
    private var compositeDisposable: CompositeDisposable? = null
    private var rxPermissions: RxPermissions? = null
    private lateinit var snackbar: Snackbar

    companion object {
        @JvmStatic
        var activityComponent: ActivityComponent? = null
    }

    private lateinit var emailObservable: Observable<Boolean>
    private lateinit var passObservable: Observable<Boolean>
    private lateinit var signInEnabled: Observable<Boolean>
    protected lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = instanceViewBinding()
        setContentView(binding.root)
        initializeActivityComponent()
        adjustFontScale()
    }

    abstract fun instanceViewBinding(): VB

    fun windowLightStatusBar() {
        val window = window
        val decorView = window.decorView
        val wic = WindowInsetsControllerCompat(window, decorView)
        wic.isAppearanceLightStatusBars = true // Set light status bar icons
    }

    override fun onResume() {
        super.onResume()
        initializeActivityComponent()
    }

    private fun initializeActivityComponent() {
        activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .appComponent(Hom.appComponent).build()
        compositeDisposable = CompositeDisposable()
        rxPermissions = RxPermissions(this)
    }

    override fun getComponent(): ActivityComponent? = activityComponent

    override fun getPermissions(): RxPermissions? = rxPermissions

    override fun subscribePermission(permission: Permission,
                                     msgRationale: String, msgDenied: String, granted: () -> Unit) {
        when {
            permission.granted -> granted()
            permission.shouldShowRequestPermissionRationale ->
                showDialog(SweetAlertDialog.WARNING_TYPE, R.string.title_dialog, msgRationale,
                    android.R.string.ok) {
                    setCanceledOnTouchOutside(true)
                    show()
                }
            else -> showDialog(SweetAlertDialog.WARNING_TYPE, R.string.title_dialog,
                msgDenied, R.string.go_to_setting, true) {
                setConfirmClickListener { openAppSystemSettings() }
                show()
            }
        }
    }

    // **** बदला हुआ फंक्शन ****
    override fun showDialog(alertType: Int, title: Int, msg: String?,
                            txtPositiveButton: Int?,
                            cancellable: Boolean,
                            action: SweetAlertDialog.() -> Unit) : SweetAlertDialog {
        alertDialog = alertDialog(alertType,
            title, msg, txtPositiveButton, cancellable, action)

        // प्रोग्रेस बार का रंग बदलें
        if (alertType == SweetAlertDialog.PROGRESS_TYPE) {
            alertDialog?.progressHelper?.barColor = ContextCompat.getColor(this, R.color.dark_accent)
        }

        // बटन का रंग बदलें (सभी तरह के डायलॉग के लिए)
        alertDialog?.confirmButtonBackgroundColor = ContextCompat.getColor(this, R.color.dark_accent)

        return alertDialog!!
    }

    override fun hideDialog() {
        if (alertDialog != null) alertDialog!!.dismissWithAnimation()
    }

    override fun showError(message: String) {
        showMessage(message)
    }

    override fun showMessage(message: Int) {
        showMessage(getString(message))
    }

    override fun showMessage(message: String) {
        longToast(message)
    }

    override fun showSnackbar(message: Int, v: View) {
        snackbar = Snackbar.make(v, message, Snackbar.LENGTH_LONG)
            .setAction(android.R.string.ok){snackbar.dismiss()}
        snackbar.show()
    }

    override fun showSnackbar(message: String, v: View) {
        snackbar = Snackbar.make(v, message, Snackbar.LENGTH_INDEFINITE)
            .setAction(android.R.string.ok){snackbar.dismiss()}
        snackbar.show()
    }

    override fun addDisposable(disposable: Disposable) {
        compositeDisposable!!.add(disposable)
    }

    override fun clearDisposable() {
        if (compositeDisposable != null) {
            compositeDisposable!!.dispose()
            compositeDisposable!!.clear()
        }
    }

    fun newChildValidationObservable(newChild: EditText): Disposable {
        return newChild.textChanges().map { textNewChild -> TEXT.matcher(textNewChild).matches() }
            .distinctUntilChanged()
            .map { b -> if (b) R.drawable.ic_child_care else R.drawable.ic_child_care_black_24dp }
            .subscribe { id -> newChild.setCompoundDrawablesWithIntrinsicBounds(id, 0, 0, 0) }
    }

    /** Email validation */
    fun emailValidationObservable(edtEmail: EditText) {
        emailObservable = edtEmail.textChanges().map { textEmail -> Patterns.EMAIL_ADDRESS.matcher(textEmail).matches() }
        emailObservable(edtEmail)
    }

    private fun emailObservable(edtEmail: EditText): Disposable {
        return emailObservable.distinctUntilChanged()
            .map { b -> if (b) R.drawable.ic_user else R.drawable.ic_user_alert }
            .subscribe { id -> edtEmail.setCompoundDrawablesWithIntrinsicBounds(id, 0, 0, 0) }
    }

    /** Password validation */
    fun passValidationObservable(edtPass: EditText) {
        passObservable = edtPass.textChanges().map { textPass -> textPass.length > 5 }
        passObservable(edtPass)
    }

    private fun passObservable(edtPass: EditText): Disposable {
        return passObservable.distinctUntilChanged()
            .map { b -> if (b) R.drawable.ic_lock_open else R.drawable.ic_lock }
            .subscribe { id -> edtPass.setCompoundDrawablesWithIntrinsicBounds(id, 0, 0, 0) }
    }

    /** Sign In observer */
    fun signInValidationObservable(btnSignIn: Button) {
        signInEnabled = Observable.combineLatest(emailObservable, passObservable
        ) { email, pass -> email && pass }
        signInEnableObservable(btnSignIn)
    }

    // **** बदला हुआ फंक्शन ****
    private fun signInEnableObservable(btnSignIn: Button): Disposable {
        return signInEnabled.distinctUntilChanged()
            .doOnNext { enabled ->
                btnSignIn.isEnabled = enabled

                // हरे रंग की जगह ऐप का रंग इस्तेमाल करें
                val colorResId = if (enabled) R.color.dark_accent else R.color.colorTextDisabled
                val color = ContextCompat.getColorStateList(this, colorResId)
                btnSignIn.backgroundTintList = color
            }
            .subscribe()
    }

    override fun setActionToolbar(action:Boolean) {}
    override fun successResult(result: Boolean, filter:Boolean) {}
    override fun failedResult(throwable: Throwable) {}
    override fun onItemClick(key: String?, child: String,file: String,position:Int) {}
    override fun onItemLongClick(key: String?, child: String,file: String,position:Int) {}
    override fun setDrawerLock() {}
    override fun setDrawerUnLock() {}
    override fun openDrawer() {}
    override fun setMenu(menu: PopupMenu?) {}
    override fun changeChild(fragmentTag:String) {}
    override fun setToolbar(toolbar: CustomToolbar, showSearch: Boolean, title: Int, showItemMenu: Int, hint:Int) {}
}
