plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("kotlin-kapt")

}

android {
    // ... आपका मौजूदा defaultConfig, buildTypes, आदि

    // NDK और CMake को कॉन्फ़िगर करने के लिए यह ब्लॉक जोड़ें
    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }

    namespace = "com.safe.setting.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.safe.setting.app"
        minSdk = rootProject.extra["defaultMinSdkVersion"] as Int
        targetSdk = 35
        versionCode = 27
        versionName = "27"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
        languageVersion = "1.9"

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        // यह बिल्ड टाइप ProGuard के साथ डीबगिंग के लिए है
        create("debugWithProguard") {
            initWith(getByName("debug")) // debug की सभी सेटिंग्स कॉपी करें
            isMinifyEnabled = true // ProGuard को सक्षम करें
            isShrinkResources = true // रिसोर्स श्रिंकिंग को सक्षम करें
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // नोट: isDebuggable = true होने के कारण Gradle एक चेतावनी दिखाएगा,
            // लेकिन यह आपको क्रैश को डीबग करने की अनुमति देगा।
        }

        debug {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

    bundle {
        abi {
            enableSplit = true
        }
    }

//    buildTypes {
//        release {
//            isMinifyEnabled = true
//            isShrinkResources = true
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//            signingConfig = signingConfigs.getByName("debug")
//        }
//    }


    dependencies {
        implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
        implementation("androidx.appcompat:appcompat:1.7.1")
        implementation("com.google.android.material:material:1.12.0")
        implementation("androidx.constraintlayout:constraintlayout:2.2.1")
        implementation("androidx.multidex:multidex:2.0.1")
        implementation("androidx.cardview:cardview:1.0.0")
        implementation("androidx.recyclerview:recyclerview:1.4.0")

        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.3.0")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")

        //android lifecycle
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.2")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.2")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.2")


        //Firebase
        implementation("com.google.firebase:firebase-auth:24.0.0")
        implementation("com.google.firebase:firebase-database:22.0.0")
        implementation("com.google.firebase:firebase-storage:22.0.0")
        implementation("com.google.firebase:firebase-core:21.1.1")
        implementation("com.firebaseui:firebase-ui:8.0.2")
        implementation(platform("com.google.firebase:firebase-bom:34.0.0"))
        implementation("com.google.firebase:firebase-analytics-ktx:22.5.0")

        //spinner
        implementation("com.jaredrummler:material-spinner:1.3.1")

        //animation
        implementation("com.daimajia.androidanimations:library:2.4@aar")

        //dialog
        implementation("com.github.f0ris.sweetalert:library:1.6.2")

        //KAndroid
        implementation("com.github.pawegio:KAndroid:0.8.8@aar")

        //Android-Ktx
        implementation("androidx.core:core-ktx:1.16.0")

        //dagger2
        implementation("com.google.dagger:dagger:2.51.1")
        kapt("com.google.dagger:dagger-compiler:2.51.1")

        //RxPermissions
        implementation("com.github.tbruyelle:rxpermissions:0.12")

        //RxBinding - Kotlin
        implementation("com.jakewharton.rxbinding4:rxbinding:4.0.0")

        //RxKotlin2 / RxAndroid
        implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
        implementation("io.reactivex.rxjava3:rxandroid:3.0.2")

        //deviceName
        implementation("com.jaredrummler:android-device-names:2.1.1")
    }
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

