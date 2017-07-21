def gitUrl = "https://git.its.uq.edu.au/its-eas-testing/"

def systems = [
	"sisautomation",
  	"myaurion"
]

def tags = [
    "smoke", 
    "login", 
    "menujourney", 
    "regression",
   	"debug"
]

for(system in systems) {
    buildMonitorView("${system} monitor") {
        description("All jobs for project ${system}")
        jobs { regex("${system}.*")}
	}
    listView("${system} jobs") {
        description("All jobs for project ${system}")
        filterBuildQueue()
        filterExecutors()
        jobs { regex("${system}.*")}
        columns {
            status()
            weather()
            name()
            lastSuccess()
            lastFailure()
            lastDuration()
            buildButton()
        }
	}
    for(tag in tags) {
        job("${system}-${tag}") {
            scm {
                git {
                    remote {
                        name('origin')
                        url("${gitUrl}${system}.git")
                        credentials('05faefb2-91e4-4b94-ad13-5a8152d992cc')
                    }
                    branch('**/master')
                }
            }
            triggers { cron('@daily') }
            wrappers { 
                timeout { absolute(60) } 
                colorizeOutput()
                timestamps()
            }
            steps {
                shell ("""#!/bin/bash
                    #selecting free port for selenium #TODO
                    export SELENIUM_PORT=\$(for port in \$(seq 4444 65000); do echo -ne \"\\035\" | telnet 127.0.0.1 \$port > /dev/null 2>&1; [ \$? -eq 1 ] && echo \"\$port\" && break; done)
					echo \$SELENIUM_PORT > env_SELENIUM_PORT.txt"""
				)
				shell ("""#!/bin/bash
					export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`
                    # launching selenium hub docker container
					sudo docker rm -f selenium-\$SELENIUM_PORT || true # cleaning up container if exist
                    sudo docker run --name selenium-\$SELENIUM_PORT -d -p \$SELENIUM_PORT:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.4.0-einsteinium 
                    sleep 5 # allowing time to start"""
                )
                shell ("""#!/bin/bash
					export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`
                    #running the test
                    mvn test -Dcucumber.options=\"--tags @${tag}\" -Dlog4j.configuration=file:Log4j.xml"""
				)
                conditionalSteps  {
                    condition { alwaysRun() }
                    runner('Fail')
                    steps {
                    shell ("""#!/bin/bash
                        export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`
                        # cleaning up the container 
                        sudo docker rm -f selenium-\$SELENIUM_PORT || true"""
                    )
                    }
                }
            }
            publishers {
                cucumberReports {
                    jsonReportPath('target/')
                    pluginUrlPath('url')
                    fileIncludePattern('**/*.json')
                }
                archiveJunit('target/surefire-reports/*.xml') {
                    allowEmptyResults()
                    retainLongStdout()
                    healthScaleFactor(1.5)
                    testDataPublishers {
                		publishTestStabilityData()
            		}
                }
                archiveArtifacts {
                    pattern('target/screenshots/*.*')
                    allowEmpty()
        		}
			}
    	}
	}
}