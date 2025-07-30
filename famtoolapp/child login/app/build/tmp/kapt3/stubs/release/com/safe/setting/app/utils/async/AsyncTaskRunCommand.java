package com.safe.setting.app.utils.async;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B>\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/safe/setting/app/utils/async/AsyncTaskRunCommand;", "", "onPreFunc", "Lkotlin/Function0;", "", "onPostFunc", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "execute", "command", "", "executeCommandWithRoot", "Lcom/safe/setting/app/utils/async/Result;", "app_release"})
public final class AsyncTaskRunCommand {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPreFunc = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onPostFunc = null;
    
    public AsyncTaskRunCommand(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPreFunc, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onPostFunc) {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    public final void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String command) {
    }
    
    private final com.safe.setting.app.utils.async.Result executeCommandWithRoot(java.lang.String command) {
        return null;
    }
    
    public AsyncTaskRunCommand() {
        super();
    }
}