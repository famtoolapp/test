package com.safe.setting.app.ui.activities.login

import android.Manifest
import android.os.Bundle
import android.widget.*
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.R
import com.safe.setting.app.data.preference.DataSharePreference.childSelected
import com.safe.setting.app.data.preference.DataSharePreference.typeApp
import com.safe.setting.app.databinding.ActivityLoginBinding
import com.safe.setting.app.ui.activities.base.BaseActivity
import com.safe.setting.app.ui.activities.mainchild.MainChildActivity
import com.safe.setting.app.ui.activities.register.RegisterActivity
import com.safe.setting.app.utils.ConstFun.startAnimateActivity
import com.safe.setting.app.utils.Consts.TEXT
import com.safe.setting.app.utils.KeyboardUtils
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class LoginActivity : BaseActivity<ActivityLoginBinding>(), InterfaceViewLogin, KeyboardUtils.SoftKeyboardToggleListener {

    private lateinit var edtEmail: EditText
    private lateinit var edtPass: EditText
    private lateinit var btnSignIn: Button
    private lateinit var btnSignUp: TextView
    private lateinit var edtNewChild: EditText // FIX: Re-added the child name EditText
    private lateinit var scroll: ScrollView

    @Inject
    lateinit var interactor: InterfaceInteractorLogin<InterfaceViewLogin>

    override fun onStart() {
        super.onStart()
        // Force app type to Child on start. This ensures it's always child mode.
        typeApp = false
        if (interactor.user() != null) {
            startAnimateActivity<MainChildActivity>(R.anim.fade_in, R.anim.fade_out)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        edtEmail = binding.editLoginEmail
        edtPass = binding.editLoginPassword
        btnSignIn = binding.btnLoginSignin
        btnSignUp = binding.txtLoginSignup
        scroll = binding.scroll
        edtNewChild = binding.editNewChild // FIX: Bound the new EditText from XML

        getComponent()!!.inject(this)
        interactor.onAttach(this)

        // Add validation for the new child field
        newChildValidationObservable(edtNewChild)
        emailValidationObservable(edtEmail)
        passValidationObservable(edtPass)
        signInValidationObservable(btnSignIn)
        onClickLogin()
        KeyboardUtils.addKeyboardToggleListener(this, this)
    }

    override fun instanceViewBinding(): ActivityLoginBinding {
        return ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onToggleSoftKeyboard(isVisible: Boolean) {
        if (isVisible) scroll.smoothScrollTo(0, scroll.bottom)
    }

    override fun onDestroy() {
        interactor.onDetach()
        super.onDestroy()
    }

    private fun onClickLogin() {
        btnSignUp.setOnClickListener {
            startAnimateActivity<RegisterActivity>(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        btnSignIn.setOnClickListener {
            // FIX: Restore the checkData validation for the child name field
            checkData { checkPermissionType { signIn() } }
        }
    }

    // FIX: Restored the function to validate the child name field
    private fun checkData(func: () -> Unit) {
        // Since it's always child mode, we must validate the child name.
        if (!TEXT.matcher(edtNewChild.text).matches()) {
            edtNewChild.text.clear()
            edtNewChild.error = getString(R.string.characters_child)
            edtNewChild.requestFocus()
        } else {
            func()
        }
    }

    private fun checkPermissionType(func: () -> Unit) {
        // This app is always for a Child, so we always check the required permissions.
        getPermissions()!!.requestEachCombined(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.RECEIVE_SMS,
            Manifest.permission.READ_SMS,
            Manifest.permission.SEND_SMS,
            Manifest.permission.CAMERA
        ).subscribe { permission ->
            if (permission.granted) {
                func()
            } else {
                showError("All permissions are required to use this app.")
            }
        }.dispose()
    }

    private fun signIn() {
        interactor.signInDisposable(edtEmail.text.toString(), edtPass.text.toString())
    }

    override fun addDisposable(disposable: Disposable) {}

    override fun successResult(result: Boolean, filter: Boolean) {
        hideDialog()
        if (result) {
            showMessage(getString(R.string.login_success))
            // FIX: Use the text from the edtNewChild field for the child's name
            childSelected = edtNewChild.text.toString()
            startAnimateActivity<MainChildActivity>(R.anim.fade_in, R.anim.fade_out)
        } else {
            showError(getString(R.string.login_failed_try_again_later))
        }
    }

    override fun failedResult(throwable: Throwable) {
        hideDialog()
        showDialog(
            SweetAlertDialog.ERROR_TYPE, R.string.ops,
            "${getString(R.string.login_failed)} ${throwable.message}",
            android.R.string.ok
        ) {
            setCanceledOnTouchOutside(true)
            show()
        }
    }
}
