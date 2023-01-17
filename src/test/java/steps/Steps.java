package steps;

import actions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constants;

import java.io.IOException;

public class Steps {
    @net.thucydides.core.annotations.Steps
    Actions actions;


    @When("I trigger POST call to Authenticate the user$")
    public void iTriggerPostCallToAuthenticateTheUser() throws IOException {
        actions.makePostRequest(Constants.getLoginEndpoint(), "NewLoginPayLoad.json");


    }

    @Then("I see the status code as (\\d+)$")
    public void iSeeTheStatusCodeAs(int statusCode) {
        actions.assertStatusCode(statusCode);
    }

    @And("the response body should match \"([^\"]*)\" file$")
    public void theResponseBodyShouldMatchFile(String jsonSchemaFileName) throws Throwable {
        actions.checkValidResponse(jsonSchemaFileName);
    }

    @When("I trigger POST call to create a new booking")
    public void iTriggerPOSTCallToCreateANewBooking() throws IOException {
        actions.makePostRequest(Constants.getBookingEndpoint()
                , "NewBookingsPayload.json");

    }

    @When("I trigger GET call on bookings list")
    public void iTriggerGETCallOnBookingsList() throws IOException {
        actions.makeGetRequest(Constants.getBookingEndpoint());
    }

    @When("I trigger DELETE call on booking number {int}")
    public void iTriggerDELETECallOnBookingNumber(int id) throws IOException {
        actions.makeDeleteRequest(Constants.getBookingEndpoint(), id);
    }

    @When("I trigger GET call with the booking id {int}")
    public void iTriggerGETCallWithTheBookingId(int bookingid) throws IOException {
        actions.makeGetRequest(Constants.getBookingEndpoint() + "/" + bookingid);

    }

    @When("I trigger PUT call to update the booking {int}")
    public void iTriggerPUTCallToUpdateANewBooking(int id) throws IOException {
        actions.makePutRequest(Constants.getBookingEndpoint()
                , "UpdateBookingPayload.json", id);
    }

    @Given("I am a registered user")
    public void iAmARegisteredUser() {
    }

    @When("I send a POST request to the {string} endpoint with valid booking information")
    public void iSendAPOSTRequestToTheEndpointWithValidBookingInformation(String arg0) {
    }

    @Then("the status code should be {int}")
    public void theStatusCodeShouldBe(int arg0) {
    }

    @And("the response should be {string}")
    public void theResponseShouldBe(String arg0) {
    }

    @And("the json schema of the request should be valid")
    public void theJsonSchemaOfTheRequestShouldBeValid() {
    }

    @When("I send a POST request to the {string} endpoint with invalid booking information")
    public void iSendAPOSTRequestToTheEndpointWithInvalidBookingInformation(String arg0) {
    }

    @And("the json schema of the request should be invalid")
    public void theJsonSchemaOfTheRequestShouldBeInvalid() {
    }

    @Given("I am not a registered user")
    public void iAmNotARegisteredUser() {
    }

    @When("I send a POST request to the {string} endpoint with a valid XML body")
    public void iSendAPOSTRequestToTheEndpointWithAValidXMLBody(String arg0) {
    }

    @And("the XML body should be valid according to the XSD")
    public void theXMLBodyShouldBeValidAccordingToTheXSD() {
    }

    @When("I send a POST request to the {string} endpoint with valid URL-encoded body")
    public void iSendAPOSTRequestToTheEndpointWithValidURLEncodedBody(String arg0) {
    }

    @And("the URL-encoded body should be in valid format")
    public void theURLEncodedBodyShouldBeInValidFormat() {
    }

    @When("I send a GET request to the {string} endpoint")
    public void iSendAGETRequestToTheEndpoint(String arg0) {
    }

    @And("the response should be a non-empty array of booking IDs")
    public void theResponseShouldBeANonEmptyArrayOfBookingIDs() {
    }

    @And("the expected booking ID should be in the returned array")
    public void theExpectedBookingIDShouldBeInTheReturnedArray() {
    }

    @When("I send a GET request to the {string} endpoint with query string {string} to filter my bookings")
    public void iSendAGETRequestToTheEndpointWithQueryStringToFilterMyBookings(String arg0, String arg1) {
    }

    @And("the response should be a non-empty array of filtered booking IDs")
    public void theResponseShouldBeANonEmptyArrayOfFilteredBookingIDs() {
    }

    @When("I send a GET request to the {string} endpoint with query strings {string} and {string} to filter my bookings")
    public void iSendAGETRequestToTheEndpointWithQueryStringsAndToFilterMyBookings(String arg0, String arg1, String arg2) {
    }

    @When("I send a GET request to the {string} endpoint with a valid booking id")
    public void iSendAGETRequestToTheEndpointWithAValidBookingId(String arg0) {
    }

    @And("the response should match the json schema of a booking")
    public void theResponseShouldMatchTheJsonSchemaOfABooking() {
    }

    @When("I send a GET request to the {string} endpoint with an invalid booking id")
    public void iSendAGETRequestToTheEndpointWithAnInvalidBookingId(String arg0) {
    }

    @When("I send a GET request to the {string} endpoint without providing a booking id")
    public void iSendAGETRequestToTheEndpointWithoutProvidingABookingId(String arg0) {
    }
}