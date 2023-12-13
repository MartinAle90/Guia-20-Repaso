package utils.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import utils.MyDriver;


public class BaseTest {

    MyDriver driver;

    //    @BeforeMethod
    @Parameters({"browser", "url"})
    public void beforeMethod(String browser, String url) {
        System.out.println("Naviganting to" + url);
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }


    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }



    /**
     * Use of quit() method helps to avoid socket reset error
     */
    @AfterMethod
    public void afterMethod() {
        driver.getDriver().quit();
    }
}