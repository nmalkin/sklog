plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.6.10"
}

repositories {
    gradlePluginPortal() // so that external plugins can be resolved in dependencies section
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}
