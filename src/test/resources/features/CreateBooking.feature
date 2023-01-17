Feature: Create a new booking
  As a user, I want to create a new booking in the API

  Scenario: Successfully create a new booking
    Given I am a registered user
    When I send a POST request to the "Create booking" endpoint with valid booking information
    Then the status code should be 200
    And the response should be "Booking created"
    And the json schema of the request should be valid

  Scenario: Invalid booking information
    Given I am a registered user
    When I send a POST request to the "Create booking" endpoint with invalid booking information
    Then the status code should be 400
    And the response should be "Bad request"
    And the json schema of the request should be invalid

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a POST request to the "Create booking" endpoint with valid booking information
    Then the status code should be 401

  Scenario: Successfully create a new booking with XML body
    Given I am a registered user
    When I send a POST request to the "Create booking" endpoint with a valid XML body
    Then the status code should be 200
    And the response should be "Booking created"
    And the XML body should be valid according to the XSD

  Scenario: Successfully create a new booking with URL-encoded body
    Given I am a registered user
    When I send a POST request to the "Create booking" endpoint with valid URL-encoded body
    Then the status code should be 200
    And the response should be "Booking created"
    And the URL-encoded body should be in valid format
