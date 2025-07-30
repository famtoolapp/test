package com.safe.setting.app.ui.fragments.maps;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/safe/setting/app/ui/fragments/maps/InterfaceViewMaps;", "Lcom/safe/setting/app/ui/activities/base/InterfaceView;", "setLocation", "", "location", "Lcom/safe/setting/app/data/model/Location;", "setValuePermission", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "setValueState", "app_release"})
public abstract interface InterfaceViewMaps extends com.safe.setting.app.ui.activities.base.InterfaceView {
    
    public abstract void setLocation(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.data.model.Location location);
    
    public abstract void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void setValuePermission(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
}