## Shankar
@KimaiSmoke
Feature: Test login feature in Kimai Timesheet application
@LoginCheck
Scenario: Check Valid Login
Given I am on home page of Kimai Application
 When I login with valid credentials
 Then I should see home page
 And I logout of the application