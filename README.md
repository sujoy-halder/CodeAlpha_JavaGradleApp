# CodeAlpha Java Application using Gradle

A Java Spring Boot REST API developed for **CodeAlpha DevOps Internship Task 3**.

The project demonstrates Java application development with Gradle build automation, dependency management, automated testing, application monitoring, and CI/CD-ready project structure.

## Project Objective

The objective of this project is to demonstrate:

- Java application development using Spring Boot
- Automated builds using Gradle
- Dependency management with Gradle
- Automated testing using JUnit
- REST API development
- Application health monitoring using Spring Boot Actuator
- Executable JAR packaging
- CI/CD integration

## Technologies Used

- Java 17
- Spring Boot
- Gradle 9.7.1
- Spring Web
- Spring Boot Actuator
- JUnit
- Git
- GitHub
- GitHub Actions

## Project Structure

```text
CodeAlpha_JavaGradleApp/
├── gradle/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/codealpha/gradleapp/
│   │   │       ├── JavaGradleAppApplication.java
│   │   │       └── StatusController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/codealpha/gradleapp/
│               ├── JavaGradleAppApplicationTests.java
│               └── StatusControllerTest.java
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md
```

## REST API Endpoints

### Home Endpoint

```text
GET /
```

Example response:

```json
{
  "application": "CodeAlpha Java Gradle Application",
  "message": "Welcome to CodeAlpha DevOps Internship Task 3"
}
```

### Application Status

```text
GET /api/status
```

Example response:

```json
{
  "status": "UP",
  "buildTool": "Gradle",
  "javaVersion": "17",
  "timestamp": "2026-09-14T..."
}
```

### Health Monitoring

```text
GET /actuator/health
```

Example response:

```json
{
  "status": "UP"
}
```

### Application Information

```text
GET /actuator/info
```

Example response:

```json
{
  "app": {
    "name": "CodeAlpha Java Gradle Application",
    "description": "Java Application using Gradle - CodeAlpha DevOps Internship Task 3",
    "version": "1.0.0",
    "java": "17",
    "build-tool": "Gradle"
  }
}
```

## Build the Application

Windows:

```cmd
gradlew.bat clean build
```

Expected result:

```text
BUILD SUCCESSFUL
```

## Run Automated Tests

```cmd
gradlew.bat clean test
```

The project currently contains:

```text
3 tests
0 failures
0 skipped
100% successful
```

## Run with Gradle

```cmd
gradlew.bat bootRun
```

The application starts on:

```text
http://localhost:8080
```

## Build Artifact

Gradle creates the executable Spring Boot JAR inside:

```text
build/libs/
```

Example:

```text
java-gradle-app-0.0.1-SNAPSHOT.jar
```

Run it with:

```cmd
java -jar build\libs\java-gradle-app-0.0.1-SNAPSHOT.jar
```

## Build Workflow

```text
Source Code
    ↓
Gradle Compile
    ↓
JUnit Tests
    ↓
Gradle Build
    ↓
Executable JAR
    ↓
Spring Boot Application
```

## Testing

The application includes automated JUnit tests for:

- Application context loading
- Home endpoint response
- Status endpoint response
- Gradle build information
- Java version
- Dynamic timestamp generation

Test report:

```text
3 tests
0 failures
100% successful
```

## DevOps Concepts Demonstrated

- Build automation
- Dependency management
- Automated testing
- Application packaging
- REST API development
- Health monitoring
- Build artifact generation
- Continuous Integration readiness
- Continuous Delivery readiness

## Author

**Sujoy**

CodeAlpha DevOps Internship  
Task 3 — Java Application using Gradle