@smoke @register
Feature:Register process
  Verify that the user's profile information
  (Profile picture, First Name, Last Name , Gender , Date Of Birth , Email) is displayed correctly

  RULES :
  - The user must have a valid username
  - The user must have a valid password
  - "Name", "Surname", "Gender", "Date of Birth", "Email" should appear on the login screen.


  @verifyUserProfile
  Scenario: User will see "First Name", "Last Name", "Gender", "Date of Birth", "Email" on the screen after successfully signing in with valid credentials
  This scenario tests whether a user can see "First Name", "Last Name", "Gender", "Date of Birth", "Email" on the screen after entering valid credentials.

    Given the user is on the sign in page
    When the user enters email "dene@hotmail.com"
    And the user enters password as "123456"
    And the user clicks on the sign in
    Then the user should be signed in
    Then user arrives to profile page and sees "First Name", "Last Name", "Gender", "Date of Birth", "Email"

