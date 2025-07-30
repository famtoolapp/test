package com.safe.setting.app.services.sms;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\f\u0010\u0018\u001a\u00020\u000f*\u00020\u0014H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/safe/setting/app/services/sms/SmsService;", "Lcom/safe/setting/app/services/base/BaseService;", "Lcom/safe/setting/app/services/sms/InterfaceServiceSms;", "()V", "interactor", "Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;", "getInteractor", "()Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;", "setInteractor", "(Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;)V", "createNotification", "Landroid/app/Notification;", "hasSmsPermission", "", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "stopServiceSms", "setSmsIntent", "Companion", "app_release"})
public final class SmsService extends com.safe.setting.app.services.base.BaseService implements com.safe.setting.app.services.sms.InterfaceServiceSms {
    @javax.inject.Inject()
    public com.safe.setting.app.services.sms.InterfaceInteractorSms<com.safe.setting.app.services.sms.InterfaceServiceSms> interactor;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SmsService";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "SmsServiceChannel";
    public static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.services.sms.SmsService.Companion Companion = null;
    
    public SmsService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.services.sms.InterfaceInteractorSms<com.safe.setting.app.services.sms.InterfaceServiceSms> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.services.sms.InterfaceInteractorSms<com.safe.setting.app.services.sms.InterfaceServiceSms> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    private final void setSmsIntent(android.content.Intent $this$setSmsIntent) {
    }
    
    @java.lang.Override()
    public void stopServiceSms() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final boolean hasSmsPermission() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/safe/setting/app/services/sms/SmsService$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_ID", "", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}