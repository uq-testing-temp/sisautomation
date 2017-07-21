#!/bin/bash
# cleaning up old containers
docker ps | grep 'hours ago' | awk '{print $1}' | xargs --no-run-if-empty docker rm -f

#selecting free port for selenium #TODO
export SELENIUM_PORT=$(for port in $(seq 4444 65000); do echo -ne "\035" | telnet 127.0.0.1 $port > /dev/null 2>&1; [ $? -eq 1 ] && echo "$port" && break; done)
echo $SELENIUM_PORT > env_SELENIUM_PORT.txt

# launching selenium hub docker container
sudo docker rm -f selenium-$SELENIUM_PORT || true # cleaning up container if exist
sudo docker run --name selenium-$SELENIUM_PORT -d -p $SELENIUM_PORT:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.4.0-einsteinium 
sleep 5 # allowing time to start