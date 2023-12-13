package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {
    WebDriver driver;

    LoginPage login;

    @Given("browser is open")
    public void browser_is_open(){
        System.out.println("Inside Step - browser is open");

        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        System.out.println("Inside Step - user is on login page");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

    }

    @When("user enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password){
        System.out.println("Inside Step - user enters username and password");

        login = new LoginPage(driver);

        login.enterUsername(username);
        login.enterPassword(password);

    }

    @And("user clicks on login")
    public void user_clicks_on_login(){
        System.out.println("Inside Step - user clicks on login");

        login = new LoginPage(driver);

        login.clicLogin();

    }

    @And("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        System.out.println("Inside Step - user is navigated to the home page");

        login = new LoginPage(driver);

        login.checkIsDesplayed();

        driver.close();
        driver.quit();

    }



}
