$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/dataTablesSO.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dataTablesSO"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter firstname \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter lastname \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter position \"\u003cposition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter office \"\u003coffice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter extension \"\u003cextension\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter start date \"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter salary \"\u003csalary\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.step({
  "name": "USer enters first name \"\u003cfirstname\u003e\" to search box",
  "keyword": "And "
});
formatter.step({
  "name": "User should see first name \"\u003cfirstname\u003e\" is inserted in the table",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for datatables",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position",
        "office",
        "extension",
        "date",
        "salary"
      ]
    },
    {
      "cells": [
        "john",
        "doe",
        "retired",
        "london",
        "314",
        "2019-12-12",
        "123000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dataTablesSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTables_steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables_steps.user_clicks_to_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables_steps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstname \"john\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastname \"doe\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position \"retired\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_position(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office \"london\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_office(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension \"314\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_extension(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter start date \"2019-12-12\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_start_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter salary \"123000\"",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_should_enter_salary(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables_steps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer enters first name \"john\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DataTables2_steps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see first name \"john\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTables2_steps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.fail(Assert.java:95)\n\tat steps.DataTables2_steps.user_should_see_first_name_is_inserted_in_the_table(DataTables2_steps.java:70)\n\tat ✽.User should see first name \"john\" is inserted in the table(src/test/resources/features/dataTablesSO.feature:19)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});