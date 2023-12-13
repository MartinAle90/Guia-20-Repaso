package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = "input[name='username']")
    public WebElement inputUsername;

    @FindBy(css = "input[name='password']")
    public WebElement inputPassword;

    @FindBy(css = "button")
    public WebElement buttonLogin;

    @FindBy(css = "div[class='orangehrm-attendance-card-summary']")
    public WebElement thisWeek;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username){
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void clicLogin(){
        buttonLogin.click();
    }

    public void checkIsDesplayed(){
        waitElementVisibility(thisWeek);
        waitSomeSeconds(3);

    }
}
