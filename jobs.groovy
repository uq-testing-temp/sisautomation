def tags = [
    "smoke", 
    "login", 
    "menujourney", 
    "regression"
]

def systems = [
	"sisautomation",
  	"myaurion"
]

def gitUrl = "https://git.its.uq.edu.au/its-eas-testing/"

for(system in systems) {
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
            steps {
                shell"""#!/bin/sh
                        Xvfb -ac :99 -screen 0 1280x1024x16 &
                        export DISPLAY=:99
						mvn test -Dcucumber.options=\"--tags @${tag}\""""
            }
             publishers {
                cucumberReports {
                    jsonReportPath('target/')
                    pluginUrlPath('url')
                    fileIncludePattern('**/*.json')
                }
            }
        }
    }
}