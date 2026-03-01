# QA API Automation Framework

A scalable API test automation framework built with Java, RestAssured, and TestNG.

## 🚀 Tech Stack
- Java 21
- Maven
- RestAssured
- TestNG
- JSON Schema Validation

## 📂 Project Structure
- BaseTest → shared request configuration
- tests → API test classes (GET, POST, PUT)
- models → POJO models
- pom.xml → dependency management

## 🧪 Test Coverage
- GET user
- POST create resource
- PUT update resource
- Response validation
- Status code validation
- JSON schema validation

## 🏗 Design Approach
- Centralized RequestSpecification
- Reusable BaseTest structure
- Configuration externalization ready
- Group-based test execution (smoke)
- Modular and scalable test design
## ▶️ Run Tests
```bash
mvn clean test
