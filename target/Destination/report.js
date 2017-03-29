$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a user\r\nI want to be able to search records\r\nso that I can get information of the existing records",
  "id": "search",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I open mysinet url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter username as \"UQTRN45\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click signin",
  "keyword": "And "
});
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 4307401243,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN45",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_username(String)"
});
formatter.result({
  "duration": 74662364,
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
  "duration": 65890691,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 724964736,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "create a search criteria",
  "description": "",
  "id": "search;create-a-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I navigate to search match",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I select searchType as \"Person\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter searchParameter as \"UQ_SRCH\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I save searchCriteria",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter nameSearch as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click save",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on \"ReturnToAdvancedSearch\" link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see my search label as \"standard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 949261082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Person",
      "offset": 24
    }
  ],
  "location": "searchSteps.searchType(String)"
});
formatter.result({
  "duration": 42919383,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027win0tblSrchFlds\u0027]\"}\n  (Session info: chrome\u003d56.0.2924.87)\n  (Driver info: chromedriver\u003d2.28.455520 (cc17746adff54984afff480136733114c6b3704b),platform\u003dWindows NT 10.0.10586 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 39 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027CA-HR-8H8T992\u0027, ip: \u0027172.23.154.171\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.28.455520 (cc17746adff54984afff480136733114c6b3704b), userDataDir\u003dC:\\Users\\uqsbajaj\\AppData\\Local\\Temp\\scoped_dir4020_313}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d56.0.2924.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: ac9b2bb99188620b0783d61959d5bddb\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027win0tblSrchFlds\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:476)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat stepDefinition.java.searchSteps.searchType(searchSteps.java:48)\r\n\tat ✽.And I select searchType as \"Person\"(search.feature:14)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});