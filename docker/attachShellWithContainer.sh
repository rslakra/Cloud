#!/bin/bash
# attach a shell to our container but you can only execute commands 
# that are already in the image.
#
# docker exec -it dNames sh

# You can add packages to Alpine in your Dockerfile using APK command, and
# Finally, after you run the container, you can shell in with bash
docker exec -it dNames bash

