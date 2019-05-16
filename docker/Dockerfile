# Alpine Linux with OpenJDK JRE.
#FROM openjdk:12-jre-alpine
FROM openjdk:8-jre-alpine

# add the APK command to add bash to the container
RUN apk add --no-cache bash

# Copy JAR into an image.
COPY Names-0.0.1-SNAPSHOT.jar /dNames.jar

# add a logback configuration to the application
COPY logsConfig.xml /logsConfig.xml

# Run application with this command line
#CMD ["/usr/bin/java", "-jar", "/dNames.jar"]
# adding the logging configuration to the command line
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "-Dlogging.config=/logsConfig.xml", "/dNames.jar"]

#use this script to run the application
COPY runWebApp.sh /runWebApp.sh
ENTRYPOINT ["/runWebApp.sh"]
