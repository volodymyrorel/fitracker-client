import org.gradle.api.JavaVersion

object Config {
    const val compileSdk = 36
    const val targetSdk = 36
    const val minSdk = 26
    const val versionCode = 1
    const val versionName = "0.0.1"
    val javaVersion = JavaVersion.VERSION_17
    const val jvmTarget = "17"
    const val isMinifyEnabled = true
}