$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Search",
  "description": "As a user\r\nI want to be able to search records\r\nso that I can get information of the existing records",
  "id": "search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 3816695181,
  "status": "passed"
});
formatter.before({
  "duration": 14566904,
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
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1585293890,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#\tScenario Outline: Verify Login"
    },
    {
      "line": 11,
      "value": "#\t\tWhen I enter username as \"\u003cusername\u003e\""
    },
    {
      "line": 12,
      "value": "#\t\t\tAnd I enter password as \"\u003cpassword\u003e\""
    },
    {
      "line": 13,
      "value": "#\t\t\tAnd I click signin"
    },
    {
      "line": 14,
      "value": "#\t\tThen I \u003ccondition\u003e see my si-net \u003cpage\u003e"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#\t\tExamples:"
    },
    {
      "line": 17,
      "value": "#\t\t| username | password | condition | page      |"
    },
    {
      "line": 18,
      "value": "#\t\t| UQTAHME4 | IT$1Sa$S | should    | homepage  |"
    },
    {
      "line": 19,
      "value": "#\t\t| UQTRN\t   | UQTRN212 | shouldn\u0027t | loginpage |"
    }
  ],
  "line": 21,
  "name": "Create and save a search criteria",
  "description": "",
  "id": "search;create-and-save-a-search-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I enter username as \"UQTAHME4\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I enter password as \"IT$1Sa$S\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I navigate to search match",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select searchType as \"Person\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter searchParameter as \"UQ_SRCH\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I save searchCriteria",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I enter nameSearch as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click save",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I navigate to search match",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I should see my search label",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTAHME4",
      "offset": 21
    }
  ],
  "location": "loginSteps.enter_username(String)"
});
formatter.result({
  "duration": 74296247,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IT$1Sa$S",
      "offset": 21
    }
  ],
  "location": "loginSteps.enter_password(String)"
});
formatter.result({
  "duration": 61582941,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.click_signin()"
});
formatter.result({
  "duration": 1045463805,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 3830679881,
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
  "duration": 232036055,
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
  "duration": 68391486,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_save_searchCriteria()"
});
formatter.result({
  "duration": 88501762,
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
  "duration": 168416957,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_click_save()"
});
formatter.result({
  "duration": 89993659,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 2875976365,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 229718126,
  "status": "passed"
});
formatter.after({
  "duration": 1165962808,
  "status": "passed"
});
formatter.after({
  "duration": 3650078949,
  "status": "passed"
});
formatter.after({
  "duration": 3669729869,
  "status": "passed"
});
});