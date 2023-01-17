Feature: Update a current booking
  As a user, I want to update an existing booking in the API

  Scenario: Successfully update a current booking
    Given I am a registered user
    When I send a PUT request to the "Update booking" endpoint with valid booking information and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the json schema of the request should be valid

  Scenario: Invalid booking id
    Given I am a registered user
    When I send a PUT request to the "Update booking" endpoint with valid booking information but an invalid booking id
    Then the status code should be 404
    And the response should be "Booking not found"

  Scenario: Invalid booking information
    Given I am a registered user
    When I send a PUT request to the "Update booking" endpoint with invalid booking information and a valid booking id
    Then the status code should be 400
    And the response should be "Bad request"
    And the json schema of the request should be invalid

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a PUT request to the "Update booking" endpoint with valid booking information and a valid booking id
    Then the status code should be 401

  Scenario: Successfully update a current booking with XML body
    Given I am a registered user
    When I send a PUT request to the "Update booking" endpoint with a valid XML body and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the XML body should be valid according to the XSD

  Scenario: Successfully update a current booking with URL-encoded body
    Given I am a registered user
    When I send a PUT request to the "Update booking" endpoint with valid URL-encoded body and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the URL-encoded body should be in valid format
