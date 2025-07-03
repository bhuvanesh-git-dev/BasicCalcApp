# 🧮 BasicCalcApp

A lightweight Spring Boot application that provides basic arithmetic operations over REST — built for experimenting with AWS deployment pipelines using WAR, JAR, and Docker.

---

## 🚀 Features

- ✖️ Multiplication
- ➕ Addition
- ➖ Subtraction

> Division intentionally not implemented (for controlled testing)

---

## 📦 Endpoints

| Operation   | URL Example                                           |
|-------------|--------------------------------------------------------|
| Multiply    | `/calc/mul?uinum1=8&uinum2=7`                          |
| Add         | `/calc/add?uinum1=8&uinum2=7`                          |
| Subtract    | `/calc/sub?uinum1=8&uinum2=7`                          |

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- REST API
- Deployed to:
  - Elastic Beanstalk (WAR, JAR, Docker)
  - Coming soon: ECS Fargate

---

## 🐳 Docker Support

Use this sample `Dockerfile` to build and run locally:

```Dockerfile
FROM openjdk:17-jdk-slim
COPY BCalc.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
