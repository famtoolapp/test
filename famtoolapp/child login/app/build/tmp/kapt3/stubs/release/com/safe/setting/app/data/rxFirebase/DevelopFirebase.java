package com.safe.setting.app.data.rxFirebase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016JG\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016JG\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u001fR\u00020 0\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016H\u0016J&\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000eH\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020%0/2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020%0/H\u0016J.\u00101\u001a\b\u0012\u0004\u0012\u0002H20/\"\b\b\u0000\u00102*\u0002032\u0006\u0010\r\u001a\u00020\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/safe/setting/app/data/rxFirebase/DevelopFirebase;", "Lcom/safe/setting/app/data/rxFirebase/InterfaceFirebase;", "context", "Landroid/content/Context;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "dataRef", "Lcom/google/firebase/database/DatabaseReference;", "stoRef", "Lcom/google/firebase/storage/StorageReference;", "(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/database/DatabaseReference;Lcom/google/firebase/storage/StorageReference;)V", "getDatabaseAcount", "getDatabaseReference", "child", "", "getFile", "Lio/reactivex/rxjava3/core/Single;", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "file", "Ljava/io/File;", "progress", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "getStorageReference", "getUser", "Lcom/google/firebase/auth/FirebaseUser;", "putFile", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "uri", "Landroid/net/Uri;", "queryValueEventSingle", "Lio/reactivex/rxjava3/core/Maybe;", "Lcom/google/firebase/database/DataSnapshot;", "value", "id", "signIn", "Lcom/google/firebase/auth/AuthResult;", "email", "password", "signOut", "signUp", "valueEvent", "Lio/reactivex/rxjava3/core/Flowable;", "valueEventAccount", "valueEventModel", "T", "", "clazz", "Ljava/lang/Class;", "app_release"})
public final class DevelopFirebase implements com.safe.setting.app.data.rxFirebase.InterfaceFirebase {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.DatabaseReference dataRef = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.storage.StorageReference stoRef = null;
    
    @javax.inject.Inject()
    public DevelopFirebase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference dataRef, @org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference stoRef) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.google.firebase.auth.FirebaseUser getUser() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Maybe<com.google.firebase.auth.AuthResult> signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Maybe<com.google.firebase.auth.AuthResult> signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override()
    public void signOut() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.database.DatabaseReference getDatabaseReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.database.DatabaseReference getDatabaseAcount() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.storage.StorageReference getStorageReference(@org.jetbrains.annotations.NotNull()
    java.lang.String child) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Flowable<com.google.firebase.database.DataSnapshot> valueEventAccount() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Flowable<com.google.firebase.database.DataSnapshot> valueEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String child) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public <T extends java.lang.Object>io.reactivex.rxjava3.core.Flowable<T> valueEventModel(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Single<com.google.firebase.storage.FileDownloadTask.TaskSnapshot> getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Single<com.google.firebase.storage.UploadTask.TaskSnapshot> putFile(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progress) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.rxjava3.core.Maybe<com.google.firebase.database.DataSnapshot> queryValueEventSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}