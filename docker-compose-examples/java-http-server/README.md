# Java HTTP Server (Docker Compose)

This example demonstrates a minimal **Java Spring Boot HTTP server**
running inside a Docker container using **Docker Compose**.

The goal is to show how a simple Java application can be containerized
and managed via Compose with minimal configuration.

---

## What This Example Covers

- Java Spring Boot application
- Docker image build via Dockerfile
- Service orchestration with Docker Compose
- Port mapping from container to host

---

## Project Structure

```text
java-http-server/
├── app/
│   ├── pom.xml
│   └── src/
│       └── main/
│           ├── java/com/example/demo/MainApplication.java
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

Access the application:

```text
http://localhost:3001

```
---


## Notes

This example focuses on containerizing a simple Java service
and running it via Docker Compose with minimal configuration.
