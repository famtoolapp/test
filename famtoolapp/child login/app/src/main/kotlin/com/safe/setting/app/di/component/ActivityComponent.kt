package com.safe.setting.app.di.component

import com.safe.setting.app.di.PerActivity
import com.safe.setting.app.di.module.ActivityModule
import com.safe.setting.app.ui.activities.mainparent.MainParentActivity
import com.safe.setting.app.ui.activities.register.RegisterActivity
import com.safe.setting.app.ui.activities.login.LoginActivity
import com.safe.setting.app.ui.activities.mainchild.MainChildActivity
import com.safe.setting.app.ui.fragments.maps.MapsFragment

import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(mapsFragment: MapsFragment)
}