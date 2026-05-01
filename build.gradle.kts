plugins {
  application
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.ben.manes.versions)
}

application {
  mainClass.set("PersonDslKt")
}

dependencies {
  testImplementation(libs.bundles.junit5)
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}
