#!/bin/bash

export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`

#running the test
mvn test -Dcucumber.options="--tags @login" -Dlog4j.configuration=file:Log4j.xml