package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.LoadFirstPage;
import pages.StarWarsApi;
import pages.WikiPortadaPage;

public class StarWarsSteps {
    ChromeDriver driver;
    StarWarsApi apiSW = new StarWarsApi();
    LoadFirstPage loadFirstPage = new LoadFirstPage(driver);
//    WikiPortadaPage wikiP;
    static String wikiUrl = "https://es.wikipedia.org/";
    String characterName;
    String name;

    @Given("request character id {int}")
    public void request_character_id(Integer characterId) {
        System.out.println("request character id " + characterId);

        characterName = apiSW.getName(characterId);

    }

    @When("search on Wikipedia {string}")
    public void search_on_wikipedia(String cName) {
        System.out.println("search on Wikipedia " + cName);
        name = cName;
        WikiPortadaPage wikiP = loadFirstPage.navigateTo(wikiUrl);
        wikiP.searchCharacter(cName);

    }

    @Then("page correctly displayed")
    public void page_correctly_displayed() {

        Assert.assertEquals(characterName, name);

        System.out.println("page correctly displayed");

        loadFirstPage.closeDriver();
    }
}
