plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.monun:invfx-core:3.3.2")
}
dependencies {
    implementation("io.github.monun:invfx-core:3.3.2")
}
dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
kotlin {
    jvmToolchain(17)
}
dependencies {
    compileOnly(files("./libs/<PLUGIN>.jar"))
}