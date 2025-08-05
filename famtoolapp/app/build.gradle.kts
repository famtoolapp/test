plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
//    id("kotlin-kapt")
}

android {
    namespace = "com.safe.setting.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.safe.setting.app"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }

    // 'packagingOptions' has been renamed to 'packaging' in newer AGP versions.
    packaging {
        // RxJava 3 doesn't need this exclusion anymore, but keeping it in case of other conflicts.
        resources.excludes.add("META-INF/rxjava.properties")
    }
}

// Set the JVM toolchain for Kotlin, which is the modern way to set the JVM target.
kotlin {
    jvmToolchain(17)
}

dependencies {
    // Core Android libraries
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // Android Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.2")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:34.0.0"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-database")
    implementation("com.google.firebase:firebase-storage")
    // Updated firebase-analytics dependency
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.firebaseui:firebase-ui-auth:9.0.0")
    implementation("com.google.android.gms:play-services-location:21.3.0")


    // Glide Image Loading
    implementation("com.github.bumptech.glide:glide:4.16.0")
    ksp("com.github.bumptech.glide:compiler:4.16.0")


    // Dagger 2
    implementation("com.google.dagger:dagger:2.57")
    ksp("com.google.dagger:dagger-compiler:2.57")

    // RxJava3 & RxBinding
    implementation("com.jakewharton.rxbinding4:rxbinding:4.0.0")
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.2")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
}

// Apply the Google services plugin at the end
//apply(plugin = "com.google.gms.google-services")




//plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    id("kotlin-parcelize")
//    id("kotlin-kapt")
//
//}
//
//android {
//    // ... आपका मौजूदा defaultConfig, buildTypes, आदि
//
//    // NDK और CMake को कॉन्फ़िगर करने के लिए यह ब्लॉक जोड़ें
//    externalNativeBuild {
//        cmake {
//            path = file("src/main/cpp/CMakeLists.txt")
//            version = "3.22.1"
//        }
//    }
//
//    namespace = "com.safe.setting.app"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.safe.setting.app"
//        minSdk = rootProject.extra["defaultMinSdkVersion"] as Int
//        targetSdk = 35
//        versionCode = 27
//        versionName = "27"
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildFeatures {
//        viewBinding = true
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_17
//        targetCompatibility = JavaVersion.VERSION_17
//    }
//
//
//
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
//
//    dependencies {
//        implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//        implementation("androidx.appcompat:appcompat:1.7.1")
//        implementation("com.google.android.material:material:1.12.0")
//        implementation("androidx.constraintlayout:constraintlayout:2.2.1")
//        implementation("androidx.multidex:multidex:2.0.1")
//        implementation("androidx.cardview:cardview:1.0.0")
//        implementation("androidx.recyclerview:recyclerview:1.4.0")
//
//        testImplementation("junit:junit:4.13.2")
//        androidTestImplementation("androidx.test.ext:junit:1.3.0")
//        androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
//
//        //android lifecycle
//        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.2")
//        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.2")
//        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.2")
//
//
//        //Firebase
//        implementation("com.google.firebase:firebase-auth:24.0.0")
//        implementation("com.google.firebase:firebase-database:22.0.0")
//        implementation("com.google.firebase:firebase-storage:22.0.0")
//        implementation("com.firebaseui:firebase-ui:8.0.2")
//        implementation(platform("com.google.firebase:firebase-bom:34.0.0"))
//        implementation("com.google.firebase:firebase-analytics-ktx:22.5.0")
//
//        //Android-Ktx
//        implementation("androidx.core:core-ktx:1.16.0")
//
//        //dagger2
//        implementation("com.google.dagger:dagger:2.51.1")
//        kapt("com.google.dagger:dagger-compiler:2.51.1")
//
//        //RxBinding - Kotlin
//        implementation("com.jakewharton.rxbinding4:rxbinding:4.0.0")
//
//        //RxKotlin2 / RxAndroid
//        implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
//        implementation("io.reactivex.rxjava3:rxandroid:3.0.2")
//
//    }
//}
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//}
