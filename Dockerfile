# Use a base image with Java
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Init.java file into the container
COPY Init.java .

# Compile and run the Java application
RUN javac Init.java

# Run the Java application
CMD ["java", "Init"]