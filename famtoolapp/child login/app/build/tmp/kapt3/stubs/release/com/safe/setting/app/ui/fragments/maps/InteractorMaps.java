package com.safe.setting.app.ui.fragments.maps;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/safe/setting/app/ui/fragments/maps/InteractorMaps;", "V", "Lcom/safe/setting/app/ui/fragments/maps/InterfaceViewMaps;", "Lcom/safe/setting/app/ui/activities/base/BaseInteractor;", "Lcom/safe/setting/app/ui/fragments/maps/InterfaceInteractorMaps;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;)V", "valueEventEnableGps", "", "valueEventEnablePermission", "valueEventLocation", "app_release"})
public final class InteractorMaps<V extends com.safe.setting.app.ui.fragments.maps.InterfaceViewMaps> extends com.safe.setting.app.ui.activities.base.BaseInteractor<V> implements com.safe.setting.app.ui.fragments.maps.InterfaceInteractorMaps<V> {
    
    @javax.inject.Inject()
    public InteractorMaps(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.safe.setting.app.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void valueEventLocation() {
    }
    
    @java.lang.Override()
    public void valueEventEnableGps() {
    }
    
    @java.lang.Override()
    public void valueEventEnablePermission() {
    }
}