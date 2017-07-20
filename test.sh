#!/bin/bash

clear
echo -e "\e[0m--------------------------------------------------------------------------------"
echo -e "\e[1m Environment variables required:"
echo -e "\e[1m  \$TAG=$TAG"

 
echo -e "\033[1m Starting docker"
docker rm -f selenium || true
docker run --name selenium -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.4.0-einsteinium 

echo -e "\033[1m Running test"
mvn clean test -Dcucumber.options="--tags $TAG" -Dlog4j.configuration=file:log4j.properties
STATUS=$?

if [ $STATUS -eq 0 ]; then
echo -e "\e[42m Test Passed"
else
echo -e "\e[41m Test Failed"
fi
echo -e "\e[0m--------------------------------------------------------------------------------"

docker rm -f selenium || true