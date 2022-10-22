Feature: Library login functionalities
  User Story:
  As a user I should be able to login with valid credentials
  to different accounts.

  Background:
    Given  user is on login page
  Scenario: Login as a student
    When user enters student username
    And user enters student password
    And user clicks the Sign in button
    Then user should see the library homepage

  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    And user clicks the Sign in button
    Then user should see the library homepage