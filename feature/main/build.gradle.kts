import com.somnwal.app.common.setNamespace

plugins {
    id("somnwal.android.feature")
}

android {
    setNamespace("feature.main")
}

dependencies {
    implementation(projects.feature.search)
    implementation(projects.feature.favorite)
    implementation(projects.feature.web)

    implementation(projects.core.dataApi)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.compose.navigation)

    implementation(libs.android.material)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.kotlinx.immutable)
}