$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Report.feature");
formatter.feature({
  "line": 1,
  "name": "Adding New Employee Details And Verify The List in Orangehrm Application",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User Lanch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click On The Login Button And It Navigate To Home Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 15,
      "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;1"
    },
    {
      "cells": [
        "Dhiva@12",
        "dhiva"
      ],
      "line": 16,
      "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;2"
    },
    {
      "cells": [
        "Admin",
        "dhiva"
      ],
      "line": 17,
      "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;3"
    },
    {
      "cells": [
        "Dhiva@12",
        "admin123"
      ],
      "line": 18,
      "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;4"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 19,
      "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User Lanch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Dhiva@12\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"dhiva\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click On The Login Button And It Navigate To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Report.user_Lanch_The_Url()"
});
formatter.result({
  "duration": 17563052500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dhiva@12",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 147916000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dhiva",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 89650700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition_Report.user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page()"
});
formatter.result({
  "duration": 72086000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User Lanch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Admin\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"dhiva\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click On The Login Button And It Navigate To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Report.user_Lanch_The_Url()"
});
formatter.result({
  "duration": 6028114600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 72111100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dhiva",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 67729600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition_Report.user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page()"
});
formatter.result({
  "duration": 57887900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User Lanch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Dhiva@12\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"admin123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click On The Login Button And It Navigate To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Report.user_Lanch_The_Url()"
});
formatter.result({
  "duration": 4802295400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dhiva@12",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 86456600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 79647000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition_Report.user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page()"
});
formatter.result({
  "duration": 62952000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User Lanch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Admin\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"admin123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click On The Login Button And It Navigate To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Report.user_Lanch_The_Url()"
});
formatter.result({
  "duration": 5416855700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 75832400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 16
    }
  ],
  "location": "Step_Definition_Report.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 85616900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition_Report.user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page()"
});
formatter.result({
  "duration": 45932000,
  "status": "passed"
});
});