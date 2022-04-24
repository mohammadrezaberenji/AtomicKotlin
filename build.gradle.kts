plugins {
    kotlin("multiplatform") version "1.4.10"
}

group = "me.mohammadreza"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }


    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    sourceSets {
        val nativeMain by getting{
            dependencies{
                implementation("org.junit.jupiter:junit-jupiter:5.4.2")
                implementation("org.junit.jupiter:junit-jupiter:5.4.2")
//                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

            }
        }
        val nativeTest by getting {
            dependencies{
                implementation("org.junit.jupiter:junit-jupiter:5.4.2")
                implementation("org.junit.jupiter:junit-jupiter:5.4.2")
            }
        }
    }


}




