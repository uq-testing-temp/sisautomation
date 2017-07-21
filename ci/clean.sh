#!/bin/bash
export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`

# cleaning up the container 
sudo docker rm -f selenium-$SELENIUM_PORT || true