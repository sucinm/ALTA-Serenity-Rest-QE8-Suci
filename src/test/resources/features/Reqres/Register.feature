Feature: Register user
  @Tugas
  Scenario: Register user with valid json
    Given Register user with valid json
    When Send request register user
    Then Should return status code 200

  @Tugas
  Scenario: Register user with invalid json
    Given Register user with invalid json
    When Send request register user
    Then Should return status code 400
