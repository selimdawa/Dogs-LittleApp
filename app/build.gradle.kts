plugins {
    alias(libs.plugins.android.application)
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
    implementation(libs.androidx.fragment.ktx) //Fragment
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.preference.ktx)           //Shared Preference
    //test
    testImplementation(libs.androidx.core.testing)
    testImplementation(libs.mockwebserver)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //Layout
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
    //Image
    implementation(libs.coil)    //Coil
    //Life Cycle
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    //Retrofit
    implementation(libs.retrofit)  //Retrofit
    implementation(libs.retrofit2.converter.gson)  //Gson
    //Coroutines
    implementation(libs.kotlinx.coroutines.core)
}