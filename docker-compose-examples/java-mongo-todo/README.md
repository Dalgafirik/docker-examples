# Java Mongo Todo (Docker Compose)

This example demonstrates a **Java Spring Boot Todo API**
running together with **MongoDB** using **Docker Compose**.

The goal is to show how a stateful backend service can be
containerized and orchestrated with multiple services.

---

## What This Example Covers

- Java Spring Boot REST API
- MongoDB as a separate container
- Docker image build via Dockerfile
- Multi-service orchestration with Docker Compose
- Port mapping and service networking
- Data persistence using Docker volumes

---

## Project Structure

```text
java-mongo-todo/
├── app/
│   ├── pom.xml
│   └── src/
│       └── main/
│           ├── java/com/example/todo/
│           └── resources/application.properties
├── Dockerfile
├── docker-compose.yml
└── README.md
```
---

## Running the Application

Build and start the service:

```bash
docker compose up --build
```

Access the API:

```text
http://localhost:3000
http://localhost:3000/todo

```
---


## Notes

This example focuses on running a Java backend together with
a database using Docker Compose, highlighting container
networking, environment configuration, and data persistence
rather than application complexity.
