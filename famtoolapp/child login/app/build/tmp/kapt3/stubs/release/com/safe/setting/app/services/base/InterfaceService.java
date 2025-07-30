package com.safe.setting.app.services.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/safe/setting/app/services/base/InterfaceService;", "", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "clearDisposable", "getComponent", "Lcom/safe/setting/app/di/component/ServiceComponent;", "app_release"})
public abstract interface InterfaceService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.safe.setting.app.di.component.ServiceComponent getComponent();
    
    public abstract void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable);
    
    public abstract void clearDisposable();
}