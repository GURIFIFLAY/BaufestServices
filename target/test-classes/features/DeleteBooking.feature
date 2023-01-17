Feature: Delete a booking
  As a user, I want to delete an existing booking in the API

  Scenario: Successfully delete a booking
    When I send a DELETE request to the "booking" endpoint with 37
    Then the status code should be 201

  Scenario: Successfully delete a booking with cookie
    When I send a DELETE request to the "booking" endpoint with 2 and cookie auth
    Then the status code should be 201

  Scenario: Invalid booking id
    When I send a DELETE request to the "booking" endpoint with 0
    Then the status code should be 404

  Scenario: Unauthorized access
    When I send a DELETE request to the "booking" endpoint with 3 and not auth
    Then the status code should be 401
