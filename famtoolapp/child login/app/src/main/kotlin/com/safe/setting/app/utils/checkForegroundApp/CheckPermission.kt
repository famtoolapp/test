package com.safe.setting.app.utils.checkForegroundApp

import android.app.AppOpsManager
import android.content.Context
import android.os.Build
import com.safe.setting.app.utils.Consts.PERMISSION_USAGE_STATS
import com.pawegio.kandroid.isPermissionGranted


object CheckPermission{

    fun Context.hasUsageStatsPermission(): Boolean {
        val mode = getModeManager(AppOpsManager.OPSTR_GET_USAGE_STATS)
        return if (mode == AppOpsManager.MODE_DEFAULT) isPermissionGranted(PERMISSION_USAGE_STATS)
        else mode == AppOpsManager.MODE_ALLOWED
    }

fun Context.getModeManager(ops: String): Int {
    val appOps = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        appOps.unsafeCheckOpNoThrow(ops, android.os.Process.myUid(), packageName)
    } else {
        @Suppress("DEPRECATION")
        appOps.checkOpNoThrow(ops, android.os.Process.myUid(), packageName)
//        TODO("VERSION.SDK_INT < M")
    }
}
}