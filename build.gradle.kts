buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}

group = "me.user"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}