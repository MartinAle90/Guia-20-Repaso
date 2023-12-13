package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.basePage.BasePage;

public class LoadFirstPage extends BasePage {


    public LoadFirstPage(WebDriver driver) {
        super(driver);
    }

    public WikiPortadaPage navigateTo(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);

        return new WikiPortadaPage(super.getDriver());
    }

    public void closeDriver(){
        driver.close();
    }


}
