import com.somnwal.app.common.setNamespace

plugins {
    id("somnwal.android.library")
}

android {
    setNamespace("core.data.api")
}

dependencies {
    implementation(projects.core.model)
}