Feature: check login functionality
@Reg
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user is entering valid Username and Password
    And when user clicks on login button
    Then user is navigated to the home page



