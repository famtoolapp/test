package com.safe.setting.app.utils.async

import android.content.Context
import cn.pedant.SweetAlert.SweetAlertDialog
import com.safe.setting.app.R
import com.safe.setting.app.utils.ConstFun.alertDialog
import com.safe.setting.app.utils.ConstFun.isRoot // FIX: Import the isRoot function
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class AsyncTaskRootPermission(private val context: Context, private val result: (result: Boolean) -> Unit) {

    private var dialog: SweetAlertDialog? = null



    @OptIn(DelicateCoroutinesApi::class)
    fun execute() {
        dialog = context.alertDialog(SweetAlertDialog.PROGRESS_TYPE, R.string.check_root_access, null, 0) {
            show()
        }

        GlobalScope.launch(Dispatchers.IO) {
            // FIX: Replaced the crashing RootBeer check with the safer, manual isRoot() function.
            val isRooted = isRoot()

            launch(Dispatchers.Main) {
                dialog?.dismiss()
                result(isRooted)
            }
        }
    }
}


