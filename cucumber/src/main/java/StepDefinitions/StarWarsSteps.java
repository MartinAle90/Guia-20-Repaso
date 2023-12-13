package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WikipediaPage;

public class StarWarsSteps {

    StarWarsApi apiSW;
    WikipediaPage wikiP;


    @Given("request character id {int}")
    public void request_character_id(Integer characterId) {

        System.out.println("request character id "+ characterId);
        System.out.println("comida");
        System.out.println("1");
        System.out.println(apiSW.getName(characterId));
        System.out.println("2");

    }

    @When("search on Wikipedia {string}")
    public void search_on_wikipedia(String cName) {
        System.out.println("search on Wikipedia "+cName);
    }

    @Then("page correctly displayed")
    public void page_correctly_displayed() {
       System.out.println("page correctly displayed");
    }
}
