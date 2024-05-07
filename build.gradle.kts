plugins {
    id("java")
}

group = "org.rindt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Add FlatLaf dependency for the Darcula theme
    implementation("com.formdev:flatlaf:3.4.1")
}

tasks.test {
    useJUnitPlatform()
}
