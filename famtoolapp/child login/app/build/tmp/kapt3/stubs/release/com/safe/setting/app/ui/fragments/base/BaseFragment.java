package com.safe.setting.app.ui.fragments.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\r\u0010!\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u0012\u0010*\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J*\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\rH\u0016J*\u00109\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\rH\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%H\u0016J0\u0010@\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0016JR\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010\u00172\b\u0010I\u001a\u0004\u0018\u00010\r2\u0006\u0010J\u001a\u00020%2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00120K\u00a2\u0006\u0002\bLH\u0016\u00a2\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0017H\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\rH\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0017H\u0016J\u0018\u0010Q\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\r2\u0006\u0010R\u001a\u00020.H\u0016J\u0018\u0010Q\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00172\u0006\u0010R\u001a\u00020.H\u0016J.\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00172\u0006\u0010W\u001a\u00020\u00172\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00120YH\u0016J\u0018\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020%2\u0006\u0010\\\u001a\u00020%H\u0016R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lcom/safe/setting/app/ui/fragments/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/safe/setting/app/ui/activities/base/InterfaceView;", "Lcom/safe/setting/app/ui/widget/toolbar/CustomToolbar$OnToolbarActionListener;", "Lcom/safe/setting/app/ui/fragments/base/IOnFragmentListener;", "()V", "baseActivity", "Lcom/safe/setting/app/ui/activities/base/BaseActivity;", "binding", "Landroidx/viewbinding/ViewBinding;", "hintInt", "", "titleInt", "toolbar", "Lcom/safe/setting/app/ui/widget/toolbar/CustomToolbar;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "changeChild", "fragmentTag", "", "clearDisposable", "failedResult", "throwable", "", "getComponent", "Lcom/safe/setting/app/di/component/ActivityComponent;", "getPermissions", "Lcom/tbruyelle/rxpermissions3/RxPermissions;", "hideDialog", "instanceViewBinding", "()Landroidx/viewbinding/ViewBinding;", "onActionStateChanged", "enabled", "", "onBackPressed", "onButtonClicked", "buttonCode", "onChangeHeight", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onHideFragment", "onItemClick", "key", "child", "file", "position", "onItemLongClick", "onSearchConfirmed", "text", "", "onSearchStateChanged", "setActionToolbar", "action", "setToolbar", "showSearch", "title", "showItemMenu", "hint", "showDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "alertType", "msg", "txtPositiveButton", "cancellable", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(IILjava/lang/String;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;)Lcn/pedant/SweetAlert/SweetAlertDialog;", "showError", "message", "showMessage", "showSnackbar", "v", "subscribePermission", "permission", "Lcom/tbruyelle/rxpermissions3/Permission;", "msgRationale", "msgDenied", "granted", "Lkotlin/Function0;", "successResult", "result", "filter", "Callback", "app_release"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment implements com.safe.setting.app.ui.activities.base.InterfaceView, com.safe.setting.app.ui.widget.toolbar.CustomToolbar.OnToolbarActionListener, com.safe.setting.app.ui.fragments.base.IOnFragmentListener {
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.ui.widget.toolbar.CustomToolbar toolbar;
    private int titleInt = 0;
    private int hintInt = 0;
    private VB binding;
    private com.safe.setting.app.ui.activities.base.BaseActivity<?> baseActivity;
    
    public BaseFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB instanceViewBinding();
    
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
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(int message) {
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
    public void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void clearDisposable() {
    }
    
    @java.lang.Override()
    public void changeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag) {
    }
    
    @java.lang.Override()
    public void setToolbar(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.widget.toolbar.CustomToolbar toolbar, boolean showSearch, int title, int showItemMenu, int hint) {
    }
    
    @java.lang.Override()
    public void onSearchStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
    }
    
    @java.lang.Override()
    public void onActionStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public void setActionToolbar(boolean action) {
    }
    
    @java.lang.Override()
    public void onChangeHeight() {
    }
    
    @java.lang.Override()
    public void onHideFragment() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/safe/setting/app/ui/fragments/base/BaseFragment$Callback;", "", "openDrawer", "", "setDrawerLock", "setDrawerUnLock", "setMenu", "menu", "Landroidx/appcompat/widget/PopupMenu;", "app_release"})
    public static abstract interface Callback {
        
        public abstract void setDrawerLock();
        
        public abstract void setDrawerUnLock();
        
        public abstract void openDrawer();
        
        public abstract void setMenu(@org.jetbrains.annotations.Nullable()
        androidx.appcompat.widget.PopupMenu menu);
    }
}