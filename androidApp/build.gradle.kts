plugins {
    kotlin("multiplatform")
    id("com.android.application")
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    google()
    jcenter()
}

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation("com.google.android.material:material:1.5.0")
                implementation("androidx.appcompat:appcompat:1.4.1")
                implementation("androidx.constraintlayout:constraintlayout:2.1.3")
            }
        }
    }
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "me.user.androidApp"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}