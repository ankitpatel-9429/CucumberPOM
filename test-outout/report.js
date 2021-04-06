$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Java/Selenium_WorkSpace/CucumberPOM/src/main/java/com/qa/features/LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Test Application",
  "description": "",
  "id": "flipkart-test-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9935619200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Flipkart login Test",
  "description": "",
  "id": "flipkart-test-application;flipkart-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "verify login page title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify login page logo",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "logged in using username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.verify_login_page_title()"
});
formatter.result({
  "duration": 254442700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_login_page_logo()"
});
formatter.result({
  "duration": 147956500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logged_in_using_username_and_password()"
});
formatter.result({
  "duration": 405564000,
  "status": "passed"
});
formatter.after({
  "duration": 805042500,
  "status": "passed"
});
formatter.before({
  "duration": 10591414200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Home page Test",
  "description": "",
  "id": "flipkart-test-application;home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "verify homepage username title",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "verify more manue options",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.verify_homepage_username_title()"
});
formatter.result({
  "duration": 12164999800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_more_manue_options()"
});
formatter.result({
  "duration": 5215145900,
  "status": "passed"
});
formatter.after({
  "duration": 796485700,
  "status": "passed"
});
});