# Technical QA Fundamentals

This repository contains the exercises for the Technical QA Fundamentals course.

To get started you will need docker, maven and Java 17.

To run the application in the integration-testing module you need a docker PostgreSQL Database:

```bash
  docker run --name postgres-docker -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```

The setup.sql file contains the basic script to get your database ready.

Testcontainers will automatically start and stop a new container for each test run with the `test` profile. the
setup.sql script will also be executed when the container is started.


