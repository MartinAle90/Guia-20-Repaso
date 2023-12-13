package pages;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import io.restassured.response.Response;
import org.testng.Assert;


public class StarWarsApi {
    static String apiUrl = "https://swapi.dev/api/people/";
    static String people = "https://swapi.dev/api/people/";
    Response response;

    public String getName(int characterId) {
        String nameCharacter;
        response = RestAssured.given().get(apiUrl + characterId); //"stream".
        Assert.assertEquals(response.getStatusCode(), 200);
        JSONObject jsonResponse = new JSONObject(response.body().asString()); //"String"
        nameCharacter = jsonResponse.getString("name");

        return nameCharacter;
    }


}
