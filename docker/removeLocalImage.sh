#!/bin/bash
# Removes the local image for the specified <image id>

if [ "$#" -eq 0 ]; then
    echo
    echo "IMAGE_ID must provide"
    echo
    echo "Syntax:"
    echo "docker image rm <IMAGE_ID>"
    echo
    exit 1
else
    echo
    echo "Removing local docker image for IMAGE_ID:[$1]"
    docker image rm $1
    echo
fi
