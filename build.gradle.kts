plugins {
    id("java")
    `version-catalog`
    `java-library`
    kotlin("jvm") version ("1.7.10")
    id("org.springframework.boot") version "3.3.5"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "pers.ken"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    // apply：在所有模块中应用以下插件
    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    java {
        java.sourceCompatibility = JavaVersion.VERSION_21
        java.targetCompatibility = JavaVersion.VERSION_21
    }

    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
        testImplementation {
            extendsFrom(configurations.compileOnly.get())
        }
    }
    // 公共依赖定义
    dependencies {
        /*
        implementation：声明模块内部使用的依赖项
        api：声明需要对外暴露的依赖项
        compileOnly：声明编译时需要但运行时不需要的依赖项
        runtimeOnly：声明运行时需要但编译时不需要的依赖项
        testImplementation：声明测试代码需要的依赖项
        testCompileOnly：声明测试代码在编译时需要但运行时不需要的依赖项
        testRuntimeOnly：声明测试代码在运行时需要但编译时不需要的依赖项
        annotationProcessor：声明注解处理器依赖项，如 Lombok、MapStruct 等
        kapt：声明 Kotlin 注解处理器依赖项，与 annotationProcessor 类似，但专为 Kotlin 设计
        platform：声明一个 BOM 文件，用于统一管理依赖版本
        enforcedPlatform：强制使用某个 BOM 文件中的版本，覆盖其他版本声明
         */
        api(platform(rootProject.libs.spring.boot.dependencies))
        annotationProcessor(rootProject.libs.lombok)
        compileOnly(rootProject.libs.lombok)
    }
}