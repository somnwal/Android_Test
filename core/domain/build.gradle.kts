import com.somnwal.app.common.setNamespace

plugins {
    id("somnwal.android.library")
}

android {
    setNamespace("core.domain")
}

dependencies {
    implementation(projects.core.model)
    implementation(projects.core.dataApi)
}