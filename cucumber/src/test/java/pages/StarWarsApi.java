package pages;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class StarWarsApi extends BasePage{
    static String apiUrl = "https://swapi.dev/api/people/";
    static String people = "https://swapi.dev/api/people/";
    Response response;

    public StarWarsApi(WebDriver driver) {
        super(driver);
    }

    public String getName(int characterId) {
        String nameCharacter;
        response = RestAssured.given().get(apiUrl+characterId); //"stream".
        Assert.assertEquals(response.getStatusCode(), 200);

        JSONObject jsonResponse = new JSONObject(response.body().asString()); //"String"
        nameCharacter = jsonResponse.getString("name");
//        Assert.assertEquals(nombre, this.name);

        return nameCharacter;
    }


}
