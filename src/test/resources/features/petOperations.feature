Feature: PetSwagger Test

  Scenario: Successfully create a new pet
    When I send a POST request to "pet" with "NewPetPayload.json" file
    Then the status code should be 200
    And the response body should match "createPetSchema.json" file

  Scenario: Successfully get a pet
    When I send a GET request to "pet" with path params 100
    Then the status code should be 200
    And the response body should match "getPetSchema.json" file

  Scenario: Successfully modified a pet
    When I send a PUT request to "pet" with "ModifiedPetPayload.json" file
    Then the status code should be 200
    And the response body should match "modifiedPetSchema.json" file
