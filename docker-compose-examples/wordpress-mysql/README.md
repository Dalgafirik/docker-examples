# WordPress & MySQL (Docker Compose)

This example demonstrates running **WordPress** with a **MySQL** database
using **Docker Compose**.

The goal is to show how multiple services can be orchestrated together
with persistent storage using Docker volumes.

---

## What This Example Covers

- WordPress container
- MySQL database container
- Service-to-service communication
- Persistent data using Docker volumes
- Port mapping from container to host

---

## Project Structure

```text
wordpress-mysql/
├── docker-compose.yml
└── README.md
```
---

## Running the Application

Start the service:

```bash
docker compose up 
```

Access WordPress in your browser:

```text
http://localhost:8080

```
---


## Notes

This example focuses on:
* Multi-container orchestration with Docker Compose
* Data persistence using named volumes
* Real-world service dependencies (app + database)
* Keeping configuration minimal and readable
