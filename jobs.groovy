def gitUrl = "https://git.its.uq.edu.au/its-eas-testing/"

def systems = [
	"sisautomation",
  	"myaurion"
]

def commonTags = [
    "smoke", 
    "login", 
    "menujourney", 
    "regression",
   	"debug"
]

def sisautomationTags = [
	"graduation_5010_01",
	"graduation_5020_01",
	"graduation_5050_01",
	"graduation_5060_01",
	"graduation_5070_07",
	"graduation_5080_01",
	"search",
	"studentfinances",
]

def myaurionTags = [
	"employmenthistory",
	"employeeSearch",
	"HRProfile",
	"PersonalDetails",
	"TrainingCourses",
	"Leave",
	"MyTasksAsSupervisor",
	"payroll",
	"StaffSchedule",
	"Timesheet",
	"TrainingCourses"
]

systems.each { system ->
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
	if(system == "myaurion")
		tags = commonTags + myaurionTags
	if(system == "sisautomation")
		tags = commonTags + sisautomationTags		
    tags.each { tag ->
        job("${system}-${tag}") {
        	description("<p><span style=\"font-family:trebuchet ms,helvetica,sans-serif;\"><img alt=\"\" src=\"http://10.48.56.66:8080/userContent/awzz2g.png\" style=\"width: 300px; height: 168px;\" /></span></p>This is an autogenerated job for <strong>${system}</strong> project running tests tagged as <strong><em>@${tag}</em></strong>")
            displayName("${system} @${tag}")
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
					# cleaning up old conainers
					sudo docker ps | grep 'hours ago\\|days ago' | awk '{print \$1}' | xargs --no-run-if-empty sudo docker rm -f || true"""
                )
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
                    #running the test with retry attempts
					for i in {1..3}; do 
                    	mvn test -Dcucumber.options=\"--tags @${tag} --tags ~@skipped\" -Dlog4j.configuration=file:Log4j.xml && break || sleep 5
					done"""
				)
                shell ("""#!/bin/bash
                    export SELENIUM_PORT=`cat env_SELENIUM_PORT.txt`
                    # cleaning up the container 
                    sudo docker rm -f selenium-\$SELENIUM_PORT || true"""
                      )
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
                    healthScaleFactor(5)
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