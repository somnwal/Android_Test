import com.somnwal.app.common.setNamespace

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("somnwal.android.feature")

}

android {
    setNamespace("feature.search")
}

dependencies {
    implementation(libs.kotlinx.immutable)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    implementation(libs.coil.kt.svg)

    implementation(libs.kotlinx.serialization.json)
}