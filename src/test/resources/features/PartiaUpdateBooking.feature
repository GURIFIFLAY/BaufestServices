Feature: Update a current booking with a partial payload
  As a user, I want to update an existing booking in the API with a partial payload

  Scenario: Successfully update a current booking with a partial payload
    Given I am a registered user
    When I send a PATCH request to the "Update booking" endpoint with a valid partial payload and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the json schema of the request should be valid

  Scenario: Invalid booking id
    Given I am a registered user
    When I send a PATCH request to the "Update booking" endpoint with a valid partial payload but an invalid booking id
    Then the status code should be 404
    And the response should be "Booking not found"

  Scenario: Invalid partial payload
    Given I am a registered user
    When I send a PATCH request to the "Update booking" endpoint with an invalid partial payload and a valid booking id
    Then the status code should be 400
    And the response should be "Bad request"
    And the json schema of the request should be invalid

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a PATCH request to the "Update booking" endpoint with a valid partial payload and a valid booking id
    Then the status code should be 401

  Scenario: Successfully update a current booking with a partial payload in XML format
    Given I am a registered user
    When I send a PATCH request to the "Update booking" endpoint with a valid partial payload in XML format and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the XML body should be valid according to the XSD

  Scenario: Successfully update a current booking with a partial payload in URL-encoded format
    Given I am a registered user
    When I send a PATCH request to the "Update booking" endpoint with a valid partial payload in URL-encoded format and a valid booking id
    Then the status code should be 200
    And the response should be "Booking updated"
    And the URL-encoded body should be in valid format
