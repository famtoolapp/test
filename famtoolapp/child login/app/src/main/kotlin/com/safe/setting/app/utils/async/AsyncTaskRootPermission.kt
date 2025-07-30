package com.safe.setting.app.utils.async

import android.content.Context
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.R
import com.safe.setting.app.utils.ConstFun.alertDialog
import com.safe.setting.app.utils.ConstFun.isRoot
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class AsyncTaskRootPermission(private val context: Context, private val result: (result: Boolean) -> Unit) {

    private var dialog: SweetAlertDialog? = null

    @OptIn(DelicateCoroutinesApi::class)
    fun execute() {
        // FIX: Replaced the deleted string resource with a hardcoded string
        dialog = context.alertDialog(SweetAlertDialog.PROGRESS_TYPE, 0, "Checking root access...", 0) {
            // We pass 0 for title and button text since they are not used for PROGRESS_TYPE
            // and we provide the message directly.
            titleText = "Checking root access"
            show()
        }

        GlobalScope.launch(Dispatchers.IO) {
            val isRooted = isRoot()

            launch(Dispatchers.Main) {
                dialog?.dismiss()
                result(isRooted)
            }
        }
    }
}
