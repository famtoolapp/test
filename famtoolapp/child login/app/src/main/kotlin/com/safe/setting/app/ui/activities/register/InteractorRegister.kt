package com.safe.setting.app.ui.activities.register

import android.content.Context
import androidx.fragment.app.FragmentManager
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.R
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
import com.safe.setting.app.ui.activities.base.BaseInteractor
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

import javax.inject.Inject


class InteractorRegister<V : InterfaceViewRegister> @Inject constructor(supportFragment: FragmentManager, context: Context, firebase: InterfaceFirebase) : BaseInteractor<V>(supportFragment, context, firebase), InterfaceInteractorRegister<V> {

    override fun signUpDisposable(email: String, pass: String) {
        getView()!!.addDisposable(firebase().signUp(email, pass)
                .map { authResult -> authResult.user != null }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { getView()!!.showDialog(SweetAlertDialog.PROGRESS_TYPE, R.string.logging_in, null, null) { show() } }
                .subscribe({ getView()!!.successResult(it) }, { getView()!!.failedResult(it) }))
    }

}