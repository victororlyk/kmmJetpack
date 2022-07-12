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

val composeVersion = "1.3.0-alpha01"

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation("com.google.android.material:material:1.5.0")
                implementation("androidx.appcompat:appcompat:1.4.1")
                implementation("androidx.constraintlayout:constraintlayout:2.1.3")
                implementation("androidx.activity:activity-compose:1.4.0")
                implementation("androidx.compose.material:material:$composeVersion")
                implementation("androidx.compose.ui:ui-tooling:$composeVersion")
            }
        }
    }
}

android {
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }
    compileSdkVersion(32)
    defaultConfig {
        applicationId = "me.user.androidApp"
        minSdkVersion(24)
        targetSdkVersion(32)
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
