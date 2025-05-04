plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.hello_world"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.hello_world"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // Agregando material desinge
    implementation("com.google.android.material:material:1.12.0")
    implementation ("androidx.compose.material:material-icons-extended:1.6.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    implementation ("androidx.cardview:cardview:1.0.0")
}