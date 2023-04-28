package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user verifies its a login page")
    public void userVerifiesItsALoginPage() {
        loginPage.verifyLoginPage();
    }

    @And("user enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {
        loginPage.userEntersValidCredentials(username, password);
    }

    @When("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        loginPage.userClicksOnLoginBtn();
    }

    @Then("verify user is successfully logged in to the account")
    public void verifyUserIsSuccessfullyLoggedInToTheAccount() {
        homePage.successfulLogInVerification();
    }
}
