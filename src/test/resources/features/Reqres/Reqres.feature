Feature: Testing Reqres API ALTA QE8
  @Latihan
  Scenario Outline: Get list user with valida parameter page
    Given Get list user with page <page>
    When Send request get list user
    Then Should return status code 200
    And Response body page should be <page>
    Examples:
      | page |
      | 1    |
      | 2    |

    @latihan
    Scenario Outline: Post create new user with invalid json
      Given Post create user with valid json
      When Send request post create user
      Then Should return status code 201
      And Response body name should be "<name>" and job "<job>"
      Examples:
        | name           | job         |
        | Suci Nascaisar | QA Engineer |