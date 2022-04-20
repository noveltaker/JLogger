import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("jvm") version "1.6.20"
    `maven-publish`
    `java-library`
}

group = "org.noveltaker"
version = "0.0.91"

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}

tasks.withType<AbstractArchiveTask> {
    setProperty("enabled" , "true")
    setProperty("archiveFileName", "${project.name}-${project.version}.jar")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.7.36")
}


publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = "${project.group}"
            artifactId = project.name
            version = "${project.version}"
            from(components.getByName("java"))
        }
    }
}
