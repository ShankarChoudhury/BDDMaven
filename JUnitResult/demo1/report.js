$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(".\\Features\\Shipping.feature");
formatter.feature({
  "id": "feature-to-test-shipping",
  "description": "",
  "name": "Feature to test Shipping",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "feature-to-test-shipping;test-shipping;;2",
  "description": "",
  "name": "Test shipping",
  "keyword": "Scenario Outline",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "The application is open",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "\"air\" is set and  calculate button is clicked",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "validate system displays shipping \"\u003ccost\u003e\" as expected",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "StepDefinition.launchApplication()"
});
formatter.result({
  "duration": 1147169158,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat cucumberMavenPack.StepDefinition.launchApplication(StepDefinition.java:29)\r\n\tat ✽.Given The application is open(.\\Features\\Shipping.feature:5)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "air",
      "offset": 1
    }
  ],
  "location": "StepDefinition.testCalculateCost(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccost\u003e",
      "offset": 35
    }
  ],
  "location": "StepDefinition.validateResult(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "feature-to-test-shipping;test-shipping;;3",
  "description": "",
  "name": "Test shipping",
  "keyword": "Scenario Outline",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "The application is open",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "\"ship\" is set and  calculate button is clicked",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "validate system displays shipping \"\u003ccost\u003e\" as expected",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "StepDefinition.launchApplication()"
});
formatter.result({
  "duration": 2544668,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat cucumberMavenPack.StepDefinition.launchApplication(StepDefinition.java:29)\r\n\tat ✽.Given The application is open(.\\Features\\Shipping.feature:5)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "ship",
      "offset": 1
    }
  ],
  "location": "StepDefinition.testCalculateCost(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccost\u003e",
      "offset": 35
    }
  ],
  "location": "StepDefinition.validateResult(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "feature-to-test-shipping;test-shipping;;4",
  "description": "",
  "name": "Test shipping",
  "keyword": "Scenario Outline",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "The application is open",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "\"road\" is set and  calculate button is clicked",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "validate system displays shipping \"\u003ccost\u003e\" as expected",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "StepDefinition.launchApplication()"
});
formatter.result({
  "duration": 2611381,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat cucumberMavenPack.StepDefinition.launchApplication(StepDefinition.java:29)\r\n\tat ✽.Given The application is open(.\\Features\\Shipping.feature:5)\r\n"
});
formatter.match({
  "arguments": [
    {
      "val": "road",
      "offset": 1
    }
  ],
  "location": "StepDefinition.testCalculateCost(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccost\u003e",
      "offset": 35
    }
  ],
  "location": "StepDefinition.validateResult(String)"
});
formatter.result({
  "status": "skipped"
});
});