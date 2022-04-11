plugins {
    kotlin("multiplatform") version "1.6.20"
}

group = "me.russell"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    ios {
        binaries {
            framework()
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("me.russell:outer:1.0-SNAPSHOT")
//                implementation(project(":outer"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
