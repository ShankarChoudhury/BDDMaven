@GoogleSearch
Feature: Test google search feature
  This is  sample scenarioto test Gherkin feature
  This feature contains keywords as well

  Scenario Template: Test google search feature with multiple keywords
    Given A browser is available
    When browser is launched
    Then Send a "<keyword>"
    And close the Browser

    Examples: 
      Data driven Testing values below

      | keyword                 |
      | TestNG Framework        |
      | Maven Repository        |
      | Appium                  |
  ##     | Selendroid              |
  ##     | Mobile espresso testing |
   ##    | Cucumber                |
   ##    | Serenity                |
   ##    | Jbehave                 |