package com.safe.setting.app.ui.activities.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 i*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001iB\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u0010\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0002J\r\u0010-\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020#J\u0012\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u000102H\u0014J*\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0016J*\u00109\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0016J\b\u0010:\u001a\u00020\u001bH\u0014J\b\u0010;\u001a\u00020\u001bH\u0016J\u0010\u0010\u0014\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020#H\u0002J\u000e\u0010=\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020#J\u0010\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u0013H\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J\b\u0010A\u001a\u00020\u001bH\u0016J\u0012\u0010B\u001a\u00020\u001b2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J0\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u0002082\u0006\u0010K\u001a\u000208H\u0016JR\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u0002082\u0006\u0010I\u001a\u0002082\b\u0010N\u001a\u0004\u0018\u00010 2\b\u0010O\u001a\u0004\u0018\u0001082\u0006\u0010P\u001a\u00020\u00132\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0Q\u00a2\u0006\u0002\bRH\u0016\u00a2\u0006\u0002\u0010SJ\u0010\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020 H\u0016J\u0010\u0010V\u001a\u00020\u001b2\u0006\u0010U\u001a\u000208H\u0016J\u0010\u0010V\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020 H\u0016J\u0018\u0010W\u001a\u00020\u001b2\u0006\u0010U\u001a\u0002082\u0006\u0010X\u001a\u00020YH\u0016J\u0018\u0010W\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020 2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\\H\u0002J\u000e\u0010]\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\\J.\u0010^\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020 2\u0006\u0010b\u001a\u00020 2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0dH\u0016J\u0018\u0010e\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020\u00132\u0006\u0010g\u001a\u00020\u0013H\u0016J\u0006\u0010h\u001a\u00020\u001bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006j"}, d2 = {"Lcom/safe/setting/app/ui/activities/base/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/safe/setting/app/ui/activities/base/InterfaceView;", "Lcom/safe/setting/app/ui/fragments/base/BaseFragment$Callback;", "()V", "alertDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "emailObservable", "Lio/reactivex/rxjava3/core/Observable;", "", "passObservable", "rxPermissions", "Lcom/tbruyelle/rxpermissions3/RxPermissions;", "signInEnabled", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "changeChild", "fragmentTag", "", "clearDisposable", "edtEmail", "Landroid/widget/EditText;", "emailValidationObservable", "failedResult", "throwable", "", "getComponent", "Lcom/safe/setting/app/di/component/ActivityComponent;", "getPermissions", "hideDialog", "initializeActivityComponent", "instanceViewBinding", "newChildValidationObservable", "newChild", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "key", "child", "file", "position", "", "onItemLongClick", "onResume", "openDrawer", "edtPass", "passValidationObservable", "setActionToolbar", "action", "setDrawerLock", "setDrawerUnLock", "setMenu", "menu", "Landroidx/appcompat/widget/PopupMenu;", "setToolbar", "toolbar", "Lcom/safe/setting/app/ui/widget/toolbar/CustomToolbar;", "showSearch", "title", "showItemMenu", "hint", "showDialog", "alertType", "msg", "txtPositiveButton", "cancellable", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "showError", "message", "showMessage", "showSnackbar", "v", "Landroid/view/View;", "signInEnableObservable", "btnSignIn", "Landroid/widget/Button;", "signInValidationObservable", "subscribePermission", "permission", "Lcom/tbruyelle/rxpermissions3/Permission;", "msgRationale", "msgDenied", "granted", "Lkotlin/Function0;", "successResult", "result", "filter", "windowLightStatusBar", "Companion", "app_release"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity implements com.safe.setting.app.ui.activities.base.InterfaceView, com.safe.setting.app.ui.fragments.base.BaseFragment.Callback {
    @org.jetbrains.annotations.Nullable()
    private cn.pedant.SweetAlert.SweetAlertDialog alertDialog;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable;
    @org.jetbrains.annotations.Nullable()
    private com.tbruyelle.rxpermissions3.RxPermissions rxPermissions;
    private com.google.android.material.snackbar.Snackbar snackbar;
    @org.jetbrains.annotations.Nullable()
    private static com.safe.setting.app.di.component.ActivityComponent activityComponent;
    private io.reactivex.rxjava3.core.Observable<java.lang.Boolean> emailObservable;
    private io.reactivex.rxjava3.core.Observable<java.lang.Boolean> passObservable;
    private io.reactivex.rxjava3.core.Observable<java.lang.Boolean> signInEnabled;
    protected VB binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.ui.activities.base.BaseActivity.Companion Companion = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.safe.setting.app.di.component.ActivityComponent getActivityComponent() {
        return null;
    }
    
    public static final void setActivityComponent(@org.jetbrains.annotations.Nullable()
    com.safe.setting.app.di.component.ActivityComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB instanceViewBinding();
    
    public final void windowLightStatusBar() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initializeActivityComponent() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.safe.setting.app.di.component.ActivityComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.tbruyelle.rxpermissions3.RxPermissions getPermissions() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribePermission(@org.jetbrains.annotations.NotNull()
    com.tbruyelle.rxpermissions3.Permission permission, @org.jetbrains.annotations.NotNull()
    java.lang.String msgRationale, @org.jetbrains.annotations.NotNull()
    java.lang.String msgDenied, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> granted) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public cn.pedant.SweetAlert.SweetAlertDialog showDialog(int alertType, int title, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer txtPositiveButton, boolean cancellable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super cn.pedant.SweetAlert.SweetAlertDialog, kotlin.Unit> action) {
        return null;
    }
    
    @java.lang.Override()
    public void hideDialog() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(int message) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showSnackbar(int message, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void showSnackbar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.disposables.Disposable newChildValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText newChild) {
        return null;
    }
    
    /**
     * Email validation
     */
    public final void emailValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText edtEmail) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable emailObservable(android.widget.EditText edtEmail) {
        return null;
    }
    
    /**
     * Password validation
     */
    public final void passValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.EditText edtPass) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable passObservable(android.widget.EditText edtPass) {
        return null;
    }
    
    /**
     * Sign In observer
     */
    public final void signInValidationObservable(@org.jetbrains.annotations.NotNull()
    android.widget.Button btnSignIn) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable signInEnableObservable(android.widget.Button btnSignIn) {
        return null;
    }
    
    @java.lang.Override()
    public void setActionToolbar(boolean action) {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    @java.lang.Override()
    public void onItemLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    @java.lang.Override()
    public void setDrawerLock() {
    }
    
    @java.lang.Override()
    public void setDrawerUnLock() {
    }
    
    @java.lang.Override()
    public void openDrawer() {
    }
    
    @java.lang.Override()
    public void setMenu(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.PopupMenu menu) {
    }
    
    @java.lang.Override()
    public void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    @java.lang.Override()
    public void setToolbar(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.widget.toolbar.CustomToolbar toolbar, boolean showSearch, int title, int showItemMenu, int hint) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/safe/setting/app/ui/activities/base/BaseActivity$Companion;", "", "()V", "activityComponent", "Lcom/safe/setting/app/di/component/ActivityComponent;", "getActivityComponent$annotations", "getActivityComponent", "()Lcom/safe/setting/app/di/component/ActivityComponent;", "setActivityComponent", "(Lcom/safe/setting/app/di/component/ActivityComponent;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.safe.setting.app.di.component.ActivityComponent getActivityComponent() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getActivityComponent$annotations() {
        }
        
        public final void setActivityComponent(@org.jetbrains.annotations.Nullable()
        com.safe.setting.app.di.component.ActivityComponent p0) {
        }
    }
}