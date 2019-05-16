#!/bin/bash
# You can push an images to this repository using the following commands:
#docker tag local-image:tagname new-repo:tagname
#docker push new-repo:tagname

docker tag dnames:latest rlakradocker/repository:dNames
docker push rlakradocker/repository:dNames
