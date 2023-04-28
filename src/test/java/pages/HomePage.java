package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@class='app_logo']")
    WebElement homePageLogo;
    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement cartIcon;
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    List<WebElement> inventoryItems;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement backpackAddToCartBtn;
    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartBtns;

    public void successfulLogInVerification() {
        Assert.assertTrue("User is not on home page", homePageLogo.isDisplayed());
        Assert.assertTrue("User is not on home page", cartIcon.isDisplayed());
    }

    public void verifyAllProductsAreVisible() {
        for (WebElement item : inventoryItems) {
            Assert.assertTrue("Inventory item - " + item.getText() + " is not present ", item.isDisplayed());
        }
    }

    public void userAddsFirstItem() {
        Assert.assertTrue("Add to cart button is not present", backpackAddToCartBtn.isDisplayed());
        backpackAddToCartBtn.click();
    }

    public void userClicksOnCartIcon() {
        Assert.assertTrue("Cart icon is not present", cartIcon.isDisplayed());
        cartIcon.click();
    }

    public void userAddsTargetItem(String targetItem) {
        for (int i = 0; i < inventoryItems.size(); i++) {
            if (inventoryItems.get(i).getText().equals(ConfigReader.getProperty(targetItem))) {
                addToCartBtns.get(i).click();
            }
        }
    }
}
