# Fullstack Backend

A Spring Boot Kotlin application.

## Running with Docker

### Option 1: Using Docker directly

Build the Docker image:
```bash
cd backend/fullstack
docker build -t fullstack-backend .
```

Run the container:
```bash
docker run -p 8080:8080 fullstack-backend
```

### Option 2: Using Docker Compose

Build and run the application with Docker Compose:
```bash
cd backend/fullstack
docker-compose up -d
```

Stop the container:
```bash
docker-compose down
```

## Development

### Prerequisites
- JDK 21
- Gradle 8+

### Running locally without Docker
```bash
./gradlew bootRun
```

### Building the application
```bash
./gradlew build
``` 