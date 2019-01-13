$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/amazonTitle.feature");
formatter.feature({
  "name": "Amazon Title",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "name": "Amazon Title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTitle_steps.user_goes_to_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see proper title",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTitle_steps.user_should_see_proper_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Amazon url verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTitle_steps.user_goes_to_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should validate url",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTitle_steps.user_should_validate_url()"
});
formatter.result({
  "status": "passed"
});
});