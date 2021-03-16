$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Somketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Is Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "kathir",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "priya",
        "345"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-functionality;;3"
    },
    {
      "cells": [
        "leyahpoonkathir",
        "123456789"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Somketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"kathir\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Is Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "kathir",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_Is_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Somketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"priya\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Is Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "priya",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_Is_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Somketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"leyahpoonkathir\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"123456789\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And Is Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "leyahpoonkathir",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_Is_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Somketest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotels In Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The RoomType In RoomType Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The NumberOfRoom In NumberOfRoom Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The CheckInDate In CheckInDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The CheckOutDate In CheckOutDate Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The AdultsPerRoom In AdultsPerRoom Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The ChildrenPerRoom In ChildrenPerRoom Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Search Button And Is Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotels_In_Hotel_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_RoomType_In_RoomType_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_NumberOfRoom_In_NumberOfRoom_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CheckInDate_In_CheckInDate_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CheckOutDate_In_CheckOutDate_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_AdultsPerRoom_In_AdultsPerRoom_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_ChildrenPerRoom_In_ChildrenPerRoom_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Search_Button_And_Is_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
});