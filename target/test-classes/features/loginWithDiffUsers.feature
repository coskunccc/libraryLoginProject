@wip

Feature: Login with different users
  User Story:
  As a user, I should be able to login with different users using their
  correct emails and passwords. When I login, I should be able to
  see username in the account username section

  Scenario Outline: Verify user information
    Given user is on login page
    When user logins using "<mail>" and "<password>"
    Then user should see "<username>" in the account

    Examples:
      | username       | mail             | password |
      | Test Student 2 | student2@library | Z1i6XQIR |
      | Test Student 3 | student3@library | UB1EMJAc |
      | Test Student 4 | student4@library | 8u6iaONh |
      | Test Student 5 | student5@library | 53mSP4iw |
      | Test Student 6 | student6@library | Ah7NyK8I |

    Examples:
      | username         | mail               | password |
      | Test Librarian 2 | librarian2@library | QKIlkj8g |
      | Test Librarian 3 | librarian3@library | Bqq9Ru0W |
      | Test Librarian 4 | librarian4@library | jvBFqXBK |
      | Test Librarian 5 | librarian5@library | GUgEFTI7 |

