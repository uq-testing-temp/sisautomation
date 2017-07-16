echo off
set arg1=%1
set arg2=%2
shift
shift

mvn clean test -Dcucumber.options="--tags %arg1%" -Dlog4j.configuration=file:log4j.properties