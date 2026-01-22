plugins {
}

group = "pers.ken"
version = "1.0-SNAPSHOT"

dependencies {
    api(platform(rootProject.libs.spring.boot.dependencies))
    api(libs.spring.boot.autoconfigure)
    annotationProcessor(libs.spring.boot.configuration.processor)

    compileOnly(libs.obj.storage.obs)
    compileOnly(libs.obj.storage.oss)
    testImplementation(libs.spring.boot.starter.test)
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    enabled = true
}