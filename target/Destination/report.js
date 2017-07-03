$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("graduation.feature");
formatter.feature({
  "line": 1,
  "name": "Graduation",
  "description": "As a user\r\nI want to make sure that \r\nUGRD Student with no enrolment, outstanding milestones or graduation conditions\r\ngraduation status can be changed from ‘Conditional’ to ‘Eligible’",
  "id": "graduation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2736046220,
  "status": "passed"
});
formatter.before({
  "duration": 35143,
  "status": "passed"
});
formatter.before({
  "duration": 28613,
  "status": "passed"
});
formatter.before({
  "duration": 26746,
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
  "duration": 264530999,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Demo: Able to see graduation management search criteria",
  "description": "",
  "id": "graduation;demo:-able-to-see-graduation-management-search-criteria",
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
  "duration": 86957252,
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
  "duration": 53812583,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 676068034,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3129702847,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 2056796019,
  "status": "passed"
});
formatter.after({
  "duration": 848953122,
  "status": "passed"
});
formatter.after({
  "duration": 3236460007,
  "status": "passed"
});
formatter.after({
  "duration": 3137937855,
  "status": "passed"
});
formatter.after({
  "duration": 3089970545,
  "status": "passed"
});
formatter.before({
  "duration": 2899287775,
  "status": "passed"
});
formatter.before({
  "duration": 25502,
  "status": "passed"
});
formatter.before({
  "duration": 19593,
  "status": "passed"
});
formatter.before({
  "duration": 32344,
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
  "duration": 212249166,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Demo: Able to change graduation status",
  "description": "",
  "id": "graduation;demo:-able-to-change-graduation-status",
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
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Graduation Status as \"Pending\"",
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
  "duration": 84338309,
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
  "duration": 57220536,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 731639018,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3055169171,
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
  "duration": 210102633,
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
  "duration": 173072000,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 78953940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2080816528,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2113437471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pending",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8298590634,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2107122587,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.label()"
});
formatter.result({
  "duration": 2039840220,
  "status": "passed"
});
formatter.after({
  "duration": 736800398,
  "status": "passed"
});
formatter.after({
  "duration": 3091250627,
  "status": "passed"
});
formatter.after({
  "duration": 3022158854,
  "status": "passed"
});
formatter.after({
  "duration": 3132703078,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"\u003cstatus2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status \u003csaved_condition\u003e be saved",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;",
  "rows": [
    {
      "cells": [
        "student",
        "status1",
        "status2",
        "saved_condition"
      ],
      "line": 49,
      "id": "graduation;demo:-verify-graduation-statuses;;1"
    },
    {
      "cells": [
        "1",
        "pending",
        "eligible",
        "should"
      ],
      "line": 50,
      "id": "graduation;demo:-verify-graduation-statuses;;2"
    },
    {
      "cells": [
        "1",
        "conditional",
        "unsuccesfull",
        "should not"
      ],
      "line": 51,
      "id": "graduation;demo:-verify-graduation-statuses;;3"
    },
    {
      "cells": [
        "2",
        "conditional",
        "final",
        "should not"
      ],
      "line": 52,
      "id": "graduation;demo:-verify-graduation-statuses;;4"
    },
    {
      "cells": [
        "2",
        "conditional",
        "ineligible",
        "should not"
      ],
      "line": 53,
      "id": "graduation;demo:-verify-graduation-statuses;;5"
    },
    {
      "cells": [
        "2",
        "conditional",
        "removed",
        "should not"
      ],
      "line": 54,
      "id": "graduation;demo:-verify-graduation-statuses;;6"
    },
    {
      "cells": [
        "2",
        "conditional",
        "representation",
        "should not"
      ],
      "line": 55,
      "id": "graduation;demo:-verify-graduation-statuses;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2411579642,
  "status": "passed"
});
formatter.before({
  "duration": 23325,
  "status": "passed"
});
formatter.before({
  "duration": 18038,
  "status": "passed"
});
formatter.before({
  "duration": 17416,
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
  "duration": 235332316,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"eligible\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should be saved",
  "matchedColumns": [
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
  "duration": 73173978,
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
  "duration": 59225874,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 823167059,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3013137946,
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
  "duration": 200051689,
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
  "duration": 165948513,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 82114959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2134681047,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2103697838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eligible",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8287950653,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2142133264,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 824636851,
  "status": "passed"
});
formatter.after({
  "duration": 3288334118,
  "status": "passed"
});
formatter.after({
  "duration": 3162189438,
  "status": "passed"
});
formatter.after({
  "duration": 3095180752,
  "status": "passed"
});
formatter.before({
  "duration": 2466822831,
  "status": "passed"
});
formatter.before({
  "duration": 33900,
  "status": "passed"
});
formatter.before({
  "duration": 26435,
  "status": "passed"
});
formatter.before({
  "duration": 26124,
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
  "duration": 225949091,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"unsuccesfull\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should not be saved",
  "matchedColumns": [
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
  "duration": 69395932,
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
  "duration": 59760796,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 810995706,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3045041408,
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
  "duration": 197637696,
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
  "duration": 172485452,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 82360029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2128911349,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2075935671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unsuccesfull",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8271769869,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2142835195,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 840958519,
  "status": "passed"
});
formatter.after({
  "duration": 3140782586,
  "status": "passed"
});
formatter.after({
  "duration": 3214887391,
  "status": "passed"
});
formatter.after({
  "duration": 3120919544,
  "status": "passed"
});
formatter.before({
  "duration": 2386733113,
  "status": "passed"
});
formatter.before({
  "duration": 13373,
  "status": "passed"
});
formatter.before({
  "duration": 9330,
  "status": "passed"
});
formatter.before({
  "duration": 8398,
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
  "duration": 256403909,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"final\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should not be saved",
  "matchedColumns": [
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
  "duration": 82903037,
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
  "duration": 55158907,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 797533075,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3054273487,
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
  "duration": 198992728,
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
  "duration": 171019702,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 80591363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2120924209,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2074047581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "final",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8223490003,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2120608542,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 778902842,
  "status": "passed"
});
formatter.after({
  "duration": 3192862579,
  "status": "passed"
});
formatter.after({
  "duration": 3187354121,
  "status": "passed"
});
formatter.after({
  "duration": 3243687681,
  "status": "passed"
});
formatter.before({
  "duration": 2444720579,
  "status": "passed"
});
formatter.before({
  "duration": 31411,
  "status": "passed"
});
formatter.before({
  "duration": 22081,
  "status": "passed"
});
formatter.before({
  "duration": 21770,
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
  "duration": 267511325,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"ineligible\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should not be saved",
  "matchedColumns": [
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
  "duration": 89052469,
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
  "duration": 55891938,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 830676500,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3076906307,
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
  "duration": 197142892,
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
  "duration": 175168461,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 80391079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2105437581,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2117388744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ineligible",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8251162601,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2102797800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 794679947,
  "status": "passed"
});
formatter.after({
  "duration": 3238110492,
  "status": "passed"
});
formatter.after({
  "duration": 3159158418,
  "status": "passed"
});
formatter.after({
  "duration": 3134760353,
  "status": "passed"
});
formatter.before({
  "duration": 2526515518,
  "status": "passed"
});
formatter.before({
  "duration": 20215,
  "status": "passed"
});
formatter.before({
  "duration": 13684,
  "status": "passed"
});
formatter.before({
  "duration": 14306,
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
  "duration": 253281454,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"removed\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should not be saved",
  "matchedColumns": [
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
  "duration": 68059248,
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
  "duration": 56096266,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 815151929,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3053979279,
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
  "duration": 200027431,
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
  "duration": 171321063,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 77344197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2128155615,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2134869515,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "removed",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8258160445,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2113828711,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 750198341,
  "status": "passed"
});
formatter.after({
  "duration": 3165002446,
  "status": "passed"
});
formatter.after({
  "duration": 3184225447,
  "status": "passed"
});
formatter.after({
  "duration": 3202005089,
  "status": "passed"
});
formatter.before({
  "duration": 2321349100,
  "status": "passed"
});
formatter.before({
  "duration": 13373,
  "status": "passed"
});
formatter.before({
  "duration": 9019,
  "status": "passed"
});
formatter.before({
  "duration": 8086,
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
  "duration": 265878880,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Demo: Verify graduation statuses",
  "description": "",
  "id": "graduation;demo:-verify-graduation-statuses;;7",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#"
    }
  ],
  "line": 35,
  "name": "I enter username as \"UQTRN42\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I enter password as \"UQTRN\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click Search",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I choose a graduate \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I add a row",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select Graduation Status as \"representation\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I save",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Status should not be saved",
  "matchedColumns": [
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
  "duration": 70385228,
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
  "duration": 54625852,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 794032753,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 3231100519,
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
  "duration": 199334830,
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
  "duration": 167258762,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 82815957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "graduationSteps.i_choose_a_gratuate(String)"
});
formatter.result({
  "duration": 2139790491,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_add_a_row()"
});
formatter.result({
  "duration": 2147847605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "representation",
      "offset": 31
    }
  ],
  "location": "graduationSteps.graduationStatus(String)"
});
formatter.result({
  "duration": 8242791997,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save()"
});
formatter.result({
  "duration": 2173711420,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 778534306,
  "status": "passed"
});
formatter.after({
  "duration": 3144832136,
  "status": "passed"
});
formatter.after({
  "duration": 3076217127,
  "status": "passed"
});
formatter.after({
  "duration": 3139564704,
  "status": "passed"
});
formatter.before({
  "duration": 2521497198,
  "status": "passed"
});
formatter.before({
  "duration": 21148,
  "status": "passed"
});
formatter.before({
  "duration": 15239,
  "status": "passed"
});
formatter.before({
  "duration": 14306,
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
  "duration": 217047607,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Checking minimal academic requirement for eligibility to graduate",
  "description": "",
  "id": "graduation;checking-minimal-academic-requirement-for-eligibility-to-graduate",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "I enter username as \"UQTAHME4\"",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "I enter password as \"IT$1Sa$S\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I click signin",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I navigate to Enrollment Request",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Student ID \"43595923\" has been set up",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I navigate to graduations management",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I enter Empl ID as \"43595923\"",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I select Academic Career as \"Undergraduate\"",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I select Graduation Status search parameter as \"Conditional\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I click Search",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "I should see graduate ID",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UQTAHME4",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_username(String)"
});
formatter.result({
  "duration": 77519913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IT$1Sa$S",
      "offset": 21
    }
  ],
  "location": "searchSteps.enter_password(String)"
});
formatter.result({
  "duration": 60548563,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 849686464,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.enrolment_request()"
});
formatter.result({
  "duration": 3192773010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "43595923",
      "offset": 12
    }
  ],
  "location": "setupSteps.studentSetup(String)"
});
formatter.result({
  "duration": 4379066927,
  "status": "passed"
});
formatter.match({
  "location": "navigationSteps.management()"
});
formatter.result({
  "duration": 2637188808,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "43595923",
      "offset": 20
    }
  ],
  "location": "graduationSteps.i_enter_empl_id(String)"
});
formatter.result({
  "duration": 2383325470,
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
  "duration": 206616618,
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
  "duration": 157890465,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_save_searchGratuates()"
});
formatter.result({
  "duration": 67201507,
  "status": "passed"
});
formatter.match({
  "location": "graduationSteps.i_should_see_graduate_id()"
});
formatter.result({
  "duration": 2062504451,
  "status": "passed"
});
formatter.after({
  "duration": 748566827,
  "status": "passed"
});
formatter.after({
  "duration": 3132411048,
  "status": "passed"
});
formatter.after({
  "duration": 3200303600,
  "status": "passed"
});
formatter.after({
  "duration": 3277559161,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a user\nI want to be able to search records\nso that I can get information of the existing records",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Verify Login",
  "description": "",
  "id": "search;verify-login",
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
  "id": "search;verify-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "condition",
        "page"
      ],
      "line": 16,
      "id": "search;verify-login;;1"
    },
    {
      "cells": [
        "UQTRN42",
        "UQTRN",
        "should",
        "homepage"
      ],
      "line": 17,
      "id": "search;verify-login;;2"
    },
    {
      "cells": [
        "UQTRN",
        "UQTRN212",
        "shouldn\u0027t",
        "loginpage"
      ],
      "line": 18,
      "id": "search;verify-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2467782270,
  "status": "passed"
});
formatter.before({
  "duration": 23014,
  "status": "passed"
});
formatter.before({
  "duration": 16483,
  "status": "passed"
});
formatter.before({
  "duration": 15861,
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
  "duration": 245637661,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Login",
  "description": "",
  "id": "search;verify-login;;2",
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
  "duration": 81018368,
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
  "duration": 58544159,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 817202361,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_si_net_homepage()"
});
formatter.result({
  "duration": 31105122,
  "status": "passed"
});
formatter.after({
  "duration": 733971529,
  "status": "passed"
});
formatter.after({
  "duration": 3231203149,
  "status": "passed"
});
formatter.after({
  "duration": 3178545004,
  "status": "passed"
});
formatter.after({
  "duration": 3192287537,
  "status": "passed"
});
formatter.before({
  "duration": 3418234140,
  "status": "passed"
});
formatter.before({
  "duration": 46339,
  "status": "passed"
});
formatter.before({
  "duration": 34521,
  "status": "passed"
});
formatter.before({
  "duration": 45096,
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
  "duration": 217120381,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify Login",
  "description": "",
  "id": "search;verify-login;;3",
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
  "duration": 74292651,
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
  "duration": 57611155,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 204080712,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_shouldnt_see_my_si_net_loginpage()"
});
formatter.result({
  "duration": 34493172,
  "status": "passed"
});
formatter.after({
  "duration": 793855482,
  "status": "passed"
});
formatter.after({
  "duration": 3029204592,
  "status": "passed"
});
formatter.after({
  "duration": 3200568884,
  "status": "passed"
});
formatter.after({
  "duration": 3153359795,
  "status": "passed"
});
formatter.before({
  "duration": 2492249066,
  "status": "passed"
});
formatter.before({
  "duration": 20526,
  "status": "passed"
});
formatter.before({
  "duration": 14928,
  "status": "passed"
});
formatter.before({
  "duration": 14617,
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
  "duration": 242600109,
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
  "duration": 74047270,
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
  "duration": 53344525,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.click_signin()"
});
formatter.result({
  "duration": 663572617,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 992119223,
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
  "duration": 223303091,
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
  "duration": 58336410,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_save_searchCriteria()"
});
formatter.result({
  "duration": 81564487,
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
  "duration": 2106426255,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_click_save()"
});
formatter.result({
  "duration": 2135640177,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.search_match()"
});
formatter.result({
  "duration": 571612285,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.i_should_see_my_search_label()"
});
formatter.result({
  "duration": 2284016484,
  "status": "passed"
});
formatter.after({
  "duration": 686759642,
  "status": "passed"
});
formatter.after({
  "duration": 3131770074,
  "status": "passed"
});
formatter.after({
  "duration": 3256948161,
  "status": "passed"
});
formatter.after({
  "duration": 3269108008,
  "status": "passed"
});
});