# Docker Compose Examples

This directory contains **Docker Compose–based examples** that demonstrate
how multiple containers work together as a single application stack.

The focus here is orchestration rather than individual container behavior.

---

## What These Examples Cover

- Multi-container application setup
- Service-to-service communication
- Docker networking fundamentals
- Volume-based data persistence
- Environment variable configuration
- Local development orchestration with Docker Compose

---

## Included Examples

### Java HTTP Server
- Java Spring Boot application
- Built and run using Docker Compose
- Demonstrates service definition and port mapping

---

### Java Mongo Todo
- Java REST API connected to MongoDB
- Multi-service setup with internal networking
- Persistent database storage using volumes

---

### WordPress & MySQL
- WordPress application backed by MySQL
- Classic stateful multi-container example
- Persistent data using named volumes
- Environment-driven configuration

---

## Directory Structure

```text
docker-compose-examples/
├── java-http-server/
│   ├── docker-compose.yml
│   └── README.md
├── java-mongo-todo/
│   ├── docker-compose.yml
│   └── README.md
├── wordpress-mysql/
│   ├── docker-compose.yml
│   └── README.md
└── README.md
```
---

## Notes

* Each example is self-contained

* Compose files are kept minimal and readable

* No production-level tuning is applied

* The goal is understanding orchestration basics

These examples are designed to reflect real DevOps workflows
without unnecessary complexity.
