package com.safe.setting.app.di.component;

@com.safe.setting.app.di.PerService()
@dagger.Component(dependencies = {com.safe.setting.app.di.component.AppComponent.class}, modules = {com.safe.setting.app.di.module.ServiceModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/safe/setting/app/di/component/ServiceComponent;", "", "inject", "", "smsService", "Lcom/safe/setting/app/services/sms/SmsService;", "app_release"})
public abstract interface ServiceComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.services.sms.SmsService smsService);
}