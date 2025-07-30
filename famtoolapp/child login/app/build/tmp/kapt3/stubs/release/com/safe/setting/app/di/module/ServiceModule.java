package com.safe.setting.app.di.module;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/safe/setting/app/di/module/ServiceModule;", "", "service", "Landroid/app/Service;", "(Landroid/app/Service;)V", "provideContext", "Landroid/content/Context;", "provideInterfaceInteractorSms", "Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;", "Lcom/safe/setting/app/services/sms/InterfaceServiceSms;", "interactor", "Lcom/safe/setting/app/services/sms/InteractorSms;", "app_release"})
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    private android.app.Service service;
    
    public ServiceModule(@org.jetbrains.annotations.NotNull()
    android.app.Service service) {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @dagger.Provides()
    @com.safe.setting.app.di.PerService()
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.services.sms.InterfaceInteractorSms<com.safe.setting.app.services.sms.InterfaceServiceSms> provideInterfaceInteractorSms(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.services.sms.InteractorSms<com.safe.setting.app.services.sms.InterfaceServiceSms> interactor) {
        return null;
    }
}