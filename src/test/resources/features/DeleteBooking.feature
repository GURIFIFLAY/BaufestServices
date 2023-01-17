Feature: Delete a booking
  As a user, I want to delete an existing booking in the API

  Scenario: Successfully delete a booking
    Given I am a registered user
    When I send a DELETE request to the "Delete booking" endpoint with a valid booking id
    Then the status code should be 200
    And the response should be "Booking deleted"

  Scenario: Invalid booking id
    Given I am a registered user
    When I send a DELETE request to the "Delete booking" endpoint with an invalid booking id
    Then the status code should be 404
    And the response should be "Booking not found"

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a DELETE request to the "Delete booking" endpoint with a valid booking id
    Then the status code should be 401
