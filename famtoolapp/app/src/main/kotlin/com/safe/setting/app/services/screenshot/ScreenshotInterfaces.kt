package com.safe.setting.app.services.screenshot

import com.safe.setting.app.services.base.InterfaceInteractorService
import com.safe.setting.app.services.base.InterfaceService
import java.io.File

interface InterfaceServiceScreenshot : InterfaceService

interface InterfaceInteractorScreenshot<S : InterfaceServiceScreenshot> : InterfaceInteractorService<S> {
    fun uploadScreenshot(file: File)
}