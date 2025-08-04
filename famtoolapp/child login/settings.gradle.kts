@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // jitpack.io को हटा दिया गया है क्योंकि यह भविष्य में समस्याएँ पैदा कर सकता है।
        // maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "child"
include(":app")
