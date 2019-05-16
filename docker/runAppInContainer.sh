#!/bin/bash
# docker run -d -p 8080:8080 dnames:latest

# map the directory of container to a directory on the host when you run our container
docker run -d --name dNames -v /tmp/log:/tmp/log/dNames/ -p 8016:8080 dnames:latest
