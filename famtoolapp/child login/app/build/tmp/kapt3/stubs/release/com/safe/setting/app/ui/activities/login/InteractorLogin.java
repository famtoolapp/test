package com.safe.setting.app.ui.activities.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/safe/setting/app/ui/activities/login/InteractorLogin;", "V", "Lcom/safe/setting/app/ui/activities/login/InterfaceViewLogin;", "Lcom/safe/setting/app/ui/activities/base/BaseInteractor;", "Lcom/safe/setting/app/ui/activities/login/InterfaceInteractorLogin;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;)V", "signInDisposable", "", "email", "", "pass", "app_release"})
public final class InteractorLogin<V extends com.safe.setting.app.ui.activities.login.InterfaceViewLogin> extends com.safe.setting.app.ui.activities.base.BaseInteractor<V> implements com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin<V> {
    
    @javax.inject.Inject()
    public InteractorLogin(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void signInDisposable(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
    }
}