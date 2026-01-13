# Docker Examples Lab

This repository is a hands-on Docker learning lab created as part of my transition
into the **DevOps** field.

The goal of this project is to build small, focused, and realistic Docker examples
that demonstrate core containerization concepts used in real-world systems.

Rather than showcasing complex applications, this repository emphasizes how
containers behave, interact, and are managed in practice.

---

## Current Scope

- Standalone Docker examples
- Core Docker fundamentals
- Runtime setup and usage
- Container networking
- Environment-based configuration
- Stateful and stateless service patterns
- Clear and minimal setup for each scenario

---

## Included Examples

### MySQL & phpMyAdmin
- MySQL database running in a Docker container
- Data persistence using Docker volumes
- phpMyAdmin for database management
- Container-to-container communication via Docker networking

---

### Ubuntu Base Runtime
- Java runtime installed manually on a plain Ubuntu image
- Demonstrates image layering and base image responsibilities

---

### Java Runtime (Slim Image)
- Java application running on a prebuilt slim runtime image
- Focus on using existing runtime images instead of manual setup

---

### Java HTTP Server
- Simple HTTP service built with Java and Spring Boot
- Containerized web service with configurable port mapping
- Demonstrates application lifecycle inside a container

---

### Java Mongo Todo Service
- RESTful Java backend connected to MongoDB
- Multi-container setup using Docker networking
- Environment variable–based configuration
- Demonstrates a stateful backend service


---

## Tech Stack

- Docker
- Docker CLI
- Java
- Spring Boot
- Maven
- MongoDB
- MySQL
- phpMyAdmin

---

## Project Structure

```text
docker-examples/
├── docker-compose-examples/
│   ├── java-http-server/
│   │   ├── docker-compose.yml
│   │   └── README.md
│   ├── java-mongo-todo/
│   │   ├── docker-compose.yml
│   │   └── README.md
│   ├── wordpress-mysql/
│   │   ├── docker-compose.yml
│   │   └── README.md
│   └── README.md
│
├── mysql-phpmyadmin/
│   └── README.md
├── ubuntu-base-runtime/
│   └── README.md
├── java-runtime-slim/
│   └── README.md
├── java-http-server/
│   └── README.md
├── java-mongo-todo/
│   └── README.md
│
└── README.md
```

## Running Locally

Each example contains its own minimal README with step-by-step instructions.

Navigate into the desired example directory and follow the documented commands  
to build and run the containers.

---

## Notes

This repository focuses on:

- Practical Docker usage  
- Clear and readable Dockerfiles  
- Understanding container behavior  
- Networking and configuration fundamentals  
- DevOps-first thinking rather than framework optimization  

The examples are intentionally kept simple to highlight infrastructure and  
operational concepts over application complexity.

