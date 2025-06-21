# Use official Java runtime as base image
FROM eclipse-temurin:17-jdk-jammy

# Set the location of the jar file
ARG JAR_FILE=target/*.jar

# Copy the jar into the image
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
