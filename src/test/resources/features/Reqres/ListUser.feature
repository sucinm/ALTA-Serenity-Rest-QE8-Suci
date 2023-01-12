Feature: List User
  @Latihan1
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with page <page>
    When Send request get list user
    Then Should return status code 200
    And Response body page should be <page>
    Examples:
      | page |
      | 1    |
      | 2    |

  @Tugas
  Scenario Outline: Get list user with invalid parameter page
    Given Get list user with invalid page "<page>"
    When Send request get list user
    Then Should return status code 404
    Examples:
      | page  |
      | 1$##$ |
      | @@&#^ |