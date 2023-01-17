Feature: Create an auth token
  As a user, I want to create a new auth token to use for access to the PUT and DELETE /booking endpoints

  Scenario: Successfully create an auth token
    When I send a POST request to "auth" with "ValidLoginPayload.json" file
    Then the status code should be 200
    And the response body should match "authSchema.json" file

  Scenario: Invalid credentials
    When I send a POST request to "auth" with "InvalidLoginPayload.json" file
    Then the status code should be 401

