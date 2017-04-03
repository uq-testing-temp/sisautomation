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
  "duration": 4767515145,
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
  "duration": 93073629,
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
  "duration": 74973983,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 656724266,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "create and save a search criteria",
  "description": "",
  "id": "search;create-and-save-a-search-criteria",
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
  "name": "I navigate to search match",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see my search label",
  "keyword": "Then "
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 1015208579,
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
  "duration": 309338416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQ_SRCH",
      "offset": 28
    }
  ],
  "location": "searchSteps.i_enter_searchParameter_as(String)"
});
formatter.result({
  "duration": 91314672,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_save_searchCriteria()"
});
formatter.result({
  "duration": 98854160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 23
    }
  ],
  "location": "searchSteps.i_enter_nameSearch_as(String)"
});
formatter.result({
  "duration": 2081847485,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_click_save()"
});
formatter.result({
  "duration": 2095944807,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 507570926,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 2273152919,
  "status": "passed"
});
});