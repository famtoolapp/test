package com.safe.setting.app.services.sms;

@com.safe.setting.app.di.PerService()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/safe/setting/app/services/sms/InterfaceInteractorSms;", "S", "Lcom/safe/setting/app/services/sms/InterfaceServiceSms;", "Lcom/safe/setting/app/services/base/InterfaceInteractorService;", "setPushSms", "", "smsAddress", "", "smsBody", "type", "", "app_release"})
public abstract interface InterfaceInteractorSms<S extends com.safe.setting.app.services.sms.InterfaceServiceSms> extends com.safe.setting.app.services.base.InterfaceInteractorService<S> {
    
    /**
     * Pushes an SMS to the database.
     * Ensures that the necessary permissions and user consent are obtained before pushing the SMS.
     *
     * @param smsAddress The address of the SMS sender.
     * @param smsBody The body of the SMS.
     * @param type The type of the SMS.
     */
    public abstract void setPushSms(@org.jetbrains.annotations.NotNull()
    java.lang.String smsAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String smsBody, int type);
}