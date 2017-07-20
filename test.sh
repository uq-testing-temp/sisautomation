#!/bin/bash
set -axeE

clear
echo -e "\e[0m--------------------------------------------------------------------------------"
echo -e "\e[1m Environment variables required:"
echo -e "\e[1m  \$TAG=$TAG"

#defining port for selenium #TODO: select free port automatically
export SELENIUM_PORT=$(for port in $(seq 4444 65000); do echo -ne "\035" | telnet 127.0.0.1 $port > /dev/null 2>&1; [ $? -eq 1 ] && echo "$port" && break; done)

# cleaning up container if exist
sudo docker rm -f selenium-$SELENIUM_PORT || true

# launching selenium hub docker container
sudo docker run --name selenium-$SELENIUM_PORT -d -p $SELENIUM_PORT:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.4.0-einsteinium 

# allowing time to start 
sleep 5

#running the test
mvn test -Dcucumber.options="--tags @login" -Dlog4j.configuration=file:Log4j.xml
echo $SELENIUM_PORT > env_SELENIUM_PORT.txt