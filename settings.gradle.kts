pluginManagement {
    includeBuild("build-logic")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "test"
include(":app")


include(
    ":core:data",
    ":core:data-api",
    ":core:datastore",
    ":core:datastore-proto",
    ":core:designsystem",
    ":core:model",
    ":core:domain",
    ":core:common"
)

include(
    ":feature:main",
    ":feature:test",
    ":feature:test-webview",
    ":feature:test-lottie"
)
