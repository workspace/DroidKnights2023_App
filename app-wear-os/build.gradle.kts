plugins {
    id("droidknights.android.application")
}

android {
    namespace = "com.droidknights.app2023.wear"

    defaultConfig {
        applicationId = "com.droidknights.app2023.wear"
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(projects.core.navigation)
    implementation(projects.core.playback)
    implementation(projects.feature.wearMain)
    implementation(projects.feature.wearPlayer)
}