#!/bin/bash
# docker run -d -p 8080:8080 dnames:latest

# map the directory of container to a directory on the host when you run our container
#docker run -d --name dNames -v /tmp/log:/tmp/log/dNames/ -p 8080:8080 dnames:latest


# Make sure you have published the 'dNames' image you created by pushing it to a registry.
# We use that shared image here.
# Be sure your image works as a deployed container.
# Run this command, slotting in your info for 'username', 'repo', and 'tag':
# docker run -p 4000:80 username/repo:tag, then visit http://localhost:8080/.
echo
echo "Once service starts, open browser, then visit 'http://localhost:8080/'"
echo
docker run -p 8080:8080 rlakradocker/repository:dNames
