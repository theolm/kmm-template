import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    id("android-application-setup")
    id("desktop-application-setup")
    id("compose-component-setup")
}

kotlin {
    sourceSets {
        val desktopMain by getting
        
        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)
        }
    }
}

android {
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}
