package com.safe.setting.app.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.safe.setting.app.di.PerActivity
import com.safe.setting.app.ui.activities.login.InteractorLogin
import com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin
import com.safe.setting.app.ui.activities.login.InterfaceViewLogin
import com.safe.setting.app.ui.activities.mainparent.InteractorMainParent
import com.safe.setting.app.ui.activities.mainparent.InterfaceInteractorMainParent
import com.safe.setting.app.ui.activities.mainparent.InterfaceViewMainParent
import com.safe.setting.app.ui.activities.register.InteractorRegister
import com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister
import com.safe.setting.app.ui.activities.register.InterfaceViewRegister
import com.safe.setting.app.ui.fragments.maps.InteractorMaps
import com.safe.setting.app.ui.fragments.maps.InterfaceInteractorMaps
import com.safe.setting.app.ui.fragments.maps.InterfaceViewMaps
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager


    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor


}