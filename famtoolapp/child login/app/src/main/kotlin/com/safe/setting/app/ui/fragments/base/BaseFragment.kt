package com.safe.setting.app.ui.fragments.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.PopupMenu
import android.view.*
import androidx.viewbinding.ViewBinding
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.di.component.ActivityComponent
import com.safe.setting.app.ui.activities.base.BaseActivity
import com.safe.setting.app.ui.activities.base.InterfaceView
import com.safe.setting.app.ui.widget.toolbar.CustomToolbar
import com.tbruyelle.rxpermissions3.Permission
import com.tbruyelle.rxpermissions3.RxPermissions
import io.reactivex.rxjava3.disposables.Disposable

abstract class BaseFragment<VB: ViewBinding> : Fragment(), InterfaceView, CustomToolbar.OnToolbarActionListener, IOnFragmentListener {

    private var toolbar : CustomToolbar?=null
    private var titleInt : Int = 0
    private var hintInt : Int = 0
    private lateinit var binding: VB
    private lateinit var baseActivity: BaseActivity<*>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = instanceViewBinding()
        baseActivity = activity as BaseActivity<*>
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
    abstract fun instanceViewBinding(): VB

    override fun getComponent(): ActivityComponent? =
        baseActivity.getComponent()

    override fun getPermissions(): RxPermissions? = baseActivity.getPermissions()

    override fun subscribePermission(permission: Permission, msgRationale: String, msgDenied: String, granted: () -> Unit) {
        baseActivity.subscribePermission(permission, msgRationale, msgDenied, granted)
    }

    override fun showMessage(message: String) {
        baseActivity.showMessage(message)
    }

    override fun showMessage(message: Int) {
        baseActivity.showMessage(message)
    }

    override fun showSnackbar(message: Int,v:View) {
        baseActivity.showSnackbar(message,v)
    }

    override fun showSnackbar(message: String,v:View) {
        baseActivity.showSnackbar(message,v)
    }

    override fun showDialog(alertType: Int, title: Int, msg: String?, txtPositiveButton: Int?, cancellable: Boolean, action: SweetAlertDialog.() -> Unit) : SweetAlertDialog =
            baseActivity.showDialog(alertType, title, msg, txtPositiveButton, cancellable, action)


    override fun hideDialog() {
        baseActivity.hideDialog()
    }


    override fun showError(message: String) {
        baseActivity.showError(message)
    }


    override fun addDisposable(disposable: Disposable) {
        baseActivity.addDisposable(disposable)
    }

    override fun clearDisposable() {
        baseActivity.clearDisposable()
    }

    override fun changeChild(fragmentTag: String){
        baseActivity.changeChild(fragmentTag)
    }


    override fun setToolbar(toolbar: CustomToolbar, showSearch:Boolean, title:Int, showItemMenu:Int, hint:Int) {
        this.toolbar = toolbar
        this.titleInt = title
        this.hintInt = hint
        toolbar.setOnToolbarActionListener(this)
        toolbar.setTitle = getString(title)
        if (hint!=0) toolbar.hint = getString(hint)
        toolbar.enableSearch = showSearch
        val menu = toolbar.menu
        if (showItemMenu!=0) menu!!.menu.findItem(showItemMenu).isVisible = true
        baseActivity.setMenu(menu)
    }

    override fun onSearchStateChanged(enabled: Boolean) {
        if (enabled) baseActivity.setDrawerLock()
        else baseActivity.setDrawerUnLock()
    }

    override fun onSearchConfirmed(text: CharSequence) {}

    override fun onButtonClicked(buttonCode: Int) {
        when(buttonCode){
            CustomToolbar.BUTTON_NAVIGATION -> baseActivity.openDrawer()
        }
    }

    override fun onActionStateChanged(enabled: Boolean) {
        if (enabled) baseActivity.setDrawerLock()
        else {
            toolbar?.setTitle = getString(titleInt)
            if (hintInt != 0) toolbar?.hint = getString(hintInt)
            baseActivity.setDrawerUnLock()
        }
    }

    override fun setActionToolbar(action: Boolean) {
        if (action) toolbar!!.enableAction()
        else toolbar!!.disableAction()
    }

    override fun onChangeHeight() {}
    override fun onHideFragment() {}
    override fun onBackPressed(): Boolean = false
    override fun successResult(result: Boolean, filter:Boolean) {}
    override fun failedResult(throwable: Throwable) {}
    override fun onItemClick(key: String?, child: String,file: String,position:Int) {}
    override fun onItemLongClick(key: String?, child: String,file: String,position:Int) {}

    interface Callback{
        fun setDrawerLock()
        fun setDrawerUnLock()
        fun openDrawer()
        fun setMenu(menu: PopupMenu?)
    }

}