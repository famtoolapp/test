package com.safe.setting.app.utils.hiddenCameraServiceUtils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u000201H\u0002J0\u00102\u001a\u0002012\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u000206H\u0014J\u000e\u0010:\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010;\u001a\u000201J(\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020-2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0017J\u0010\u0010>\u001a\u0002012\u0006\u0010=\u001a\u00020-H\u0017J\u0010\u0010?\u001a\u0002012\u0006\u0010@\u001a\u00020-H\u0016J\u0006\u0010A\u001a\u000201R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraPreview;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "mCameraCallbacks", "Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraCallbacks;", "(Landroid/content/Context;Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraCallbacks;)V", "cameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "getCameraCaptureSession", "()Landroid/hardware/camera2/CameraCaptureSession;", "setCameraCaptureSession", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "cameraConfig", "Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraConfig;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "getCameraDevice", "()Landroid/hardware/camera2/CameraDevice;", "setCameraDevice", "(Landroid/hardware/camera2/CameraDevice;)V", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "capReq", "Landroid/hardware/camera2/CaptureRequest$Builder;", "getCapReq", "()Landroid/hardware/camera2/CaptureRequest$Builder;", "setCapReq", "(Landroid/hardware/camera2/CaptureRequest$Builder;)V", "handler22", "Landroid/os/Handler;", "getHandler22", "()Landroid/os/Handler;", "setHandler22", "(Landroid/os/Handler;)V", "handlerThread", "Landroid/os/HandlerThread;", "imageReader", "Landroid/media/ImageReader;", "getImageReader", "()Landroid/media/ImageReader;", "setImageReader", "(Landroid/media/ImageReader;)V", "mHolder", "Landroid/view/SurfaceHolder;", "getFrontFacingCameraId", "", "initSurfaceView", "", "onLayout", "b", "", "i", "", "i1", "i2", "i3", "startCameraInternal", "stopPreviewAndFreeCamera", "surfaceChanged", "surfaceHolder", "surfaceCreated", "surfaceDestroyed", "holder", "takePictureInternal", "Companion", "app_release"})
@android.annotation.SuppressLint(value = {"ViewConstructor"})
public final class CameraPreview extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    @org.jetbrains.annotations.NotNull()
    private final com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraCallbacks mCameraCallbacks = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.SurfaceHolder mHolder;
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraConfig cameraConfig;
    public android.hardware.camera2.CaptureRequest.Builder capReq;
    @org.jetbrains.annotations.NotNull()
    private android.hardware.camera2.CameraManager cameraManager;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler handler22;
    @org.jetbrains.annotations.NotNull()
    private android.os.HandlerThread handlerThread;
    public android.hardware.camera2.CameraCaptureSession cameraCaptureSession;
    public android.hardware.camera2.CameraDevice cameraDevice;
    public android.media.ImageReader imageReader;
    @org.jetbrains.annotations.Nullable()
    private static android.util.Size cameraSize;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cameraId = "0";
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraPreview.Companion Companion = null;
    
    public CameraPreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraCallbacks mCameraCallbacks) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.hardware.camera2.CaptureRequest.Builder getCapReq() {
        return null;
    }
    
    public final void setCapReq(@org.jetbrains.annotations.NotNull()
    android.hardware.camera2.CaptureRequest.Builder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler22() {
        return null;
    }
    
    public final void setHandler22(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.hardware.camera2.CameraCaptureSession getCameraCaptureSession() {
        return null;
    }
    
    public final void setCameraCaptureSession(@org.jetbrains.annotations.NotNull()
    android.hardware.camera2.CameraCaptureSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.hardware.camera2.CameraDevice getCameraDevice() {
        return null;
    }
    
    public final void setCameraDevice(@org.jetbrains.annotations.NotNull()
    android.hardware.camera2.CameraDevice p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.ImageReader getImageReader() {
        return null;
    }
    
    public final void setImageReader(@org.jetbrains.annotations.NotNull()
    android.media.ImageReader p0) {
    }
    
    private final void initSurfaceView() {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void surfaceCreated(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder surfaceHolder) {
    }
    
    @java.lang.Override()
    @kotlin.Suppress(names = {"DEPRECATION"})
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void surfaceChanged(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    }
    
    @java.lang.Override()
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    private final java.lang.String getFrontFacingCameraId() {
        return null;
    }
    
    public final void startCameraInternal(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.utils.hiddenCameraServiceUtils.CameraConfig cameraConfig) {
    }
    
    public final void takePictureInternal() {
    }
    
    public final void stopPreviewAndFreeCamera() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/safe/setting/app/utils/hiddenCameraServiceUtils/CameraPreview$Companion;", "", "()V", "cameraId", "", "getCameraId", "()Ljava/lang/String;", "setCameraId", "(Ljava/lang/String;)V", "cameraSize", "Landroid/util/Size;", "getCameraSize", "()Landroid/util/Size;", "setCameraSize", "(Landroid/util/Size;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.util.Size getCameraSize() {
            return null;
        }
        
        public final void setCameraSize(@org.jetbrains.annotations.Nullable()
        android.util.Size p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCameraId() {
            return null;
        }
        
        public final void setCameraId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}