package com.safe.setting.app.data.rxFirebase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0014*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0001\u0014B\u0015\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0013R\u0016\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/safe/setting/app/data/rxFirebase/RxTask;", "T", "", "Lcom/google/android/gms/tasks/OnSuccessListener;", "Lcom/google/android/gms/tasks/OnFailureListener;", "Lcom/google/android/gms/tasks/OnCompleteListener;", "emitter", "Lio/reactivex/rxjava3/core/MaybeEmitter;", "(Lio/reactivex/rxjava3/core/MaybeEmitter;)V", "onComplete", "", "task", "Lcom/google/android/gms/tasks/Task;", "onFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "res", "(Ljava/lang/Object;)V", "Companion", "app_release"})
public final class RxTask<T extends java.lang.Object> implements com.google.android.gms.tasks.OnSuccessListener<T>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCompleteListener<T> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.core.MaybeEmitter<? super T> emitter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.data.rxFirebase.RxTask.Companion Companion = null;
    
    public RxTask(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.MaybeEmitter<? super T> emitter) {
        super();
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.Nullable()
    T res) {
    }
    
    @java.lang.Override()
    public void onComplete(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.tasks.Task<T> task) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\u00a8\u0006\n"}, d2 = {"Lcom/safe/setting/app/data/rxFirebase/RxTask$Companion;", "", "()V", "assignOnTask", "", "T", "emitter", "Lio/reactivex/rxjava3/core/MaybeEmitter;", "task", "Lcom/google/android/gms/tasks/Task;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final <T extends java.lang.Object>void assignOnTask(@org.jetbrains.annotations.NotNull()
        io.reactivex.rxjava3.core.MaybeEmitter<? super T> emitter, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.tasks.Task<T> task) {
        }
    }
}