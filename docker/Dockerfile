# Alpine Linux with OpenJDK JRE.
#FROM openjdk:12-jre-alpine
FROM openjdk:8-jre-alpine

# The LABEL instruction adds metadata to an image. A LABEL is a key-value pair.
# To include spaces within a LABEL value, use quotes and backslashes as you would in command-line parsing.
LABEL 	user.name="Rohtash Singh" \
	email="rohtash.singh@gmail.com" \
	appName="dNames" \
	version="0.0.1"

# add the APK command to add bash to the container
RUN apk add --no-cache bash

# Copy JAR into an image.
COPY Names-0.0.1-SNAPSHOT.jar /dNames/Names-0.0.1-SNAPSHOT.jar

# add a logback configuration to the application
COPY logsConfig.xml /dNames/logsConfig.xml

# Run application with this command line
#CMD ["/usr/bin/java", "-jar", "/dNames/Names-0.0.1-SNAPSHOT.jar"]
# adding the logging configuration to the command line
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "-Dlogging.config=/dNames/logsConfig.xml", "/dNames/Names-0.0.1-SNAPSHOT.jar"]

#use this script to run the application
COPY runWebApp.sh /dNames/runWebApp.sh
ENTRYPOINT ["/dNames/runWebApp.sh"]
