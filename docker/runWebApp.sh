#!/bin/bash
# Runs the application into the container
#java -jar /dNames.jar
java -Dlogging.config=/logsConfig.xml -jar /dNames.jar
