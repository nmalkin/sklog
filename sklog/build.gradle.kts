plugins {
    kotlin("jvm")
    `maven-publish`
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.nmalkin"
            artifactId = "sklog"
            version = "0.0.2"

            from(components["java"])
        }
    }
}
