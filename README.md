# jte-springboot-jar-demo

Spring Boot demo showing how to build and run a **JTE-based** web application with separate development and production profiles.

## Description

This project demonstrates how to configure and deploy a **Spring Boot** application using **JTE templates** with proper profile management and precompiled templates for production builds.  
It shows how to:

- Run JTE in **development mode** for fast reloading  
- Build a **production JAR** with precompiled templates  
- Use **Spring profiles** to switch between environments

## Features

- `@Profile`-based environment setup (`dev`, `prod`)
- JTE **precompiled template support**
- Maven profile integration for production build
- Easy to run as a standalone JAR

## Profiles

### Development (`dev`)

Used during development for live template reloading.

```properties
# application-dev.properties
spring.application.name=jte-springboot-jar-demo
gg.jte.developmentMode=true
gg.jte.usePrecompiledTemplates=false
server.port=8081
