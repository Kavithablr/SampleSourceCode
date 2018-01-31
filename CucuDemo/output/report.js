$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027Featurefiles/cucudemo.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Life of king",
  "description": "\nIn order to get good \nAs a IT guy\nI want to keep my boss",
  "id": "life-of-king",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "I am a kingman",
  "description": "",
  "id": "life-of-king;i-am-a-kingman",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I work in Latenights",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I meet watchmen",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I Greeted him",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I work in Mornings",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I meet NewspaperBoy",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I skipGreeting him",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Latenights",
      "offset": 10
    }
  ],
  "location": "CucumDemoOne.ln(String)"
});
formatter.result({
  "duration": 120687932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "watchmen",
      "offset": 7
    }
  ],
  "location": "CucumDemoOne.Imeet(String)"
});
formatter.result({
  "duration": 110605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Greeted",
      "offset": 2
    }
  ],
  "location": "CucumDemoOne.gre(String)"
});
formatter.result({
  "duration": 108039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mornings",
      "offset": 10
    }
  ],
  "location": "CucumDemoOne.ln(String)"
});
formatter.result({
  "duration": 99588,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewspaperBoy",
      "offset": 7
    }
  ],
  "location": "CucumDemoOne.Imeet(String)"
});
formatter.result({
  "duration": 154931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skipGreeting",
      "offset": 2
    }
  ],
  "location": "CucumDemoOne.gre(String)"
});
formatter.result({
  "duration": 102764,
  "status": "passed"
});
});