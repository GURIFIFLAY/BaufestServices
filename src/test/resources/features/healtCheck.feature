Feature: Health check
  As a user, I want to check the health status of the API

  Scenario: Successfully perform a health check
    Given I am a registered user
    When I send a GET request to the "Ping" endpoint
    Then the status code should be 200
    And the response should be "ok"

