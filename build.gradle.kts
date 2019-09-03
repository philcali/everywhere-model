plugins {
  java
  id("software.amazon.smithy").version("0.3.0")
}

buildscript {
  repositories {
    mavenLocal()
    mavenCentral()
  }
  dependencies {
    classpath("software.amazon.smithy:smithy-openapi:0.9.0")
    classpath("software.amazon.smithy:smithy-aws-apigateway-openapi:0.9.0")
  }
}

repositories {
  mavenLocal()
  mavenCentral()
}

dependencies {
  implementation("software.amazon.smithy:smithy-model:0.9.0")
}
