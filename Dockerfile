# Use maven image
FROM maven:3.9.4-eclipse-temurin-11

# Create the directory structure
RUN mkdir -p /home/project1/app
WORKDIR /home/project1/app

# Copy the source code to the container
COPY . /home/project1/app

# Build the Java project using Maven
RUN mvn install

# Expose the port your application will listen on
EXPOSE 8080

# Define the command to run your Java application
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]