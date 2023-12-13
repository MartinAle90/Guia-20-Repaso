package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class WikiSearchPage extends BasePage {

    @FindBy(css = "span[class='mw-page-title-main']")
    public WebElement tituloWikiPage;

    public WikiSearchPage(WebDriver driver) {
        super(driver);
    }


    public boolean searchPage() {
        System.out.println("wiki search page");
        waitElementVisibility(tituloWikiPage);
        return tituloWikiPage.isDisplayed();
    }
}
