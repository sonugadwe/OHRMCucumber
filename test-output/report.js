$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/FULL TIME/FinalProject/OHRMCucumber/src/test/resources/Features/TCA_Login.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM Login Page",
  "description": "",
  "id": "orangehrm-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate login page Test",
  "description": "",
  "id": "orangehrm-login-page;validate-login-page-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "To launch the browser and navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter details \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "orangehrm-login-page;validate-login-page-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "orangehrm-login-page;validate-login-page-test;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 10,
      "id": "orangehrm-login-page;validate-login-page-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Validate login page Test",
  "description": "",
  "id": "orangehrm-login-page;validate-login-page-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "To launch the browser and navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter details \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
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