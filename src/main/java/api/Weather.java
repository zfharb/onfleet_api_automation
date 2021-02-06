package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Weather {


    final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";

    public Weather() {
    }

    /**
     * This method will get the weather based on the city name
     *
     * @param  City name as a string.
     * @return Response object.
     */
    public Response getTempByCity(String city) {
        Response response = given().when().get(BASE_URL+ "q=" + city+ "&appid=" + Key.getKey());
        return response;
    }

    /**
     * This method will get the weather based on the city longtitude and latitude
     *
     * @param  longtitude and latitude as strings.
     * @return Response object.
     */
    public Response getTempByLatAndLongt(String lat, String longt) {
        Response response = given().when().get(BASE_URL+ "lat=" + lat + "&lon=" + longt + "&appid=" + Key.getKey());
        return response;
    }

}
