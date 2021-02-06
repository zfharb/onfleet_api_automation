import api.Weather;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GetWeatherTest extends BaseTest {

    public static String jsonAsString;
    public static Weather weather;

    @BeforeAll
    public static void setUp() {
        weather = new Weather();
    }

    @Test
    public void getWeatherByCityTest() {
        weather.getTempByCity("london").then().assertThat().statusCode(200);
        jsonAsString =  weather.getTempByCity("london").then().contentType(ContentType.JSON).extract().response().asString();
        JSONObject JSONResponseBody = new JSONObject(jsonAsString);
        JSONObject main = (JSONObject) JSONResponseBody.get("main");

        System.out.println(main.get("temp"));
        Assertions.assertNotNull(main.get("temp"));
    }

    @Test
    public void getWeatherByLatAndLongTest() {
        weather.getTempByLatAndLongt("51.5074","0.1278").then().assertThat().statusCode(200);

        jsonAsString =  weather.getTempByLatAndLongt("51.5074","0.1278").then().contentType(ContentType.JSON).extract().response().asString();
        JSONObject JSONResponseBody = new JSONObject(jsonAsString);
        JSONObject main = (JSONObject) JSONResponseBody.get("main");

        System.out.println(main.get("temp"));
        Assertions.assertNotNull(main.get("temp"));
    }
}
