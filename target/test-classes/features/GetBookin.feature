Feature: GetBookingIds
  As a user, I want to retrieve the booking IDs for my account
  so that I can view the details of my bookings and filter them based on optional query strings such as Last name, First name, First and last name, Checkin, Checkout.

  Scenario: Successfully retrieve all booking IDs
    When I send a GET request to the "booking" endpoint
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

  Scenario: Successfully retrieve filtered booking IDs by Last name
    When I send a GET request to the "booking" endpoint with query string "firstname=Alexis" to filter my bookings
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

  Scenario: Successfully retrieve filtered booking IDs by First name
    When I send a GET request to the "booking" endpoint with query string "lastname=Garcia" to filter my bookings
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

  Scenario: Successfully retrieve filtered booking IDs by First and Last name
    When I send a GET request to the "booking" endpoint with query string "firstname=Alexis&lastname=Garcia" to filter my bookings
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

  Scenario: Successfully retrieve filtered booking IDs by Checkin date

    When I send a GET request to the "booking" endpoint with query string "checkin=2023-01-02" to filter my bookings
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

  Scenario: Successfully retrieve filtered booking IDs by Checkout date

    When I send a GET request to the "booking" endpoint with query string "checkout=2023-01-14" to filter my bookings
    Then the status code should be 200
    And the response body should match "bookingIDSchema.json" file

