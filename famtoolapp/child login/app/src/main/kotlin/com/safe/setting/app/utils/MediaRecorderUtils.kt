package com.safe.setting.app.utils

import android.content.Context
import android.media.MediaRecorder
import android.media.MediaRecorder.OnErrorListener
import android.os.Build
import androidx.annotation.RequiresApi
import com.pawegio.kandroid.e

@RequiresApi(Build.VERSION_CODES.S)
class MediaRecorderUtils(private val errorAction: () -> Unit, context: Context) : MediaRecorder(context) {

    fun startRecording(audioSource: Int, fileName: String?) {
        try {
            setAudioSource(audioSource)
            setOutputFormat(OutputFormat.THREE_GPP)
            setAudioEncoder(AudioEncoder.AMR_NB)
            setOutputFile(fileName)

            val errorListener = OnErrorListener { _, _, _ -> errorAction() }
            setOnErrorListener(errorListener)

            prepare()
            start()
        } catch (er: Throwable) {
            e(Consts.TAG, er.message.toString())
            errorAction()
        }
    }

    fun stopRecording(sendFile: () -> Unit) {
        try {
            stop()
            sendFile()
        } catch (e: Throwable) {
            e(Consts.TAG, e.message.toString())
            errorAction()
        }
    }
}
