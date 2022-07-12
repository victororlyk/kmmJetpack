pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
    
}
rootProject.name = "jetpack"


include(":iosApp")
include(":androidApp")
include(":shared")

