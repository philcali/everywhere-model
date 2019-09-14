# The Everywhere Contract

Repository for the contract running the [travelin.pro][1] website.

## Why?

This project is an excuse to try bleeding edge aws tools to automate
infrastructure and code generation tooling.

## Updating the client

The generated Java models are found in `everywhere-java`. The openapi
generator will create a project on your behalf. This process is very
similar to the wsdl generator provided with the JDK. In order to
update the generated models run the following command at the root:

```
gradle openApiGenerate
```

[1]: https://travelin.pro
