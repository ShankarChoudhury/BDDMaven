## Shankar
@KimaiRegression
Feature: Test login feature in Kimai Timesheet application
Background:
 Given I am on home page of Kimai Application
 When I login with valid credentials
 Then I should see home page
@CreateCustomer
Scenario Outline: Create Customer
 And create customer "<CustomerName>" in the application
 And I logout of the application
Examples:
|CustomerName|
|Allure3.16|
## |Katalon1.14|
@CreateProject
Scenario Outline: Create Projects
When i am on create project page
And i provide all mandatory fields with Project "<ProjName>" and CusName "<CustomerName>"
Then project "<ProjName>" is created
And I logout of the application
Examples:
|ProjName|CustomerName|
|Allure3.00|Allure3.16|
##|KatalonLoanPro|Katalon1.14|
Scenario: Generate Report
When i generate report