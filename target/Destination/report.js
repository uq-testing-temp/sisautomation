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
  "name": "I enter username as \"UQTRN42\"",
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
  "duration": 5970137424,
  "status": "passed"
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
  "duration": 139540160,
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
  "duration": 97193476,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 1123328871,
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
  "duration": 1108781583,
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
  "duration": 315960745,
  "status": "passed"
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