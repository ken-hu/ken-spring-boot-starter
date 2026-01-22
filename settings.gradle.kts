rootProject.name = "ken-spring-boot-starter"
include("ken-dynamic-form-spring-boot-starter")
include("ken-storage-spring-boot-starter")
include("ken-pbac-spring-boot-starter")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
        }
    }
}

include("ken-gis-storage-spring-boot-starter")