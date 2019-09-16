## Shankar
@InsCo
Feature: Test login feature in InsCo application
@InsCoLoginCheck
Scenario: Check Valid Login
Given I am on home page of InsCo Application
 When I login with credentials
 Then I should successfully view the Home Page
 And I signout of the application