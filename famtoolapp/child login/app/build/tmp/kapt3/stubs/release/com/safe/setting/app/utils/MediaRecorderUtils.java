package com.safe.setting.app.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0014\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/safe/setting/app/utils/MediaRecorderUtils;", "Landroid/media/MediaRecorder;", "errorAction", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "(Lkotlin/jvm/functions/Function0;Landroid/content/Context;)V", "startRecording", "audioSource", "", "fileName", "", "stopRecording", "sendFile", "app_release"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
public final class MediaRecorderUtils extends android.media.MediaRecorder {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> errorAction = null;
    
    public MediaRecorderUtils(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> errorAction, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void startRecording(int audioSource, @org.jetbrains.annotations.Nullable()
    java.lang.String fileName) {
    }
    
    public final void stopRecording(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> sendFile) {
    }
}