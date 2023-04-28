package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import pages.CartPage;
import pages.HomePage;

public class AddingTargetItem {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @And("user adds {string} to cart")
    public void userAddsToCart(String targetItem) {
        homePage.userAddsTargetItem(targetItem);
    }

    @When("user verifies the cart page and {string}")
    public void userVerifiesTheCartPageAnd(String targetItem) {
        cartPage.userVerifiesCartPageAndTargetItem(targetItem);
    }
}
