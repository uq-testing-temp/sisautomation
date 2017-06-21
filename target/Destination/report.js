$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("graduation.feature");
formatter.feature({
  "line": 1,
  "name": "Graduation",
  "description": "As a user\r\nI want to make sure that \r\nUGRD Student with no enrolment, outstanding milestones or graduation conditions\r\ngraduation status can be changed from ‘Conditional’ to ‘Eligible’",
  "id": "graduation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2886243489,
  "status": "passed"
});
formatter.before({
  "duration": 67352,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I open mysinet url",
  "keyword": "Given "
});
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 701959846,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Able to see graduation management search criteria",
  "description": "",
  "id": "graduation;able-to-see-graduation-management-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see my eventID label",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN42",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_username(String)"
});
formatter.result({
  "duration": 87541521,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_password(String)"
});
formatter.result({
  "duration": 56340563,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 826186381,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.management()"
});
formatter.result({
  "duration": 1114927153,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 2054192997,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"UQ_GR_STUD_SRCH_CAMPUS_EVENT_NBR_LBL\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 51 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CA-HR-1NV76Z1\u0027, ip: \u002710.48.56.254\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\uqdalter\\AppData\\Local\\Temp\\scoped_dir7432_11623}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c208437f8361da121c79bbf576233bc4\n*** Element info: {Using\u003did, value\u003dUQ_GR_STUD_SRCH_CAMPUS_EVENT_NBR_LBL}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat stepDefinition.graduationSteps.i_should_see_my_search_label(graduationSteps.java:57)\r\n\tat ✽.Then I should see my eventID label(graduation.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 829269177,
  "status": "passed"
});
formatter.after({
  "duration": 3156154254,
  "status": "passed"
});
formatter.before({
  "duration": 2469241800,
  "status": "passed"
});
formatter.before({
  "duration": 44260,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I open mysinet url",
  "keyword": "Given "
});
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 584715786,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Able to see graduation management search criteria",
  "description": "",
  "id": "graduation;able-to-see-graduation-management-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I Search Gratuates",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I choose a gratuate",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Graduation Status as \"Eligible\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I should see my userID label",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN42",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_username(String)"
});
formatter.result({
  "duration": 99414391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_password(String)"
});
formatter.result({
  "duration": 56932297,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 705652017,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.management()"
});
formatter.result({
  "duration": 1206338526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Undergraduate",
      "offset": 29
    }
  ],
  "location": "graduationSteps.academicCareer(String)"
});
formatter.result({
  "duration": 343680733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conditional",
      "offset": 48
    }
  ],
  "location": "graduationSteps.graduationStatusParameter(String)"
});
formatter.result({
  "duration": 182882401,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 88270206,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_choose_a_gratuate()"
});
formatter.result({
  "duration": 20244719,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"RESULT16$0\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CA-HR-1NV76Z1\u0027, ip: \u002710.48.56.254\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\uqdalter\\AppData\\Local\\Temp\\scoped_dir5792_13026}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f57b3fabc6408fc5ae66f1ab65d3d6e7\n*** Element info: {Using\u003did, value\u003dRESULT16$0}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat stepDefinition.graduationSteps.i_choose_a_gratuate(graduationSteps.java:86)\r\n\tat ✽.And I choose a gratuate(graduation.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Eligible",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "graduationSteps.label()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 723053199,
  "status": "passed"
});
formatter.after({
  "duration": 3162784574,
  "status": "passed"
});
});