## Overview

This project is a Java-based testing framework that uses RestAssured and TestNG for API testing. The project is set up as a Maven project, which helps in managing dependencies and building the project.

### Key Components:
- **RestAssured**: A Java library for testing and validating REST APIs.
- **TestNG**: A testing framework inspired by JUnit and NUnit, designed to be more flexible and powerful.

### Project Structure:

```
README.md
pom.xml
src/
    main/
        java/
            org/mahendra/automation/
                api/
                pojos/
                utils/
        resources/
    test/
        java/
            org/mahendra/automation/
                api/
```

### Dependencies:
- **RestAssured**: For making HTTP requests and validating responses.
- **TestNG**: For organizing and running tests.
- **Jackson Databind**: For JSON processing.

### Classes:
- `org.mahendra.automation.api.ApiRoutes`: Defines API routes.
- `org.mahendra.automation.api.CategoriesApi`: Contains methods for interacting with the Categories API.
- `org.mahendra.automation.api.SpecificationBuilder`: Builds request specifications.
- `org.mahendra.automation.pojos.*`: Represents a category in the API.
- `org.mahendra.automation.utils.ConfigProperties`: Manages configuration properties.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven

## Building the Project

To build the project, run the following command:

```
mvn clean install
```

## Running Tests

To run the tests, use the following command:

```
mvn test
```
