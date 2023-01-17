Feature: Health check
  As a user, I want to check the health status of the API

  Scenario: Successfully perform a health check
    When I send a GET request to the "Ping" endpoint
    Then the status code should be 201

