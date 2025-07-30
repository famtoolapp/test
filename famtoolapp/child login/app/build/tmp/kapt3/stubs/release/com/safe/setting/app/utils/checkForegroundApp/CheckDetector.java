package com.safe.setting.app.utils.checkForegroundApp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/safe/setting/app/utils/checkForegroundApp/CheckDetector;", "", "getForegroundPostLollipop", "", "context", "Landroid/content/Context;", "getForegroundPreLollipop", "app_release"})
public abstract interface CheckDetector {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getForegroundPostLollipop(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getForegroundPreLollipop(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}