Feature: GetBookingIds
  As a user, I want to retrieve the booking IDs for my account
  so that I can view the details of my bookings and filter them based on optional query strings such as Last name, First name, First and last name, Checkin, Checkout.

  Scenario: Successfully retrieve all booking IDs
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint
    Then the status code should be 200
    And the response should be a non-empty array of booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Successfully retrieve filtered booking IDs by Last name
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint with query string "Last name" to filter my bookings
    Then the status code should be 200
    And the response should be a non-empty array of filtered booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Successfully retrieve filtered booking IDs by First name
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint with query string "First name" to filter my bookings
    Then the status code should be 200
    And the response should be a non-empty array of filtered booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Successfully retrieve filtered booking IDs by First and Last name
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint with query strings "First name" and "Last name" to filter my bookings
    Then the status code should be 200
    And the response should be a non-empty array of filtered booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Successfully retrieve filtered booking IDs by Checkin date
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint with query string "Checkin" to filter my bookings
    Then the status code should be 200
    And the response should be a non-empty array of filtered booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Successfully retrieve filtered booking IDs by Checkout date
    Given I am a registered user
    When I send a GET request to the "GetBookingIds" endpoint with query string "Checkout" to filter my bookings
    Then the status code should be 200
    And the response should be a non-empty array of filtered booking IDs
    And the expected booking ID should be in the returned array

  Scenario: Unauthorized access
    Given I am not a registered user
    When I send a GET request to the "GetBookingIds" endpoint
    Then the status code should be 401
