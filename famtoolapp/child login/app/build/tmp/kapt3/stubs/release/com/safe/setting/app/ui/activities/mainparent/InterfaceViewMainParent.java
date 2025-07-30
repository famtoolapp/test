package com.safe.setting.app.ui.activities.mainparent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/safe/setting/app/ui/activities/mainparent/InterfaceViewMainParent;", "Lcom/safe/setting/app/ui/activities/base/InterfaceView;", "closeNavigationDrawer", "", "onFinishCount", "requestApplyInsets", "setCheckedNavigationItem", "id", "", "setDataAccounts", "data", "Lcom/google/firebase/database/DataSnapshot;", "signOutView", "app_release"})
public abstract interface InterfaceViewMainParent extends com.safe.setting.app.ui.activities.base.InterfaceView {
    
    public abstract void signOutView();
    
    public abstract void onFinishCount();
    
    public abstract void setCheckedNavigationItem(int id);
    
    public abstract void closeNavigationDrawer();
    
    public abstract void requestApplyInsets();
    
    public abstract void setDataAccounts(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot data);
}