
Feature: Adding New Employee Details And Verify The List in Orangehrm Application

Scenario: Login Functionality

Given User Lanch The Url

When User Enter The Username In Username Field

And User Enter The Password In Password Field

Then User Click On The Login Button And It Navigate To Home Page

Scenario: Select PIM And Add Employee
When Select The PIM Option And Click
And Select The Add Employee Option And Click

Scenario: Add Employee Deatails
When User Enter The Firstname In Firstname Field
And User Enter The Middlename In Middlename Field
And User Enter The Lastname in Lastname Field
And User Enter The Employeeid In Employeeid Field
Then User Click On The Save Button And It Navigate To Home Page