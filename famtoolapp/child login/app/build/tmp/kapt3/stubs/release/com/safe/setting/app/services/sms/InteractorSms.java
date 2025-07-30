package com.safe.setting.app.services.sms;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u0014*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/safe/setting/app/services/sms/InteractorSms;", "S", "Lcom/safe/setting/app/services/sms/InterfaceServiceSms;", "Lcom/safe/setting/app/services/base/BaseInteractorService;", "Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;", "context", "Landroid/content/Context;", "firebase", "Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;)V", "hasSmsPermission", "", "hasUserConsent", "setPushSms", "", "smsAddress", "", "smsBody", "type", "", "Companion", "app_release"})
public final class InteractorSms<S extends com.safe.setting.app.services.sms.InterfaceServiceSms> extends com.safe.setting.app.services.base.BaseInteractorService<S> implements com.safe.setting.app.services.sms.InterfaceInteractorSms<S> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "InteractorSms";
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.services.sms.InteractorSms.Companion Companion = null;
    
    @javax.inject.Inject()
    public InteractorSms(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void setPushSms(@org.jetbrains.annotations.NotNull()
    java.lang.String smsAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String smsBody, int type) {
    }
    
    private final boolean hasUserConsent() {
        return false;
    }
    
    private final boolean hasSmsPermission() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/safe/setting/app/services/sms/InteractorSms$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}