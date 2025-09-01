pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // JitPack for plugin resolution (optional but safe)
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // JitPack needed for PDFView and similar libraries
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Library app"
include(":app")
