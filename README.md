# sisautomation
SI Nety Automation


## Getting started

If using eclipse, checkout this repository using import and run below command to download required jars in your local system and update project runtime dependencies 

> mvn eclipse:eclipse

That will work given Java and maven are installed.

Download the latest chromedriver and put executable on the system path. https://sites.google.com/a/chromium.org/chromedriver/downloads
Update: we use [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) library. This library is aimed to automate the Selenium Webdriver binaries management in runtime for Java.
It manages all drivers:
- chromedriver
- operadriver
- IEDriverServer.exe
- MicrosoftWebDriver
- phantomjs
- geckodriver

## Running tests

Help:
> mvn test -Dcucumber.options="--help"

Running with a tag
> mvn test -Dcucumber.options="--tags @login"

More
https://cucumber.io/docs/reference/jvm#java

## Logging

We use [log4j](https://www.tutorialspoint.com/log4j/log4j_overview.htm) as a logger.

log4j has three main components:

- **loggers**: Responsible for capturing logging information.

- **appenders**: Responsible for publishing logging information to various preferred destinations.

- **layouts**: Responsible for formatting logging information in different styles.

![](https://www.tutorialspoint.com/log4j/images/log4j-arch.jpg)

Configuring log4j involves assigning the Level, defining Appender, and specifying Layout objects in a configuration file.

To configure, update 'log4j.properties' file:

>
	# Define the root logger with appender X
	log4j.rootLogger = DEBUG, X
	# Set the appender named X to be a File appender
	log4j.appender.X=org.apache.log4j.FileAppender
	# Define the layout for X appender
	log4j.appender.X.layout=org.apache.log4j.PatternLayout
	log4j.appender.X.layout.conversionPattern=%m%n
	

Run with maven:

> mvn test -Dcucumber.options="--tags @login" -Dlog4j.configuration=file:log4j.properties
