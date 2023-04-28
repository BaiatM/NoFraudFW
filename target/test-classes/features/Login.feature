Feature: Login functionality

  @Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user verifies its a login page
    And user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged in to the account

#    here we have login functionality in order to add to our background for the future