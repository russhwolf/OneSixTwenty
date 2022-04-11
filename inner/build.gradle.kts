plugins {
    kotlin("multiplatform") version "1.6.20"
    `maven-publish`
}

group = "me.russell"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    ios()

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
