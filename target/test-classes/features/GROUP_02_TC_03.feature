@smoke @main
Feature:Main Page
  the user should be able to see the products related to the given characters on search box.


  @checkSearchBoxHappyScenario
  Scenario Outline:The user attempts to click on "search box" and enter reasonable value

    Given the user is on the main page
    When the user clicks on search box
    And the user enters "<product name>"
    And The user should see the correct search results

    Examples:
      | product name |
      | apple        |


  @checkSearchBoxNegativeScenario
  Scenario Outline:The user attempts to click on "search box" and enter irrelevant value

    Given the user is on the main page
    When the user clicks on search box
    And the user enters "<irrelevant characters>"
    Then the user should see error messages if typed number or irrelevant characters
    Examples:
      | irrelevant characters |
      | 4545                  |
      | /*                    |











