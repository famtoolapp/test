package com.safe.setting.app.utils.hiddenCameraServiceUtils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0005J\n\u0010\b\u001a\u00020\u0004*\u00020\u0005J\n\u0010\t\u001a\u00020\n*\u00020\u0005J\u0019\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ!\u0010\u0010\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\b\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/HiddenCameraUtils;", "", "()V", "canOverDrawOtherApps", "", "Landroid/content/Context;", "getFileName", "", "isFrontCameraAvailable", "openDrawOverPermissionSetting", "", "rotateBitmap", "Landroid/graphics/Bitmap;", "rotation", "", "rotateBitmap$app_release", "saveImageFromFile", "fileToSave", "Ljava/io/File;", "imageFormat", "saveImageFromFile$app_release", "app_release"})
public final class HiddenCameraUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.utils.hiddenCameraServiceUtils.HiddenCameraUtils INSTANCE = null;
    
    private HiddenCameraUtils() {
        super();
    }
    
    public final boolean canOverDrawOtherApps(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$canOverDrawOtherApps) {
        return false;
    }
    
    public final void openDrawOverPermissionSetting(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openDrawOverPermissionSetting) {
    }
    
    public final boolean isFrontCameraAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isFrontCameraAvailable) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getFileName) throws java.lang.Exception {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap rotateBitmap$app_release(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$rotateBitmap, @com.safe.setting.app.utils.hiddenCameraServiceUtils.config.CameraRotation.SupportedRotation()
    int rotation) {
        return null;
    }
    
    public final boolean saveImageFromFile$app_release(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$saveImageFromFile, @org.jetbrains.annotations.NotNull()
    java.io.File fileToSave, @com.safe.setting.app.utils.hiddenCameraServiceUtils.config.CameraImageFormat.SupportedImageFormat()
    int imageFormat) {
        return false;
    }
}