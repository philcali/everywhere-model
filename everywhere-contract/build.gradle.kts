plugins {
  java
  id("software.amazon.smithy") version "0.3.0"
  id("org.openapi.generator") version "4.1.1"
}

buildscript {
  dependencies {
    classpath("software.amazon.smithy:smithy-openapi:0.9.0")
    classpath("software.amazon.smithy:smithy-aws-apigateway-openapi:0.9.0")
  }
}

val specLocation = "$buildDir/smithyprojections/everywhere-contract/source/openapi/Everywhere.openapi.json"

openApiGenerate {
  generatorName.set("java")
  inputSpec.set(specLocation)
  outputDir.set("$rootDir/everywhere-java")
  modelPackage.set("pro.travelin.model")
  apiPackage.set("pro.travelin.api")
  invokerPackage.set("pro.travelin.invoker")
}

openApiValidate {
  inputSpec.set(specLocation)
}

tasks.assemble {
  dependsOn(tasks.openApiValidate)
}

dependencies {
  implementation("software.amazon.smithy:smithy-model:0.9.0")
}
