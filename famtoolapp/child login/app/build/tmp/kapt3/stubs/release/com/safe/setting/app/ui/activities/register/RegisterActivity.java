package com.safe.setting.app.ui.activities.register;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0018H\u0014J\u001a\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/safe/setting/app/ui/activities/register/RegisterActivity;", "Lcom/safe/setting/app/ui/activities/base/BaseActivity;", "Lcom/safe/setting/app/databinding/ActivityRegisterBinding;", "Lcom/safe/setting/app/ui/activities/register/InterfaceViewRegister;", "Lcom/safe/setting/app/utils/KeyboardUtils$SoftKeyboardToggleListener;", "()V", "btnHaveAccount", "Landroid/widget/TextView;", "btnSignUp", "Landroid/widget/Button;", "edtEmail", "Landroid/widget/EditText;", "edtNewChild", "edtPass", "edtPassRepeat", "interactor", "Lcom/safe/setting/app/ui/activities/register/InterfaceInteractorRegister;", "getInteractor", "()Lcom/safe/setting/app/ui/activities/register/InterfaceInteractorRegister;", "setInteractor", "(Lcom/safe/setting/app/ui/activities/register/InterfaceInteractorRegister;)V", "scroll", "Landroid/widget/ScrollView;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "failedResult", "throwable", "", "instanceViewBinding", "login", "onClickRegister", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onToggleSoftKeyboard", "isVisible", "successResult", "result", "filter", "app_release"})
public final class RegisterActivity extends com.safe.setting.app.ui.activities.base.BaseActivity<com.safe.setting.app.databinding.ActivityRegisterBinding> implements com.safe.setting.app.ui.activities.register.InterfaceViewRegister, com.safe.setting.app.utils.KeyboardUtils.SoftKeyboardToggleListener {
    private android.widget.EditText edtNewChild;
    private android.widget.EditText edtEmail;
    private android.widget.EditText edtPass;
    private android.widget.EditText edtPassRepeat;
    private android.widget.Button btnSignUp;
    private android.widget.TextView btnHaveAccount;
    private android.widget.ScrollView scroll;
    @javax.inject.Inject()
    public com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister<com.safe.setting.app.ui.activities.register.InterfaceViewRegister> interactor;
    
    public RegisterActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister<com.safe.setting.app.ui.activities.register.InterfaceViewRegister> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister<com.safe.setting.app.ui.activities.register.InterfaceViewRegister> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.safe.setting.app.databinding.ActivityRegisterBinding instanceViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onToggleSoftKeyboard(boolean isVisible) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void onClickRegister() {
    }
    
    private final void login() {
    }
    
    @java.lang.Override()
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
}