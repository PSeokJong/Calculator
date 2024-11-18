plugins {
    id("java")
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "gcukakao.jenkins"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

//tasks.bootJar {
//    manifest {
//        attributes["Main-Class"] = "gcukakao.jenkins.Application"
//    }
//}

tasks.bootJar {
    manifest {
        attributes["Main-Class"] = "org.springframework.boot.loader.JarLauncher"
    }
}

