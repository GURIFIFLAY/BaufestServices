package actions;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.Constants;


import java.io.IOException;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Actions extends MasterRequest {
    @Step
    public void makePostRequest(String endpoint, String jsonPayLoad) throws IOException {
        response = makeBaseRequest(jsonPayLoad).when().post(Constants.getURL() +endpoint);
    }

    @Step
    public void assertStatusCode(int statusCode){

        Assert.assertEquals(response.getStatusCode(),statusCode);
    }

    @Step
    public void checkValidResponse(String jsonSchemaFileName) {
        response.then().assertThat().body(matchesJsonSchemaInClasspath(jsonSchemaFileName));

    }
    @Step
    public void makeGetRequest(String endpoint) throws IOException {
        response = makeBaseRequest().when().get(Constants.getURL() +endpoint);
    }
    @Step

    public void makeGetRequest(String endpoint, int id) throws IOException {
        response = makeBaseRequest().when().get(Constants.getURL() +endpoint +"/"+id);
    }
    @Step

    public void makeGetRequest(String endpoint, String id) throws IOException {
        response = makeBaseRequest().when().get(Constants.getURL() +endpoint +"/"+id);
    }

    @Step
    public void makeDeleteRequest(String endpoint, int id) throws IOException {
        response = makeBaseRequest().when().delete(Constants.getURL() +endpoint+"/"+id);
    }
    @Step

    public void makeDeleteRequest(String endpoint, int id,boolean cookie) throws IOException {
        response = makeBaseRequest(cookie).when().delete(Constants.getURL() +endpoint+"/"+id);
    }
    @Step
    public void makeDeleteRequestWithNoAuth(String endpoint, int id) throws IOException {
        response = makeBaseRequestNotAuth().when().delete(Constants.getURL() +endpoint+"/"+id);
    }
    @Step
    public void makePutRequest(String bookingEndpoint, String jsonPayLoad) throws IOException {

        response = makeBaseRequest(jsonPayLoad).when().put(Constants.getURL() +bookingEndpoint);
    }

    @Step
    public void makePutRequest(String bookingEndpoint, String jsonPayLoad, int id) throws IOException {

        response = makeBaseRequest(jsonPayLoad).when().put(Constants.getURL() +bookingEndpoint+"/"+id);
    }
    @Step
    public void makePutRequestWithNoAuth(String bookingEndpoint, String jsonPayLoad, int id) throws IOException {

        response = makeBaseRequestNotAuth(jsonPayLoad).when().put(Constants.getURL() +bookingEndpoint+"/"+id);
    }
    @Step

    public void makePatchRequest(String bookingEndpoint, String jsonPayLoad, int id) throws IOException {

        response = makeBaseRequest(jsonPayLoad).when().patch(Constants.getURL() +bookingEndpoint+"/"+id);
    }
    @Step

    public void makePatchRequestWithNoAuth(String bookingEndpoint, String jsonPayLoad, int id) throws IOException {

        response = makeBaseRequestNotAuth(jsonPayLoad).when().patch(Constants.getURL() +bookingEndpoint+"/"+id);
    }
}
