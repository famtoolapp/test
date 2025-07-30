package com.safe.setting.app.di.module;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0015H\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/safe/setting/app/di/module/ActivityModule;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "provideActivity", "provideContext", "Landroid/content/Context;", "provideInterfaceInteractorLogin", "Lcom/safe/setting/app/ui/activities/login/InterfaceInteractorLogin;", "Lcom/safe/setting/app/ui/activities/login/InterfaceViewLogin;", "interactor", "Lcom/safe/setting/app/ui/activities/login/InteractorLogin;", "provideInterfaceInteractorMain", "Lcom/safe/setting/app/ui/activities/mainparent/InterfaceInteractorMainParent;", "Lcom/safe/setting/app/ui/activities/mainparent/InterfaceViewMainParent;", "interactorParent", "Lcom/safe/setting/app/ui/activities/mainparent/InteractorMainParent;", "provideInterfaceInteractorMaps", "Lcom/safe/setting/app/ui/fragments/maps/InterfaceInteractorMaps;", "Lcom/safe/setting/app/ui/fragments/maps/InterfaceViewMaps;", "Lcom/safe/setting/app/ui/fragments/maps/InteractorMaps;", "provideInterfaceInteractorRegister", "Lcom/safe/setting/app/ui/activities/register/InterfaceInteractorRegister;", "Lcom/safe/setting/app/ui/activities/register/InterfaceViewRegister;", "Lcom/safe/setting/app/ui/activities/register/InteractorRegister;", "provideLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "provideSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_release"})
public final class ActivityModule {
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity provideActivity() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager provideSupportFragmentManager() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @com.safe.setting.app.di.PerActivity()
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.activities.mainparent.InterfaceInteractorMainParent<com.safe.setting.app.ui.activities.mainparent.InterfaceViewMainParent> provideInterfaceInteractorMain(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.mainparent.InteractorMainParent<com.safe.setting.app.ui.activities.mainparent.InterfaceViewMainParent> interactorParent) {
        return null;
    }
    
    @dagger.Provides()
    @com.safe.setting.app.di.PerActivity()
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin<com.safe.setting.app.ui.activities.login.InterfaceViewLogin> provideInterfaceInteractorLogin(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.login.InteractorLogin<com.safe.setting.app.ui.activities.login.InterfaceViewLogin> interactor) {
        return null;
    }
    
    @dagger.Provides()
    @com.safe.setting.app.di.PerActivity()
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister<com.safe.setting.app.ui.activities.register.InterfaceViewRegister> provideInterfaceInteractorRegister(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.register.InteractorRegister<com.safe.setting.app.ui.activities.register.InterfaceViewRegister> interactor) {
        return null;
    }
    
    @dagger.Provides()
    @com.safe.setting.app.di.PerActivity()
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.fragments.maps.InterfaceInteractorMaps<com.safe.setting.app.ui.fragments.maps.InterfaceViewMaps> provideInterfaceInteractorMaps(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.fragments.maps.InteractorMaps<com.safe.setting.app.ui.fragments.maps.InterfaceViewMaps> interactor) {
        return null;
    }
}