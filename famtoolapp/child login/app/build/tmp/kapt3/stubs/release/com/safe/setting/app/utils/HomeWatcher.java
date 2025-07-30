package com.safe.setting.app.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/safe/setting/app/utils/HomeWatcher;", "", "mContext", "Landroid/content/Context;", "listener", "Lcom/safe/setting/app/utils/HomeWatcher$OnHomePressedListener;", "(Landroid/content/Context;Lcom/safe/setting/app/utils/HomeWatcher$OnHomePressedListener;)V", "mReceiver", "Lcom/safe/setting/app/utils/HomeWatcher$InnerReceiver;", "startWatch", "", "stopWatch", "InnerReceiver", "OnHomePressedListener", "app_release"})
public final class HomeWatcher {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.safe.setting.app.utils.HomeWatcher.OnHomePressedListener listener = null;
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.utils.HomeWatcher.InnerReceiver mReceiver;
    
    public HomeWatcher(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.utils.HomeWatcher.OnHomePressedListener listener) {
        super();
    }
    
    public final void startWatch() {
    }
    
    public final void stopWatch() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/safe/setting/app/utils/HomeWatcher$InnerReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/safe/setting/app/utils/HomeWatcher;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
    public final class InnerReceiver extends android.content.BroadcastReceiver {
        
        public InnerReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/safe/setting/app/utils/HomeWatcher$OnHomePressedListener;", "", "onHomePressed", "", "onRecentApps", "app_release"})
    public static abstract interface OnHomePressedListener {
        
        public abstract void onHomePressed();
        
        public abstract void onRecentApps();
    }
}