import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class inventory {

    @Test
    public void getRequest() {
        given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=d8552a32de0f891803fb84dba8aed5b7")
                .then().assertThat().statusCode(200);
    }


}
