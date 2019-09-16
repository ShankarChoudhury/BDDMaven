Feature: Test tags & Bulk data strings
  This is  sample scenario to test Gherkin feature

  Background: Following are the common Steps
    Test comments

    Given Internet explore browser

  @one
  Scenario Outline: Test google search feature with multiple keywords
    dummy scenario description

    Given a bulk string is available as below
      """
      Hi there ,can you tell me the new challenges in Test 
      Automation world...
      jjj
      """
    When google is launched
    And keyword field is available
    And the data is parametrized
    |Name|Company|Location|Salary|
    And the browser is maximized
    Then type a "<Keyword>" and hit search
    Then close the internet explore browser

    Examples: The below values are to be tested
      | Keyword  |
      | Database |
      | Entia    |

  @two
  Scenario: Test google search feature with multiple keywords123
    Given a bulk string is available as below
      """
      Hi there ,can you tell me the new challenges in Development 
       world...
      jjj
      """
    When google is launched
    And keyword field is available
    Then type a "GitHub" and hit search
    Then close the internet explore browser
