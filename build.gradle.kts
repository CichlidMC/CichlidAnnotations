plugins {
    id("java-library")
    id("maven-publish")
}

base.archivesName = "CichlidAnnotations"
group = "io.github.cichlidmc"
version = "1.0.0"

repositories {
}

dependencies {
}

java.withSourcesJar()

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    repositories {
        maven("https://mvn.devos.one/snapshots") {
            name = "devOS"
            credentials(PasswordCredentials::class)
        }
    }
}
