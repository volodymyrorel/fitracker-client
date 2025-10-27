@Suppress("memberVisibilityCanBePrivate")
object Dependencies {

    object Kotlin {
        const val version = "2.1.21"
        const val coreKtxVersion = "1.17.0"
        const val lifecycleRuntimeKtxVersion = "2.9.4"
        const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0-RC"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeKtxVersion"
    }

    object Plugins {
        const val androidLibrary = "com.android.library"
        const val kotlinAndroid = "org.jetbrains.kotlin.android"
        const val kotlinSerialization = "org.jetbrains.kotlin.plugin.serialization"
        const val hilt = "com.google.dagger.hilt.android"
        const val kotlin_kapt = "kotlin-kapt"
        const val composeCompiler = "org.jetbrains.kotlin.plugin.compose"
        const val androidApplication = "com.android.application"
    }

    object Gradle {
        const val agpVersion = "8.12.0-alpha01"
    }

    object Compose {
        const val version = "1.9.4"
        const val activityComposeVersion = "1.11.0"
        const val composeBomVersion = "2025.10.01"
        const val composeBom = "androidx.compose:compose-bom:$composeBomVersion"
        const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
        const val ui = "androidx.compose.ui:ui:$version"
        const val uiGraphics = "androidx.compose.ui:ui-graphics:$version"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$version"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
        const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:$version"
        const val uiGoogleFonts = "androidx.compose.ui:ui-text-google-fonts:$version"
        const val material3 = "androidx.compose.material3:material3:1.4.0"
        const val navigation = "androidx.navigation:navigation-compose:2.9.5"
    }

    object Hilt {
        const val version = "2.54"
        const val hilt = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:1.3.0"
    }

    object DataStore {
        const val dataStorePreferences = "androidx.datastore:datastore-preferences:1.1.7"
    }

    object Test {
        const val junitVersion = "4.13.2"
        const val androidxJunitVersion = "1.1.5"
        const val espressoCoreVersion = "3.5.0"
        const val junit = "junit:junit:$junitVersion"
        const val androidxJunit = "androidx.test.ext:junit:$androidxJunitVersion"
        const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
    }
}