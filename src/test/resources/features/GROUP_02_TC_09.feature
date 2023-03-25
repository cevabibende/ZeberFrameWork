@smoke @main
Feature: Main Page
  The description sections should appear/disappear when the user clicks.

  @checkAboutButton
  Scenario: The user should be able to see some information about the company when navigates to "About Us" page


    Given the user is on the main page
    When the user clicks on Welcome,Guest button
    And the user clicks on Sign In
    And the user enters valid email as "dene@hotmail.com"
    And the user enters valid password as "123456"
    And the user clicks on sign in button
    And the user clicks on About Us link
    Then the user should be able to see some information in About Us page



