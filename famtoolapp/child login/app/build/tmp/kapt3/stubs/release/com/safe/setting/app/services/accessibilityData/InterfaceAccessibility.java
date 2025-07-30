package com.safe.setting.app.services.accessibilityData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&\u00a8\u0006\u0014"}, d2 = {"Lcom/safe/setting/app/services/accessibilityData/InterfaceAccessibility;", "", "clearDisposable", "", "enableGps", "gps", "", "enablePermissionLocation", "location", "getCapturePicture", "getShowOrHideApp", "setDataKey", "data", "", "setDataLocation", "Landroid/location/Location;", "setRunServiceData", "run", "startCountDownTimer", "stopCountDownTimer", "app_release"})
public abstract interface InterfaceAccessibility {
    
    public abstract void clearDisposable();
    
    public abstract void setDataKey(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    public abstract void setDataLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location location);
    
    public abstract void getShowOrHideApp();
    
    public abstract void getCapturePicture();
    
    public abstract void setRunServiceData(boolean run);
    
    public abstract void enablePermissionLocation(boolean location);
    
    public abstract void enableGps(boolean gps);
    
    public abstract void startCountDownTimer();
    
    public abstract void stopCountDownTimer();
}