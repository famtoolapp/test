package com.safe.setting.app.ui.activities.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0017H\u0014J\b\u0010\'\u001a\u00020\u0017H\u0014J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0017H\u0002J\u0018\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020*H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/safe/setting/app/ui/activities/login/LoginActivity;", "Lcom/safe/setting/app/ui/activities/base/BaseActivity;", "Lcom/safe/setting/app/databinding/ActivityLoginBinding;", "Lcom/safe/setting/app/ui/activities/login/InterfaceViewLogin;", "Lcom/safe/setting/app/utils/KeyboardUtils$SoftKeyboardToggleListener;", "()V", "btnSignIn", "Landroid/widget/Button;", "btnSignUp", "Landroid/widget/TextView;", "edtEmail", "Landroid/widget/EditText;", "edtNewChild", "edtPass", "interactor", "Lcom/safe/setting/app/ui/activities/login/InterfaceInteractorLogin;", "getInteractor", "()Lcom/safe/setting/app/ui/activities/login/InterfaceInteractorLogin;", "setInteractor", "(Lcom/safe/setting/app/ui/activities/login/InterfaceInteractorLogin;)V", "scroll", "Landroid/widget/ScrollView;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "checkData", "func", "Lkotlin/Function0;", "checkPermissionType", "failedResult", "throwable", "", "instanceViewBinding", "onClickLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onToggleSoftKeyboard", "isVisible", "", "signIn", "successResult", "result", "filter", "app_release"})
public final class LoginActivity extends com.safe.setting.app.ui.activities.base.BaseActivity<com.safe.setting.app.databinding.ActivityLoginBinding> implements com.safe.setting.app.ui.activities.login.InterfaceViewLogin, com.safe.setting.app.utils.KeyboardUtils.SoftKeyboardToggleListener {
    private android.widget.EditText edtEmail;
    private android.widget.EditText edtPass;
    private android.widget.Button btnSignIn;
    private android.widget.TextView btnSignUp;
    private android.widget.EditText edtNewChild;
    private android.widget.ScrollView scroll;
    @javax.inject.Inject()
    public com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin<com.safe.setting.app.ui.activities.login.InterfaceViewLogin> interactor;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin<com.safe.setting.app.ui.activities.login.InterfaceViewLogin> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin<com.safe.setting.app.ui.activities.login.InterfaceViewLogin> p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.safe.setting.app.databinding.ActivityLoginBinding instanceViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onToggleSoftKeyboard(boolean isVisible) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void onClickLogin() {
    }
    
    private final void checkData(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    private final void checkPermissionType(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    private final void signIn() {
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
}