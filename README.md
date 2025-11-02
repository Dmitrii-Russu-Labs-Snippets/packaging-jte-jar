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
```

### Production (`prod`)

Used for building and running optimized JAR with precompiled templates.

```properties
# application-prod.properties
spring.application.name=jte-springboot-jar-demo
gg.jte.developmentMode=false
gg.jte.usePrecompiledTemplates=true
server.port=8081
```

## How to build and run

### Clone the repository:

```
git clone git@github.com:dmitrii-russu-sendbox/jte-springboot-jar-demo.git
cd jte-springboot-jar-demo
```

### Compile templates and build production JAR:

```
./mvnw compile
./mvnw package -Pprod
```

### Run application:

```
java -jar target/jte-springboot-jar-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```

### Or run in development mode:

```
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

### Maven Profiles

### Defined in pom.xml:

```
<profiles>
    <profile>
        <id>dev</id>
        <properties>
            <spring.profiles.active>dev</spring.profiles.active>
        </properties>
    </profile>

    <profile>
        <id>prod</id>
        <properties>
            <spring.profiles.active>prod</spring.profiles.active>
        </properties>
    </profile>
</profiles>
```

### Troubleshooting
- Templates not found

Make sure templates are precompiled and gg.jte.usePrecompiledTemplates=true in production mode.

https://github.com/danvega/jte-production/tree/master
