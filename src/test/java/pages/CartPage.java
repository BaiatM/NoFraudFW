package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;

public class CartPage extends BasePage {
    @FindBy(xpath = "//*[@class='cart_list']")
    WebElement cartList;
    @FindBy(xpath = "//*[text()='Your Cart']")
    WebElement cartPageLogo;
    @FindBy(xpath = "//*[@name='checkout']")
    WebElement checkoutBtn;
    @FindBy(xpath = "//*[@name='firstName']")
    WebElement checkOutFirstName;
    @FindBy(xpath = "//*[@name='lastName']")
    WebElement checkOutLastName;
    @FindBy(xpath = "//*[@name='postalCode']")
    WebElement checkOutZip;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy(id = "finish")
    WebElement finishBtn;
    @FindBy(xpath = "//*[text()='Thank you for your order!']")
    WebElement thankYouLetter;
    @FindBy(xpath = "//*[@class='complete-text']")
    WebElement confirmationLetter;

    Faker faker = new Faker();


    public void userVerifiesCartPageAndAddedItem(String addedItem) {
        Assert.assertTrue("User is not on cart page", cartPageLogo.isDisplayed());
        Assert.assertTrue("Added item is different", cartList.getText().contains(addedItem));
    }

    public void userClicksOnCheckoutBtn() {
        Assert.assertTrue("Checkout button is not present", checkoutBtn.isDisplayed());
        checkoutBtn.click();
    }

    public void userFillsOutCheckoutInfo() {
        Assert.assertTrue("Checkout first name input is not present", checkOutFirstName.isDisplayed());
        Assert.assertTrue("Checkout last name input is not present", checkOutLastName.isDisplayed());
        Assert.assertTrue("Checkout postal code input is not present", checkOutZip.isDisplayed());

        checkOutFirstName.sendKeys(faker.name().firstName());
        checkOutLastName.sendKeys(faker.name().lastName());
        checkOutZip.sendKeys(faker.address().zipCode());
    }

    public void userClicksOnContinueBtn() {
        Assert.assertTrue("Continue button is not present", continueBtn.isDisplayed());
        continueBtn.click();
    }

    public void userClickOnFinishBtn() {
        Assert.assertTrue("Finish button is not present", finishBtn.isDisplayed());
        finishBtn.click();
    }

    public void userVerifiesConfirmationLetters() {
        Assert.assertTrue("Thank you letter is not present", thankYouLetter.isDisplayed());
        Assert.assertTrue("Confirmation letter is not present", confirmationLetter.isDisplayed());
    }

    public void userVerifiesCartPageAndTargetItem(String targetItem) {
        Assert.assertTrue("User is not on cart page", cartPageLogo.isDisplayed());
        Assert.assertTrue("Added item is different", cartList.getText().contains(ConfigReader.getProperty(targetItem)));
    }
}
