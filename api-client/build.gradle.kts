plugins {
    id("kmm-module-setup")
}

android {
    namespace = "com.theolm.temp"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.negotiation)
            implementation(libs.ktor.serialization.json)
            implementation(libs.koin.core)
            implementation(libs.koin.test)
        }

        androidMain.dependencies {
            implementation(libs.ktor.client.okhttp)
        }

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }

        desktopMain.dependencies {
            implementation(libs.ktor.client.okhttp)
        }
    }
}