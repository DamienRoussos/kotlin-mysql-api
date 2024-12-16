# Build stage
FROM openjdk:21-slim as builder

WORKDIR /build

# Copy the Gradle executable and wrapper
COPY gradlew .
COPY gradle gradle

# Copy the build script files
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copy your application source
COPY src src

# Grant execution permissions to the gradlew script
RUN chmod +x ./gradlew

# Build the application using Gradle Wrapper
RUN ./gradlew bootJar

# Runtime stage
FROM openjdk:21-slim

# Install curl for healthcheck
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# Set the deployment directory
WORKDIR /api

# Copy only the built artifact from the build stage
COPY --from=builder /build/build/libs/*.jar app.jar

# Environment variables matching your application.yml
ENV SPRING_APPLICATION_NAME=kotlin-mysql \
    SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/mysql \
    SPRING_DATASOURCE_USERNAME=root \
    SPRING_DATASOURCE_PASSWORD=root \
    SPRING_DATASOURCE_DRIVER_CLASS_NAME=com.mysql.cj.jdbc.Driver \
    SPRING_JPA_HIBERNATE_DDL_AUTO=update \
    SPRING_JPA_SHOW_SQL=true \
    SERVER_PORT=8080

# Expose the port your application runs on
EXPOSE 8080

# Add healthcheck
HEALTHCHECK --interval=30s --timeout=3s \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

# Command to run your app using the java binary with additional JVM options
ENTRYPOINT ["java", \
    "-XX:+UseContainerSupport", \
    "-XX:MaxRAMPercentage=75.0", \
    "-Djava.security.egd=file:/dev/./urandom", \
    "-jar", \
    "app.jar"]
