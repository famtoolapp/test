package com.safe.setting.app.data.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Screenshot(
    var url: String? = null,
    var fileName: String? = null,
    var date: Long? = null
)
