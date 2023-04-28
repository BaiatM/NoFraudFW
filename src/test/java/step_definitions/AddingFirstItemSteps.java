package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import utils.ConfigReader;

public class AddingFirstItemSteps {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @Given("user sees all the products")
    public void userSeesAllTheProducts() {
        homePage.verifyAllProductsAreVisible();
    }

    @And("user adds first item to cart")
    public void userAddsFirstItemToCart() {
        homePage.userAddsFirstItem();
    }

    @And("user clicks on the cart icon")
    public void userClicksOnTheCartIcon() {
        homePage.userClicksOnCartIcon();
    }

    @When("user verifies the cart page and added item")
    public void userVerifiesTheCartPageAndAddedItem() {
        cartPage.userVerifiesCartPageAndAddedItem(ConfigReader.getProperty("inventory.item1"));
    }

    @And("user clicks on checkout button")
    public void userClicksOnCheckoutButton() {
        cartPage.userClicksOnCheckoutBtn();
    }

    @And("user fills out the form with fake credentials")
    public void userFillsOutTheFormWithFakeCredentials() {
        cartPage.userFillsOutCheckoutInfo();
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() {
        cartPage.userClicksOnContinueBtn();
    }

    @When("user clicks on finish button")
    public void userClicksOnFinishButton() {
        cartPage.userClickOnFinishBtn();
    }

    @Then("user should see the confirmation letter")
    public void userShouldSeeTheConfirmationLetter() {
        cartPage.userVerifiesConfirmationLetters();
    }
}
