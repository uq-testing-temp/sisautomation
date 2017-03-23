$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoSignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "As a user\r\nI want to be able to SignIn to the SI-net system\r\nSo that I can manage my personal account",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "SignIn - Positive Scenario",
  "description": "",
  "id": "sign-in;signin---positive-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be signed in",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "sign-in;signin---positive-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "sign-in;signin---positive-scenario;;1"
    },
    {
      "cells": [
        "UQTRN30",
        "UQTRN"
      ],
      "line": 20,
      "id": "sign-in;signin---positive-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3364288874,
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
  "name": "I am on SI-net SignIn page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.signIn_page()"
});
formatter.result({
  "duration": 1557613890,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "SignIn - Positive Scenario",
  "description": "",
  "id": "sign-in;signin---positive-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 10,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"UQTRN30\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"UQTRN\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be signed in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN30",
      "offset": 21
    }
  ],
  "location": "SignInSteps.enterUsername(String)"
});
formatter.result({
  "duration": 77100184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN",
      "offset": 21
    }
  ],
  "location": "SignInSteps.enterPassword(String)"
});
formatter.result({
  "duration": 74491425,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.clickSignInButton()"
});
formatter.result({
  "duration": 673107294,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.signedIn()"
});
formatter.result({
  "duration": 42284223,
  "status": "passed"
});
formatter.after({
  "duration": 1082547075,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "SignIn - Negative Scenario",
  "description": "",
  "id": "sign-in;signin---negative-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should not be signed in",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "sign-in;signin---negative-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "sign-in;signin---negative-scenario;;1"
    },
    {
      "cells": [
        "UQTRN30",
        "UQTRN30"
      ],
      "line": 32,
      "id": "sign-in;signin---negative-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2119055586,
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
  "name": "I am on SI-net SignIn page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.signIn_page()"
});
formatter.result({
  "duration": 1479251352,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "SignIn - Negative Scenario",
  "description": "",
  "id": "sign-in;signin---negative-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 22,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I enter username as \"UQTRN30\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I enter password as \"UQTRN30\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should not be signed in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN30",
      "offset": 21
    }
  ],
  "location": "SignInSteps.enterUsername(String)"
});
formatter.result({
  "duration": 72528761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UQTRN30",
      "offset": 21
    }
  ],
  "location": "SignInSteps.enterPassword(String)"
});
formatter.result({
  "duration": 71449905,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.clickSignInButton()"
});
formatter.result({
  "duration": 265070700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.notSignedIn()"
});
formatter.result({
  "duration": 46594835,
  "status": "passed"
});
formatter.after({
  "duration": 801623000,
  "status": "passed"
});
});