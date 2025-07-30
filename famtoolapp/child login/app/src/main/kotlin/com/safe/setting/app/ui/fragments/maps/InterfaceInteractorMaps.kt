package com.safe.setting.app.ui.fragments.maps

import com.safe.setting.app.di.PerActivity
import com.safe.setting.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorMaps<V : InterfaceViewMaps> : InterfaceInteractor<V> {
    fun valueEventLocation()
    fun valueEventEnableGps()
    fun valueEventEnablePermission()
}