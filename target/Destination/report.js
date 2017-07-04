$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Graduation",
  "description": "As a user\r\nI want to be able to login",
  "id": "graduation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "",
  "description": "",
  "id": "graduation;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should \u003cexpectResult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "graduation;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "expectResult"
      ],
      "line": 17,
      "id": "graduation;;;1"
    },
    {
      "cells": [
        "UQTAHME4",
        "IT$1Sa$S",
        "beLoggedIn"
      ],
      "line": 18,
      "id": "graduation;;;2"
    },
    {
      "cells": [
        "wrongName",
        "wrongPassword",
        "seeAnError"
      ],
      "line": 19,
      "id": "graduation;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2953785806,
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
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1456070267,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "graduation;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I enter username as \"UQTAHME4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter password as \"IT$1Sa$S\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should beLoggedIn",
  "matchedColumns": [
    2
  ],
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
  "duration": 72565348,
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
  "duration": 60595524,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.click_signin()"
});
formatter.result({
  "duration": 934413214,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.i_should_be_logged_in()"
});
formatter.result({
  "duration": 65044400,
  "status": "passed"
});
formatter.after({
  "duration": 1239996093,
  "status": "passed"
});
formatter.before({
  "duration": 2406009916,
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
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1381953021,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "graduation;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I enter username as \"wrongName\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter password as \"wrongPassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should seeAnError",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "wrongName",
      "offset": 21
    }
  ],
  "location": "loginSteps.enter_username(String)"
});
formatter.result({
  "duration": 79609531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wrongPassword",
      "offset": 21
    }
  ],
  "location": "loginSteps.enter_password(String)"
});
formatter.result({
  "duration": 60920210,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.click_signin()"
});
formatter.result({
  "duration": 585472065,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.i_should_see_an_error()"
});
formatter.result({
  "duration": 45103298,
  "status": "passed"
});
formatter.after({
  "duration": 1066649479,
  "status": "passed"
});
formatter.before({
  "duration": 2373930427,
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
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.i_am_on_login_page()"
});
formatter.result({
  "duration": 1350677470,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "graduation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I enter username as \"UQTAHME4\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter password as \"IT$1Sa$S\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should beLoggedIn",
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
  "duration": 94898052,
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
  "duration": 59034919,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.click_signin()"
});
formatter.result({
  "duration": 981298549,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.i_should_be_logged_in()"
});
formatter.result({
  "duration": 67260907,
  "status": "passed"
});
formatter.after({
  "duration": 1237741023,
  "status": "passed"
});
});