plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.devtools.ksp")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.bruno.daniel.navarro.nunez.decoradornulllib"
        minSdk = 16
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        //multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation(project(":DecoradorLib"))

    implementation("androidx.core:core-ktx:1.1.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}