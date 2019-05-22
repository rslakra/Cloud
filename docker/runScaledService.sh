#!/bin/bash
# A docker-compose.yml file is a YAML file that defines how Docker containers should behave in production.
# Run the load-balanced and scaled application.
# Our single service stack is running 3 container instances of our deployed image on one host. 
docker stack deploy -c docker-compose.yml dnames
