package com.safe.setting.app.di.component;

@com.safe.setting.app.di.PerActivity()
@dagger.Component(dependencies = {com.safe.setting.app.di.component.AppComponent.class}, modules = {com.safe.setting.app.di.module.ActivityModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/safe/setting/app/di/component/ActivityComponent;", "", "inject", "", "loginActivity", "Lcom/safe/setting/app/ui/activities/login/LoginActivity;", "mainChildActivity", "Lcom/safe/setting/app/ui/activities/mainchild/MainChildActivity;", "mainParentActivity", "Lcom/safe/setting/app/ui/activities/mainparent/MainParentActivity;", "registerActivity", "Lcom/safe/setting/app/ui/activities/register/RegisterActivity;", "mapsFragment", "Lcom/safe/setting/app/ui/fragments/maps/MapsFragment;", "app_release"})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.login.LoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.register.RegisterActivity registerActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.mainparent.MainParentActivity mainParentActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.mainchild.MainChildActivity mainChildActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.fragments.maps.MapsFragment mapsFragment);
}