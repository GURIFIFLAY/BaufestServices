Feature: Create an auth token
  As a user, I want to create a new auth token to use for access to the PUT and DELETE /booking endpoints

  Scenario: Successfully create an auth token
    Given I am a registered user
    When I send a POST request to the "Auth" endpoint with a valid username and password
    Then the status code should be 200
    And the response should be a JSON object containing the auth token
    And the json schema of the request should be valid

  Scenario: Invalid credentials
    Given I am a registered user
    When I send a POST request to the "Auth" endpoint with an invalid username or password
    Then the status code should be 401
    And the response should be "Invalid credentials"

