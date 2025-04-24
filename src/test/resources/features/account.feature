Feature: User flow through account creation and login

  Scenario: Create an account and login with the same credentials
    Given the app is launched
    When the user navigates to create account
    And the user enters "Jose", "Correia", "jose@test.com", "password123"
    And the user submits the account creation form
    Then the user is redirected to the main screen
    When the user navigates to login
    And the user enters login credentials "jose@test.com" and "password123"
    And the user submits the login form
    Then the user should be logged in