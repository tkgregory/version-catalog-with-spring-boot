[![CI](https://github.com/tkgregory/version-catalog-with-spring-boot/actions/workflows/gradle.yml/badge.svg)](https://github.com/tkgregory/version-catalog-with-spring-boot/actions/workflows/gradle.yml)

This project demonstrates the Gradle 7.4+ *Version Catalog* feature with Spring Boot.

Note that:

* we don't use `io.spring.dependency-management` plugin, but instead apply `spring-boot-dependencies` platform/BOM via `SpringBootPlugin.BOM_COORDINATES`
* Spring Boot dependencies are defined in *setings.gradle.kts*. Can instead use *gradle/libs.versions.toml* as per [the docs](https://docs.gradle.org/current/userguide/platforms.html#sub:conventional-dependencies-toml).
* Spring Boot version is defined in *build.gradle.kts* rather than version catlog due to [IntelliJ IDEA bug](https://youtrack.jetbrains.com/issue/KT-49161) which shows plugin reference to version catalog as error
