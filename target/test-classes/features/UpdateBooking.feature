Feature: Update a current booking
  As a user, I want to update an existing booking in the API

  Scenario: Successfully update a current booking
    When I send a PUT request to "booking" with "UpdateBookingPayload.json" file with 19
    Then the status code should be 200
    And the response body should match "bookingSchema.json" file

  Scenario: Invalid booking id
    When I send a PUT request to "booking" with "UpdateBookingPayload.json" file with 0
    Then the status code should be 404

  Scenario: Invalid booking information
    When I send a PUT request to "booking" with "InvalidBookingsPayload.json" file with 24
    Then the status code should be 400

  Scenario: Unauthorized access
    When I send a PUT request to "booking" with "NewBookingsPayload.json" file with 23 with not aut
    Then the status code should be 401

  Scenario: Successfully update a current booking with XML body
    When I send a PUT request to "booking" with "NewBooking.xml" file with 45
    Then the status code should be 200

  Scenario: Successfully update a current booking with URL-encoded body
    When I send a PUT request to "booking" with "NewBooking.txt" file with 67
    Then the status code should be 200
