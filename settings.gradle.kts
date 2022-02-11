rootProject.name = "version-catalog-with-spring-boot"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("h2", "com.h2database:h2:1.4.200")
            library("lombok", "org.projectlombok:lombok:1.18.20")
            library("spring-boot-starter-web", "org.springframework.boot", "spring-boot-starter-web").version("")
            library("spring-boot-starter-validation", "org.springframework.boot", "spring-boot-starter-validation").version("")
            library("spring-boot-starter-actuator", "org.springframework.boot", "spring-boot-starter-actuator").version("")
            library("spring-boot-starter-data-jpa", "org.springframework.boot", "spring-boot-starter-data-jpa").version("")
            library("spring-boot-devtools", "org.springframework.boot", "spring-boot-devtools").version("")
            library("spring-boot-starter-test", "org.springframework.boot", "spring-boot-starter-test").version("")
        }
    }
}