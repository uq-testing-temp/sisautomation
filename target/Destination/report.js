$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "As a user I want to be able to login",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should \u003cexpectResult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "expectResult"
      ],
      "line": 16,
      "id": "as-a-user-i-want-to-be-able-to-login;;;1"
    },
    {
      "cells": [
        "UQTAHME4",
        "IT$1Sa$S",
        "beLoggedIn"
      ],
      "line": 17,
      "id": "as-a-user-i-want-to-be-able-to-login;;;2"
    },
    {
      "cells": [
        "wrongName",
        "wrongPassword",
        "seeAnError"
      ],
      "line": 18,
      "id": "as-a-user-i-want-to-be-able-to-login;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5215218277,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepsDefinitions.i_am_on_login_page()"
});
formatter.result({
  "duration": 355582026,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"UQTAHME4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"IT$1Sa$S\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 13,
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
  "location": "testStepsDefinitions.enter_username(String)"
});
formatter.result({
  "duration": 91381503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IT$1Sa$S",
      "offset": 21
    }
  ],
  "location": "testStepsDefinitions.enter_password(String)"
});
formatter.result({
  "duration": 60261988,
  "status": "passed"
});
formatter.match({
  "location": "testStepsDefinitions.click_signin()"
});
formatter.result({
  "duration": 710903742,
  "status": "passed"
});
formatter.match({
  "location": "testStepsDefinitions.i_should_be_logged_in()"
});
formatter.result({
  "duration": 34746424,
  "status": "passed"
});
formatter.after({
  "duration": 1216279106,
  "status": "passed"
});
formatter.before({
  "duration": 4290560457,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepsDefinitions.i_am_on_login_page()"
});
formatter.result({
  "duration": 288022056,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"wrongName\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"wrongPassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click signin",
  "keyword": "When "
});
formatter.step({
  "line": 13,
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
  "location": "testStepsDefinitions.enter_username(String)"
});
formatter.result({
  "duration": 75472802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wrongPassword",
      "offset": 21
    }
  ],
  "location": "testStepsDefinitions.enter_password(String)"
});
formatter.result({
  "duration": 63125386,
  "status": "passed"
});
formatter.match({
  "location": "testStepsDefinitions.click_signin()"
});
formatter.result({
  "duration": 177702688,
  "status": "passed"
});
formatter.match({
  "location": "testStepsDefinitions.i_should_see_an_error()"
});
formatter.result({
  "duration": 39995832,
  "status": "passed"
});
formatter.after({
  "duration": 1110473314,
  "status": "passed"
});
});