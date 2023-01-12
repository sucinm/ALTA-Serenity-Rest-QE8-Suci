Feature: Login user
  @Tugas
  Scenario: Login user with registered users and match input email and password
    Given Login user with valid json
    When Send request login user
    Then Should return status code 200
#    And Response body page should be <page>

  @Tugas
  Scenario: Login user with registered users and input blank in password
    Given Login user with invalid json
    When Send request login user
    Then Should return status code 400
