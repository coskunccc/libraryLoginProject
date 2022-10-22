Feature: Library Users Table
  As a user, I should be able to login as librarian. When I go to Users
  page, table
  should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

  Scenario: Verify User Table
    Given user is on login page
    When user logins using "librarian53@library" and "UFEX2m3O"
    And user clicks Users link
    Then user should see the table have following links
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |