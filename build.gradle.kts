import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("jvm") version "1.6.20"
    `maven-publish`
    `java-library`
}

group = "org.noveltaker"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}

tasks.withType<AbstractArchiveTask> {
    setProperty("archiveFileName", "JLogger-${project.version}.jar")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.7.36")
}
