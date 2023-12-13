package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class WikiPortadaPage extends BasePage {

    @FindBy(css = "input[aria-label^='Buscar']")
    public WebElement inputSearch;

    @FindBy(css = "button[class$='end-button']")
    public WebElement buttonBuscar;

    public WikiPortadaPage(WebDriver driver) {
        super(driver);
    }

    public WikiSearchPage searchCharacter(String nameCharacter) {
        inputSearch.sendKeys(nameCharacter);
        buttonBuscar.click();
        return new WikiSearchPage(super.getDriver());
    }

}
