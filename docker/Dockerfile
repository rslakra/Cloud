# Alpine Linux with OpenJDK JRE.
#FROM openjdk:12-jre-alpine
FROM openjdk:8-jre-alpine

# Copy JAR into an image.
COPY Names-0.0.1-SNAPSHOT.jar /dNames.jar

# Run application with this command line
CMD ["/usr/bin/java", "-jar", "/dNames.jar"]
