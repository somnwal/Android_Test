@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("somnwal.kotlin.library")
    id("kotlinx-serialization")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}
