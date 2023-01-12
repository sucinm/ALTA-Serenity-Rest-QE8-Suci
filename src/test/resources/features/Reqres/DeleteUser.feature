Feature: Delete user

  @Latihan1 @PositifCase
  Scenario Outline: Delete user with valid id
    Given Delete user with valid id <id>
    When Send request delete user
    Then Should return status code 204
    Examples:
      | id |
      | 2  |

  @Tugas @NegatifCase
  Scenario Outline: Delete user with unregister user id
    Given Delete user with invalid id <id>
    When Send request delete user
    Then Should return status code 404
    Examples:
      | id |
      | 13 |