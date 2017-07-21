[![Build Status](https://ci.devops.its.uq.edu.au/user/uqdalter/my-views/view/ITS/job/ITS-Testing-graduations-debug/badge/icon)](https://ci.devops.its.uq.edu.au/user/uqdalter/my-views/view/ITS/job/ITS-Testing-graduations-debug/)

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

### Windows
Help:
> mvn test -Dcucumber.options="--help"

Running with a tag
> mvn test -Dcucumber.options="--tags @login"

or:

> its-test @tag

More
https://cucumber.io/docs/reference/jvm#java

## Running with Docker

Launch docker selenium container:

> docker run -d -p 4444:4444 --name selenium selenium/standalone-chrome:3.4.0-einsteinium

update properties file:
#webdriver=localhost
webdriver=192.168.99.100:4444

where 192.168.99.100:4444 is ip and port.
KNow the ip run:
docker-machine env default


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



# TODO
- [] Implement [Dependency injection](http://www.thinkcode.se/blog/2017/04/01/sharing-state-between-steps-in-cucumberjvm-using-picocontainer)

#Jenkins plugins
https://plugins.jenkins.io/gitlab-plugin
https://plugins.jenkins.io/gitlab-logo
https://plugins.jenkins.io/gitlab-hook
https://plugins.jenkins.io/job-dsl
https://plugins.jenkins.io/description-setter
https://plugins.jenkins.io/cucumber-reports
https://plugins.jenkins.io/greenballs
https://plugins.jenkins.io/build-monitor-plugin
https://plugins.jenkins.io/test-stability
https://plugins.jenkins.io/conditional-buildstep
https://wiki.jenkins.io/display/JENKINS/AnsiColor+Plugin
https://wiki.jenkins-ci.org/display/JENKINS/Simple+Theme+Plugin

