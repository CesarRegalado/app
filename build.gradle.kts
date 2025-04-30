plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.app"
    buildFeatures {
        viewBinding = true
    }

    dependencies {
        implementation(libs.material)
    }
}