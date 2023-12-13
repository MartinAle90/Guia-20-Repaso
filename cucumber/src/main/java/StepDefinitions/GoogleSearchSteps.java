package StepDefinitions;

import org.openqa.selenium.WebDriver;

public class GoogleSearchSteps {

    WebDriver driver;

//    @Before
//    public void setUpDriver() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void afterAllTest() {
//        driver.close();
//    }


//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step - browser is open");
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//
//
//    }
//
//    @And("user is on google search page")
//    public void user_is_on_google_search_page() {
//        System.out.println("Inside Step - user is on google search page");
//
//        driver.navigate().to("https://www.google.com");
//    }
//
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() {
//        System.out.println("Inside Step - user enters a text in search box");
//
//        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Automation Step by Step");
//    }
//
//    @And("hit enter")
//    public void hit_enter() {
//        System.out.println("Inside Step - hit enter");
//
//        driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);
//    }
//
//    @Then("user us navigated to search results")
//    public void user_us_navigated_to_search_results() {
//        System.out.println("Inside Step - user us navigated to search results");
//
//        driver.getPageSource().contains("Online Courses");
//        driver.close();
//        driver.quit();
//
//    }


}
