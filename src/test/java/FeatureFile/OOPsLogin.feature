Feature: check login functionality for OOPs concept
@Smoke
  Scenario: Check login credentials
    Given go to login page
    When  entering valid Username and Password
    And  click on login button
    Then navigated to the home page