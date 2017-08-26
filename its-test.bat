set arg1=%1

mvn clean test -Dcucumber.options="--tags %arg1% --tags ~@skipped" -Dlog4j.configuration=file:Log4j.xml