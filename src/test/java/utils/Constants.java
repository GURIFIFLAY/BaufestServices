package utils;

public class Constants {

    private static String URL ="https://restful-booker.herokuapp.com/";
    private static String LOGIN_ENDPOINT="/auth";
    private static String BOOKING_ENDPOINT="/booking";

    public static String getLoginEndpoint() {
        return LOGIN_ENDPOINT;
    }

    public static void setLoginEndpoint(String loginEndpoint) {
        LOGIN_ENDPOINT = loginEndpoint;
    }

    public static String getBookingEndpoint() {
        return BOOKING_ENDPOINT;
    }

    public static void setBookingEndpoint(String bookingEndpoint) {
        BOOKING_ENDPOINT = bookingEndpoint;
    }

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        Constants.URL = URL;
    }
}
