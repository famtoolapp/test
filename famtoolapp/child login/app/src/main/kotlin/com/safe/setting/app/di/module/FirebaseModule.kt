package com.safe.setting.app.di.module

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.safe.setting.app.data.rxFirebase.DevelopFirebase
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
import com.safe.setting.app.utils.Keys // हमारे सुरक्षित Keys ऑब्जेक्ट को इम्पोर्ट करें
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule {

    @Provides
    @Singleton // यह सुनिश्चित करता है कि FirebaseApp का केवल एक इंस्टेंस बने
    fun provideFirebaseApp(context: Context): FirebaseApp {
        // NDK से सुरक्षित रूप से कीज़ (keys) प्राप्त करके FirebaseOptions ऑब्जेक्ट बनाएं
        val options = FirebaseOptions.Builder()
            .setApiKey(Keys.getGoogleApiKey())
            .setApplicationId(Keys.getGoogleAppId())
            .setDatabaseUrl(Keys.getFirebaseDatabaseUrl())
            .setStorageBucket(Keys.getGoogleStorageBucket())
            .setGcmSenderId(Keys.getGcmDefaultSenderId())
            .setProjectId(Keys.getProjectId())
            .build()

        // यदि डिफ़ॉल्ट ऐप पहले से मौजूद नहीं है, तो इसे इनिशियलाइज़ करें
        return FirebaseApp.getApps(context).find { it.name == FirebaseApp.DEFAULT_APP_NAME }
            ?: FirebaseApp.initializeApp(context, options)
    }

    @Provides
    fun provideInterfaceFirebase(context: Context, auth: FirebaseAuth, dataRef: DatabaseReference, stoRef: StorageReference): InterfaceFirebase = DevelopFirebase(context, auth, dataRef, stoRef)

    // अब सभी Firebase सेवाएं हमारे कस्टम FirebaseApp इंस्टेंस से प्राप्त करें
    @Provides
    fun provideFirebaseAuth(app: FirebaseApp): FirebaseAuth = FirebaseAuth.getInstance(app)

    @Provides
    fun provideFirebaseDatabase(app: FirebaseApp): FirebaseDatabase = FirebaseDatabase.getInstance(app)

    @Provides
    fun provideFirebaseStorage(app: FirebaseApp): FirebaseStorage = FirebaseStorage.getInstance(app)

    @Provides
    fun provideDatabaseReference(database: FirebaseDatabase): DatabaseReference = database.reference

    @Provides
    fun provideStorageReference(storage: FirebaseStorage): StorageReference = storage.reference
}







//package com.safe.setting.app.di.module
//
//import android.content.Context
//import com.safe.setting.app.data.rxFirebase.DevelopFirebase
//import com.safe.setting.app.data.rxFirebase.InterfaceFirebase
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.storage.FirebaseStorage
//import com.google.firebase.storage.StorageReference
//import dagger.Module
//import dagger.Provides
//
//@Module
//class FirebaseModule {
//
//    @Provides
//    fun provideInterfaceFirebase(context: Context, auth: FirebaseAuth, dataRef: DatabaseReference, stoRef: StorageReference): InterfaceFirebase = DevelopFirebase(context,auth, dataRef, stoRef)
//
//    @Provides
//    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()
//
//    @Provides
//    fun provideFirebaseDatabase(): FirebaseDatabase = FirebaseDatabase.getInstance()
//
//    @Provides
//    fun provideFirebaseStorage(): FirebaseStorage = FirebaseStorage.getInstance()
//
//    @Provides
//    fun provideDatabaseReference(database: FirebaseDatabase): DatabaseReference = database.reference
//
//    @Provides
//    fun provideStorageReference(storage: FirebaseStorage): StorageReference = storage.reference
//
//
//}