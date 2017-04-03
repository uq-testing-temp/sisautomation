$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a user\r\nI want to be able to search records\r\nso that I can get information of the existing records",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Correct Login",
  "description": "",
  "id": "search;correct-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I \u003ccondition\u003e see my si-net \u003cpage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "search;correct-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "condition",
        "page"
      ],
      "line": 16,
      "id": "search;correct-login;;1"
    },
    {
      "cells": [
        "UQTRN42",
        "UQTRN",
        "should",
        "homepage"
      ],
      "line": 17,
      "id": "search;correct-login;;2"
    },
    {
      "cells": [
        "UQTRN",
        "UQTRN212",
        "shouldn\u0027t",
        "loginpage"
      ],
      "line": 18,
      "id": "search;correct-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2588214442,
  "status": "passed"
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
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 1712267916,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Correct Login",
  "description": "",
  "id": "search;correct-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"UQTRN42\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"UQTRN\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see my si-net homepage",
  "matchedColumns": [
    2,
    3
  ],
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
  "duration": 116420954,
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
  "duration": 88337630,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 738095682,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_si_net_homepage()"
});
formatter.result({
  "duration": 66595598,
  "status": "passed"
});
formatter.after({
  "duration": 903029910,
  "status": "passed"
});
formatter.before({
  "duration": 2083877520,
  "status": "passed"
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
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 1611231341,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Correct Login",
  "description": "",
  "id": "search;correct-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"UQTRN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"UQTRN212\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I shouldn\u0027t see my si-net loginpage",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_username(String)"
});
formatter.result({
  "duration": 76544630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN212",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_password(String)"
});
formatter.result({
  "duration": 76183406,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 212146011,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_shouldnt_see_my_si_net_loginpage()"
});
formatter.result({
  "duration": 54492382,
  "status": "passed"
});
formatter.after({
  "duration": 795039953,
  "status": "passed"
});
formatter.before({
  "duration": 2118147189,
  "status": "passed"
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
formatter.match({
  "location": "searchSteps.setup()"
});
formatter.result({
  "duration": 1621152141,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "create and save a search criteria",
  "description": "",
  "id": "search;create-and-save-a-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I navigate to search match",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select searchType as \"Person\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter searchParameter as \"UQ_SRCH\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I save searchCriteria",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I enter nameSearch as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click save",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I navigate to search match",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see my search label",
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
  "duration": 83462724,
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
  "duration": 82609390,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 718712827,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 1437012782,
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
  "duration": 311900020,
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
  "duration": 83464006,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_save_searchCriteria()"
});
formatter.result({
  "duration": 100556655,
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
  "duration": 2121114928,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_click_save()"
});
formatter.result({
  "duration": 2130346646,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 509143497,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 2292597687,
  "status": "passed"
});
formatter.after({
  "duration": 821560009,
  "status": "passed"
});
});