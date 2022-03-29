import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.ricard"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-netty:1.5.2")
    implementation("io.ktor:ktor-html-builder:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2")
    implementation("org.slf4j:slf4j-simple:1.7.33")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("ServerKt")
}