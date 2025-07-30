package com.safe.setting.app.utils.async;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/safe/setting/app/utils/async/Result;", "", "()V", "<set-?>", "", "message", "getMessage", "()Ljava/lang/String;", "result", "", "getResult", "()Z", "", "statusCode", "getStatusCode", "()I", "Companion", "ResultBuilder", "ResultEnum", "app_release"})
public final class Result {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    private int statusCode = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.utils.async.Result.Companion Companion = null;
    
    private Result() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final boolean getResult() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/safe/setting/app/utils/async/Result$Companion;", "", "()V", "newBuilder", "Lcom/safe/setting/app/utils/async/Result$ResultBuilder;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder newBuilder() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0000J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0000J\u0006\u0010\u0015\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/safe/setting/app/utils/async/Result$ResultBuilder;", "", "()V", "inEnum", "Lcom/safe/setting/app/utils/async/Result$ResultEnum;", "build", "Lcom/safe/setting/app/utils/async/Result;", "setCommandFailed", "setCommandFailedDenied", "setCommandFailedInterrupted", "setCommandFailedTimeout", "setCommandSuccess", "setCustomMessage", "customMessage", "", "setFailed", "setInsallFailedNoSpace", "setInstallFailed", "setInstallFailedWrongCer", "setInstallFailedWrongContainer", "setInstallSuccess", "setUninstallFailed", "setUninstallSuccess", "app_release"})
    public static final class ResultBuilder {
        @org.jetbrains.annotations.Nullable()
        private com.safe.setting.app.utils.async.Result.ResultEnum inEnum;
        
        public ResultBuilder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCommandSuccess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCommandFailedTimeout() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCommandFailedDenied() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCommandFailedInterrupted() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCommandFailed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setInstallSuccess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setInsallFailedNoSpace() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setInstallFailedWrongContainer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setInstallFailedWrongCer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setInstallFailed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setUninstallSuccess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setUninstallFailed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setFailed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result.ResultBuilder setCustomMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String customMessage) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.safe.setting.app.utils.async.Result build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/safe/setting/app/utils/async/Result$ResultEnum;", "", "statusCode", "", "message", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "()I", "setCustomMessage", "", "customMessage", "COMMAND_SUCCESS", "COMMAND_FAILED_TIMEOUT", "COMMAND_FAILED_DENIED", "COMMAND_FAILED_INTERRUPTED", "COMMAND_FAILED", "INSTALL_SUCCESS", "INSTALL_FAILED_NOSPACE", "INSTALL_FAILED_WRONGCONTAINER", "INSTALL_FAILED_WRONGCER", "INSTALL_FIALED", "UNINSTALL_SUCCESS", "UNINSTALL_FAILED", "FAILED", "CUSTOM", "app_release"})
    public static enum ResultEnum {
        /*public static final*/ COMMAND_SUCCESS /* = new COMMAND_SUCCESS(0, null) */,
        /*public static final*/ COMMAND_FAILED_TIMEOUT /* = new COMMAND_FAILED_TIMEOUT(0, null) */,
        /*public static final*/ COMMAND_FAILED_DENIED /* = new COMMAND_FAILED_DENIED(0, null) */,
        /*public static final*/ COMMAND_FAILED_INTERRUPTED /* = new COMMAND_FAILED_INTERRUPTED(0, null) */,
        /*public static final*/ COMMAND_FAILED /* = new COMMAND_FAILED(0, null) */,
        /*public static final*/ INSTALL_SUCCESS /* = new INSTALL_SUCCESS(0, null) */,
        /*public static final*/ INSTALL_FAILED_NOSPACE /* = new INSTALL_FAILED_NOSPACE(0, null) */,
        /*public static final*/ INSTALL_FAILED_WRONGCONTAINER /* = new INSTALL_FAILED_WRONGCONTAINER(0, null) */,
        /*public static final*/ INSTALL_FAILED_WRONGCER /* = new INSTALL_FAILED_WRONGCER(0, null) */,
        /*public static final*/ INSTALL_FIALED /* = new INSTALL_FIALED(0, null) */,
        /*public static final*/ UNINSTALL_SUCCESS /* = new UNINSTALL_SUCCESS(0, null) */,
        /*public static final*/ UNINSTALL_FAILED /* = new UNINSTALL_FAILED(0, null) */,
        /*public static final*/ FAILED /* = new FAILED(0, null) */,
        /*public static final*/ CUSTOM /* = new CUSTOM(0, null) */;
        private final int statusCode = 0;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String message;
        
        ResultEnum(int statusCode, java.lang.String message) {
        }
        
        public final int getStatusCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final void setCustomMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String customMessage) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.safe.setting.app.utils.async.Result.ResultEnum> getEntries() {
            return null;
        }
    }
}