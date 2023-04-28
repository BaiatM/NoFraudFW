package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BasePage {
    WebDriver driver = DriverUtils.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
