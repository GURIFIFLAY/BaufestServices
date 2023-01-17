Feature: Create a new booking
  As a user, I want to create a new booking in the API

  Scenario: Successfully create a new booking
    When I send a POST request to "booking" with "NewBookingsPayload.json" file
    Then the status code should be 200
    And the response body should match "bookingSchema.json" file

  Scenario: Invalid booking information
    When I send a POST request to "booking" with "InvalidBookingsPayload.json" file
    Then the status code should be 400


  Scenario: Successfully create a new booking with XML body
    When I send a POST request to "booking" with "NewBooking.xml" file
    Then the status code should be 200

  Scenario: Successfully create a new booking with URL-encoded body
    When I send a POST request to "booking" with "NewBooking.txt" file
    Then the status code should be 200
