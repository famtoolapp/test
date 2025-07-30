package com.safe.setting.app.ui.fragments.maps

import com.safe.setting.app.data.model.Location
import com.safe.setting.app.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot


interface InterfaceViewMaps : InterfaceView {
    fun setLocation(location: Location)
    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValuePermission(dataSnapshot: DataSnapshot)
}