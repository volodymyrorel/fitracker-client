import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id(Dependencies.Plugins.androidApplication)
    id(Dependencies.Plugins.kotlinAndroid)
    id(Dependencies.Plugins.composeCompiler)
    id(Dependencies.Plugins.kotlin_kapt)
    id(Dependencies.Plugins.kotlinSerialization)
    id(Dependencies.Plugins.hilt)
}

android {
    namespace = "lpnu.volodymyrorel.fitnessappproject"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = "lpnu.volodymyrorel.fitnessappproject"
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = Config.isMinifyEnabled
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Config.javaVersion
        targetCompatibility = Config.javaVersion
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    // Compose
    implementation(Dependencies.Compose.ui)
    debugImplementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Compose.uiGraphics)
    implementation(Dependencies.Compose.uiGoogleFonts)
    implementation(Dependencies.Compose.uiGoogleFonts)
    implementation(Dependencies.Compose.uiTestJunit4)
    debugImplementation(Dependencies.Compose.uiTestManifest)
    implementation(platform(Dependencies.Compose.composeBom))
    implementation(Dependencies.Compose.activityCompose)
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.navigation)

    // Hilt
    implementation(Dependencies.Hilt.hilt)
    implementation(Dependencies.Hilt.hiltNavigation)
    kapt(Dependencies.Hilt.compiler)

    // Data Store
    implementation(Dependencies.DataStore.dataStorePreferences)

    // Serialization
    implementation(Dependencies.Kotlin.serializationJson)

    // KTX
    implementation(Dependencies.Kotlin.coreKtx)
    implementation(Dependencies.Kotlin.lifecycleRuntimeKtx)

    // Test
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.androidxJunit)
    androidTestImplementation(Dependencies.Test.espressoCore)
    androidTestImplementation(platform(Dependencies.Compose.composeBom))
}