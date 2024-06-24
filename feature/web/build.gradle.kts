import com.somnwal.app.common.setNamespace

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("somnwal.android.feature")

}

android {
    setNamespace("feature.web")
}

dependencies {
    implementation(libs.kotlinx.immutable)
    implementation(libs.kotlinx.serialization.json)
}