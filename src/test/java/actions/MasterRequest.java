package actions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import utils.Common;

import java.io.IOException;

public class MasterRequest {
    protected String basePath = "/testdata/";
    Response response;
    RequestSpecification request = SerenityRest.given();
    @Steps
    Common commonCode;

    public RequestSpecification makeBaseRequest( String jsonPayLoad, boolean... cookie) throws IOException {
        request  = setSecurity(cookie);
        String jsonBody = commonCode.generateStringFromResource(System.getProperty("user.dir") + basePath + jsonPayLoad);
        request.body(jsonBody);
        return request;
    }

    public RequestSpecification makeBaseRequest(boolean... cookie ) throws IOException {

        request  = setSecurity(cookie);
        return request;
    }

    public  RequestSpecification setSecurity(boolean[] cookie) throws IOException{
        boolean flag = cookie.length >= 1 && cookie[0];
        request = flag ? setHeaderWithCookie() : setHeaderWithBasic();
return request;
    }

    public RequestSpecification setHeaderWithCookie( ) throws IOException {
        request.header("Cookie", "token=abc123");
        request.header("Content-Type", "application/json");
        return request;
    }    public RequestSpecification setHeaderWithBasic( ) throws IOException {
        request.header("Content-Type", "application/json");
        request.given().auth().preemptive().basic("admin", "password123");
        return request;
    }

}
