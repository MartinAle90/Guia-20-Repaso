package pages;

import org.openqa.selenium.WebDriver;

public class WikipediaPage extends BasePage{
    static String wikiUrl = "https://www.wikipedia.org/";
    static String search = "https://es.wikipedia.org/w/index.php?search=";
    static String wikiName = "";

    public WikipediaPage(WebDriver driver) {
        super(driver);
    }

    static void setName(String name) {
        WikipediaPage.wikiName = name;
    }

    static String getName() {
        return wikiName;
    }
}
