plugins {
    id("java")
}

group = "com.wiley.realworldjava.lombok"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.30")
}
