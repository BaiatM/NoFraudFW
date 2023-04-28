package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@class='login_logo']")
    WebElement loginPageLogo;
    @FindBy(id = "user-name")
    WebElement usernameInput;
    @FindBy(xpath = "//*[@type='password']")
    WebElement passwordInput;
    @FindBy(css = "#login-button")
    WebElement loginBtn;

    public void verifyLoginPage() {
        Assert.assertTrue("User is not on the login page", loginPageLogo.isDisplayed());
    }

    public void userEntersValidCredentials(String username, String password) {
        Assert.assertTrue("Username input is not on the login page", usernameInput.isDisplayed());
        Assert.assertTrue("Password input is not on the login page", passwordInput.isDisplayed());
        usernameInput.sendKeys(ConfigReader.getProperty(username));
        passwordInput.sendKeys(ConfigReader.getProperty(password));
    }

    public void userClicksOnLoginBtn() {
        Assert.assertTrue("Login button is not on the login page", loginBtn.isDisplayed());
        loginBtn.click();
    }
}
