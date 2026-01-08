# MySQL & phpMyAdmin with Docker

This example demonstrates how to run a MySQL database and manage it using phpMyAdmin with Docker.

##  Architecture

- MySQL runs in a Docker container
- Database data is persisted using Docker volumes
- phpMyAdmin runs in a separate container
- Containers communicate via Docker networking

## Steps

###  Run MySQL Container

```bash
docker run -d --name mysql-server -p 3306:3306 -v /opt/mysql-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=test123 mysql:8.0
```

###  Run phpMyAdmin Container

```bash
docker run -d --name phpmyadmin -p 8000:80 --link mysql-server:db phpmyadmin/phpmyadmin

```

###  Access phpMyAdmin

Open your browser and go to:

```bash
http://localhost:8000
```

## Login Credentials

- **Server:** `db`
- **Username:** `root`
- **Password:** `test123`

##  Key Concepts Covered

- Docker containers
- Port mapping
- Environment variables
- Data persistence with volumes
- Container linking and networking

## Outcome

A fully working MySQL environment that can be managed via a web interface using Docker.

