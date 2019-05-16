#!/bin/bash
# Runs the application into the container
#java -jar /dNames/Names-0.0.1-SNAPSHOT.jar
java -Dlogging.config=/dNames/logsConfig.xml -jar /dNames/Names-0.0.1-SNAPSHOT.jar
