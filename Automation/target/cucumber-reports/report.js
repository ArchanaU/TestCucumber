$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searched for Cucumber Vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Cucumber results are displayed",
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