Feature: Update a current booking with a partial payload
  As a user, I want to update an existing booking in the API with a partial payload

  Scenario: Successfully update a current booking with a partial payload
    When I send a PATH request to "booking" with "PartialUpdateBookingPayload.json" file with 1
    Then the status code should be 200
    And the response body should match "bookingSchema.json" file

  Scenario: Invalid booking id
    When I send a PATH request to "booking" with "PartialUpdateBookingPayload.json" file with 0
    Then the status code should be 404
    And the response body should match "bookingSchema.json" file

  Scenario: Invalid partial payload
    When I send a PATH request to "booking" with "NoValidPartialUpdateBookingPayload.json" file with 1
    Then the status code should be 400
    And the response body should match "bookingSchema.json" file

  Scenario: Unauthorized access
    When I send a PATH request to "booking" with "PartialUpdateBookingPayload.json" file with 1 and not Auth
    Then the status code should be 401

  Scenario: Successfully update a current booking with a partial payload in XML format
    When I send a PATH request to "booking" with "NewBooking.xml" file with 1
    Then the status code should be 200

  Scenario: Successfully update a current booking with a partial payload in URL-encoded format
    When I send a PATH request to "booking" with "NewBooking.txt" file with 1
    Then the status code should be 200
