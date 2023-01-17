package actions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import utils.Common;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MasterRequest {
    protected String basePath = "/testdata/";
    Response response;
    RequestSpecification request = SerenityRest.given();
    @Steps
    Common commonCode;

    public RequestSpecification makeBaseRequest( String jsonPayLoad, boolean... cookie) throws IOException {
        request  = setSecurity(cookie);
        request  = setContentType(jsonPayLoad);
        String jsonBody = commonCode.generateStringFromResource(System.getProperty("user.dir") + basePath + jsonPayLoad);
        request.body(jsonBody);
        return request;
    }

    public RequestSpecification setContentType(String jsonPayload){
        Pattern pat = Pattern.compile(".*json.*");
        Matcher mat = pat.matcher(jsonPayload);
        if (mat.matches()) {
             return request.header("Content-Type", "application/json");

        } else {
             pat = Pattern.compile(".*xml.*");
             mat = pat.matcher(jsonPayload);

            if (mat.matches()) {
                return request.header("Content-Type", " text/xml");

            } else {
                 pat = Pattern.compile(".*txt.*");
                 mat = pat.matcher(jsonPayload);

                if (mat.matches()) {
                    return request.header("Content-Type", " application/x-www-form-urlencoded");

                }
            }
        }
        return null;
    }

    public RequestSpecification makeBaseRequest(boolean... cookie ) throws IOException {

        request  = setSecurity(cookie);
        return request;
    }
    public RequestSpecification makeBaseRequestNotAuth(  ) throws IOException {

        return request;
    }
    public RequestSpecification makeBaseRequestNotAuth(String jsonPayLoad ) throws IOException {
        request  = setContentType(jsonPayLoad);
        String jsonBody = commonCode.generateStringFromResource(System.getProperty("user.dir") + basePath + jsonPayLoad);
        request.body(jsonBody);

        return request;
    }

    public  RequestSpecification setSecurity(boolean[] cookie) throws IOException{
        boolean flag = cookie.length >= 1 && cookie[0];
        request = flag ? setHeaderWithCookie() : setHeaderWithBasic();
return request;
    }

    public RequestSpecification setHeaderWithCookie( ) throws IOException {
        request.header("Cookie", "token=abc123");
        return request;
    }    public RequestSpecification setHeaderWithBasic( ) throws IOException {
        request.given().auth().preemptive().basic("admin", "password123");
        return request;
    }

}
