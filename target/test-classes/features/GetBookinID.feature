Feature: GetBookingById
  As a user, I want to retrieve a specific booking by its id
  So that I can view the details of a specific booking.

  Scenario: Successfully retrieve a specific booking
    When I send a GET request to the "booking" endpoint with "2"
    Then the status code should be 200
    And the response body should match "bookingSchema.json" file

  Scenario: Invalid booking id
    When I send a GET request to the "booking" endpoint with "-1"
    Then the status code should be 404

  Scenario: Empty search
    When I send a GET request to the "booking" endpoint with "0"
    Then the status code should be 404

