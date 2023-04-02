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




    @And("the response body should match \"([^\"]*)\" file$")
    public void theResponseBodyShouldMatchFile(String jsonSchemaFileName) throws Throwable {
        actions.checkValidResponse(jsonSchemaFileName);
    }



    @Then("the status code should be {int}")
    public void theStatusCodeShouldBe(int statusCode) {
        actions.assertStatusCode(statusCode);
    }


    @When("I send a GET request to the {string} endpoint")
    public void iSendAGETRequestToTheEndpoint(String arg0) throws IOException {
        actions.makeGetRequest(arg0);
    }


    @When("I send a GET request to the {string} endpoint with query string {string} to filter my bookings")
    public void iSendAGETRequestToTheEndpointWithQueryStringToFilterMyBookings(String arg0, String arg1) throws IOException {
        actions.makeGetRequest(arg0+"?"+arg1);

    }

    @When("I send a POST request to {string} with {string} file")
    public void iSendAPOSTRequestWithFile(String endpoint,String payload) throws IOException {
        actions.makePostRequest(endpoint, payload);

    }

    @When("I send a DELETE request to the {string} endpoint with {int}")
    public void iSendADELETERequestToTheEndpointWith(String arg0, int arg1) throws IOException {
        actions.makeDeleteRequest(arg0, arg1);


    }

    @When("I send a DELETE request to the {string} endpoint with {int} and cookie auth")
    public void iSendADELETERequestToTheEndpointWithAndCookieAuth(String arg0, int arg1) throws IOException {
        actions.makeDeleteRequest(arg0, arg1,true);

    }

    @When("I send a DELETE request to the {string} endpoint with {int} and not auth")
    public void iSendADELETERequestToTheEndpointWithAndNotAuth(String arg0, int arg1) throws IOException {
        actions.makeDeleteRequestWithNoAuth(arg0,arg1);
    }

    @When("I send a GET request to the {string} endpoint with {string}")
    public void iSendAGETRequestToTheEndpointWith(String arg0, String arg1) throws IOException {
        actions.makeGetRequest(arg0,arg1);
    }

    @When("I send a PATH request to {string} with {string} file with {int}")
    public void iSendAPATHRequestToWithFileWith(String arg0, String arg1, int arg2) throws IOException {
        actions.makePatchRequest(arg0,arg1,arg2);
    }

    @When("I send a PATH request to {string} with {string} file with {int} and not Auth")
    public void iSendAPATHRequestToWithFileWithAndNotAuth(String arg0, String arg1, int arg2) throws IOException {
        actions.makePatchRequestWithNoAuth(arg0, arg1, arg2);
    }

    @When("I send a PUT request to {string} with {string} file with {int}")
    public void iSendAPUTRequestToWithFileWith(String arg0, String arg1, int arg2) throws IOException {
        actions.makePutRequest(arg0, arg1, arg2);
    }

    @When("I send a PUT request to {string} with {string} file with {int} with not aut")
    public void iSendAPUTRequestToWithFileWithWithNotAut(String arg0, String arg1, int arg2) throws IOException {
        actions.makePutRequestWithNoAuth(arg0, arg1, arg2);
    }

    @When("I send a GET request to {string} with path params {int}")
    public void iSendAGETRequestToWithPathParams(String arg0, int arg1) throws IOException {
        actions.makeGetRequest(arg0+"/"+arg1);
    }

    @When("I send a PUT request to {string} with {string} file")
    public void iSendAPUTRequestToWithFile(String endpoint, String payload) throws IOException {
        actions.makePostRequest(endpoint,payload);

    }
}