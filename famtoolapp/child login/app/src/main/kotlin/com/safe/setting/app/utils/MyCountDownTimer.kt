package com.safe.setting.app.utils

import android.os.CountDownTimer
import com.safe.setting.app.utils.Consts.TAG
import com.pawegio.kandroid.i


class MyCountDownTimer(startTime: Long, interval: Long,private val timer:((timer:Long)->Unit)?=null,
                       private val func: () -> Unit) : CountDownTimer(startTime, interval) {
    override fun onFinish() = func()
    override fun onTick(t: Long) { i(TAG,"timer $t") ; timer?.invoke(t) }
}