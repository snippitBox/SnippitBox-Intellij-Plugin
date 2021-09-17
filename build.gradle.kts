plugins {
    id("org.jetbrains.intellij") version "1.1.6"
    java
}

group = "com.snippitbox.intellij"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_16

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

intellij {
    version.set("2021.2.2")
}

tasks {
    patchPluginXml {
        changeNotes.set("snippitBox integration for the IntelliJ Platform.")
    }
	
	 test {
		 useJUnitPlatform()
	 }
	
	runIde {
		jvmArgs("--add-exports", "java.base/jdk.internal.vm=ALL-UNNAMED")
	}
}