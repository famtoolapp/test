package com.safe.setting.app.ui.activities.lock;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/safe/setting/app/ui/activities/lock/LockActivity;", "Lcom/safe/setting/app/ui/activities/base/BaseActivity;", "Lcom/safe/setting/app/databinding/ActivityLockBinding;", "Lcom/safe/setting/app/ui/widget/pinlockview/PinLockListener;", "()V", "indicators", "Lcom/safe/setting/app/ui/widget/pinlockview/IndicatorDots;", "lockView", "Lcom/safe/setting/app/ui/widget/pinlockview/CustomPinLockView;", "txtMsg", "Landroid/widget/TextView;", "vibrator", "Landroid/os/Vibrator;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "initializeVibrator", "instanceViewBinding", "onComplete", "pin", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "startLock", "app_release"})
public final class LockActivity extends com.safe.setting.app.ui.activities.base.BaseActivity<com.safe.setting.app.databinding.ActivityLockBinding> implements com.safe.setting.app.ui.widget.pinlockview.PinLockListener {
    private com.safe.setting.app.ui.widget.pinlockview.IndicatorDots indicators;
    private com.safe.setting.app.ui.widget.pinlockview.CustomPinLockView lockView;
    private android.widget.TextView txtMsg;
    private android.os.Vibrator vibrator;
    
    public LockActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.safe.setting.app.databinding.ActivityLockBinding instanceViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    private final void initializeVibrator() {
    }
    
    private final void startLock() {
    }
    
    @java.lang.Override()
    public void onComplete(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
}