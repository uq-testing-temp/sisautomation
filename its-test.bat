echo off
set arg1=%1
set arg2=%2
shift
shift


docker-machine env default

REM @FOR /f "tokens=*" %i IN ('docker-machine env default') DO @%i

docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.4.0-einsteinium

mvn clean test -Dcucumber.options="--tags %arg1%" -Dlog4j.configuration=file:log4j.properties