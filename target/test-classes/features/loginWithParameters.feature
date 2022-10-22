Feature: Library login funcionality
  User Story:
  As a user I should be able to login with valid credentials
  to different accounts.

  Background:
    Given  user is on login page

  Scenario: Login as a student
    When user enters "student6@library" username
    And user enters "Ah7NyK8I" password
    And user clicks the Sign in button
    Then user should see the library homepage

  Scenario: Login as a librarian
    When user enters "librarian53@library" username
    And user enters "UFEX2m3O" password
    And user clicks the Sign in button
    Then user should see the library homepage

    Scenario: Login as a librarian in the same line
      When user logins using "librarian53@library" and "UFEX2m3O"
      And user should see 35 "users"
