$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/dataTables.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dataTables"
    }
  ]
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataTables"
    }
  ]
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTables_steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_clicks_to_New_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables_steps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter firstname \"John\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter lastname \"Doe\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter position \"Retired\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should enter office",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_should_enter_office()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter extension",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_should_enter_extension()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter start date",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_should_enter_start_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter salary",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_should_enter_salary()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables_steps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "USer enters first name \"John\" to search box",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should see first name i\"John\" s inserted in the table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});