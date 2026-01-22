plugins {
//    id("java")
//    kotlin("jvm") version ("1.7.10")
//    `java-library`
//    id("org.springframework.boot") version "3.3.5" apply false
//    id("io.spring.dependency-management") version "1.1.6"
}

group = "pers.ken"
version = "1.0-SNAPSHOT"

dependencies {
    api(platform(rootProject.libs.spring.boot.dependencies))
    api(libs.spring.boot.autoconfigure)
    annotationProcessor(libs.spring.boot.configuration.processor)
    compileOnly(libs.spring.boot.starter.web)
    testImplementation(libs.spring.boot.starter.test)
}

tasks.test {
    useJUnitPlatform()
}