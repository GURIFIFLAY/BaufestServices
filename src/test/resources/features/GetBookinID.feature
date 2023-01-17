Feature: GetBookingById
  As a user, I want to retrieve a specific booking by its id
  So that I can view the details of a specific booking.

  Scenario: Successfully retrieve a specific booking
    Given I am a registered user
    When I send a GET request to the "GetBookingById" endpoint with a valid booking id
    Then the status code should be 200
    And the response should match the json schema of a booking

  Scenario: Invalid booking id
    Given I am a registered user
    When I send a GET request to the "GetBookingById" endpoint with an invalid booking id
    Then the status code should be 404
    And the response should be "Booking not found"

  Scenario: Empty search
    Given I am a registered user
    When I send a GET request to the "GetBookingById" endpoint without providing a booking id
    Then the status code should be 400
    And the response should be "Bad request"

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a GET request to the "GetBookingById" endpoint with a valid booking id
    Then the status code should be 401
