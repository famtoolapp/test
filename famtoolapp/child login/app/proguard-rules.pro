# Add project specific ProGuard rules here.
# Gson
-dontwarn com.daimajia.easing.Glider
-dontwarn com.daimajia.easing.Skill
#noinspection ShrinkerUnresolvedReference
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.examples.android.model.** { *; }

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.AppGlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

# Picasso
-dontwarn com.squareup.okhttp.**
-dontwarn com.squareup.picasso.**
-keepclasseswithmembers class * {
    #noinspection ShrinkerUnresolvedReference
    @com.squareup.picasso.Picasso$OkHttp3Downloader <init>(...);
}
-keepclasseswithmembers class * {
    #noinspection ShrinkerUnresolvedReference
    @com.squareup.picasso.Picasso$UrlConnectionDownloader <init>(...);
}

# RxJava
-dontwarn sun.misc.**
-dontwarn javax.lang.**
-dontwarn org.apache.commons.logging.**
-keepclassmembers,allowobfuscation class rx.internal.util.unsafe.*ArrayQueue*Field* {
    long producerIndex;
    long consumerIndex;
}

# RxPermissions
-dontwarn com.tbruyelle.rxpermissions2.**
-keep class com.tbruyelle.rxpermissions2.** { *; }

# Dagger
-dontwarn javax.annotation.**
-keep class dagger.* { *; }
-keep class **$$ModuleAdapter { *; }
-keep class **$$InjectAdapter { *; }
-keep class **$$StaticInjection { *; }
-keep class **$$ViewInjector { *; }

# RxBinding
-dontwarn com.jakewharton.rxbinding2.**
-keep class com.jakewharton.rxbinding2.** { *; }

# RxKotlin and RxAndroid
-dontwarn sun.misc.**
-dontwarn rx.**
-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
    long producerIndex;
    long consumerIndex;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
    #noinspection ShrinkerUnresolvedReference
    rx.internal.util.atomic.LinkedQueueNode producerNode;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
    #noinspection ShrinkerUnresolvedReference
    rx.internal.util.atomic.LinkedQueueNode consumerNode;
}
-keepnames class io.reactivex.Observable {*;}
-keepnames class io.reactivex.Observer {*;}
-keepnames class io.reactivex.disposables.Disposable {*;}
-keepclassmembers class io.reactivex.functions.Function{*;}
-keepclassmembers class io.reactivex.internal.util.*{*;}

# Android Device Names
-keep class com.jaredrummler.android.device.DeviceName { *; }

# Your custom classes, if any
-keep class com.safe.setting.app.** { *; }

# Keep all fields annotated with @Keep
-keepclassmembers class * {
    #noinspection ShrinkerUnresolvedReference
    @com.safe.setting.app.utils.Keep *;
}

# Keep all methods in classes extending android.app.Activity
-keepclassmembers class * extends android.app.Activity {
    public void *(android.view.View);
}

# Keep all methods in classes extending android.app.Application
-keepclassmembers class * extends android.app.Application {
    public void onCreate();
}

# Keep the entry points of the application
#-keep class com.home.demo15.app.utils.ConstFun { *; }

-keep class com.safe.setting.app.ui.activities.login.LoginActivity { *; }
-keep class com.safe.setting.app.ui.activities.mainparent.MainParentActivity { *; }
-keep class com.safe.setting.app.ui.fragments.maps.MapsFragment { *; }

# Keep the entry points of third-party libraries if needed

-keep class com.github.clans.fab.** { *; }
-keep class com.bumptech.glide.** { *; }
-keep class com.daimajia.androidanimations.library.** { *; }
-keep class com.pawegio.kandroid.** { *; }
-keep class cn.pedant.SweetAlert.** { *; }

#-android.debug.obsoleteApi=true
-keepattributes Signature
-keepattributes *Annotation*
-keepclassmembers class com.safe.setting.app.models.** {
  *;
}

# Keep all classes within the com.home.demo15.app.utils package
-keep class com.safe.setting.app.utils.** { *; }

# Keep Gson-related classes and methods
-keep class com.google.gson.** { *; }
-keep class com.google.gson.reflect.** { *; }
-keepclassmembers class * {
    @com.google.gson.annotations.* <fields>;
}

# Keep Glide-related classes and methods
-keep class com.bumptech.glide.** { *; }
-keep class * implements com.bumptech.glide.module.GlideModule
-keep public class * implements com.bumptech.glide.module.GlideModule
-keepclassmembers class * {
    @com.bumptech.glide.annotation.GlideOption <methods>;
    @com.bumptech.glide.annotation.GlideExtension <methods>;
}

# Keep SweetAlertDialog class and its methods
-keep class cn.pedant.SweetAlert.SweetAlertDialog { *; }

# Keep AsyncTask classes and methods
-keep class com.safe.setting.app.utils.async.AsyncTaskRootPermission { *; }
-keep class com.safe.setting.app.utils.async.AsyncTaskRunCommand { *; }

# Keep the custom toolbar class and its methods
-keep class com.safe.setting.app.ui.widget.toolbar.CustomToolbar { *; }

# Keep the constants interface and its methods
-keep class com.safe.setting.app.utils.Consts { *; }

# Keep the BuildConfig class
-keep class com.safe.setting.app.BuildConfig { *; }

# Keep the R class and its subclasses
-keep class com.safe.setting.app.R$* { *; }

# Keep Parcelable classes and methods
-keepclassmembers class * implements android.os.Parcelable {
  public static final ** CREATOR;
}

# Keep annotation classes and their methods
-keepattributes *Annotation

