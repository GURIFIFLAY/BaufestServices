package utils;

public class Constants {

    private static String URL ="https://petstore.swagger.io/v2/";
    private static String LOGIN_ENDPOINT="/auth";
    private static String ENDPOINT="/pet";

    public static String getLoginEndpoint() {
        return LOGIN_ENDPOINT;
    }

    public static void setLoginEndpoint(String loginEndpoint) {
        LOGIN_ENDPOINT = loginEndpoint;
    }

    public static String getEndpoint() {
        return ENDPOINT;
    }

    public static void setBookingEndpoint(String endpoint) {
        ENDPOINT = endpoint;
    }

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        Constants.URL = URL;
    }
}
