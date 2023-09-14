Feature: Adding New Employee Details And Verify The List in Orangehrm Application

Scenario Outline: Login Functionality

Given User Lanch The Url

When User Enter The "<Username>" In Username Field

And User Enter The "<Password>" In Password Field

Then User Click On The Login Button And It Navigate To Home Page

Examples:

         | Username   | Password  | 
         | Dhiva@12   | dhiva     |
         | Admin      | dhiva     |
         | Dhiva@12   | admin123  |
         | Admin      | admin123  |