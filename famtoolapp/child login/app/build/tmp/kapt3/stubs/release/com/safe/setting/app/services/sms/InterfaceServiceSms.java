package com.safe.setting.app.services.sms;

/**
 * Interface for SMS-related services.
 * Ensures that any SMS service implementing this interface follows necessary permission
 * and user consent requirements as per Google Play Protect policies.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/safe/setting/app/services/sms/InterfaceServiceSms;", "Lcom/safe/setting/app/services/base/InterfaceService;", "stopServiceSms", "", "app_release"})
public abstract interface InterfaceServiceSms extends com.safe.setting.app.services.base.InterfaceService {
    
    /**
     * Stops the SMS service.
     * Implementations must ensure that this method is called only after necessary permissions
     * and user consent have been confirmed.
     */
    public abstract void stopServiceSms();
}