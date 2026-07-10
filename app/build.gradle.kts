plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.ksp)
    alias(libs.plugins.dagger.hilt.android)
}

android {
    namespace = "com.littleapp.dogs"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.littleapp.dogs"
        minSdk = 24
        targetSdk = 37
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.preference.ktx)           //Shared Preference
    //test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //Layout
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
    //Image
    implementation(libs.coil)    //Coil
    //Life Cycle
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    //Dagger - Hilt
    implementation(libs.hilt.android)     //Dagger Hilt
    ksp(libs.hilt.android.compiler)      //Dagger Hilt Compiler
    //Retrofit
    implementation(libs.retrofit.core) //Retrofit
    implementation(libs.retrofit.converter.gson)   //Gson
    //Kotlin Coroutines
    implementation(libs.kotlinx.coroutines.core)   //Core
    implementation(libs.kotlinx.coroutines.android) //Android
}