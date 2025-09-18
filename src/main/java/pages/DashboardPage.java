package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonMethods.*;

public class DashboardPage {
    private WebDriver driver;
    private By myAccount = By.xpath("//h2[text()='My Account']");
    private final By addressBookLink = By.xpath("//a[text()='Address Book']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyMyAccountDisplayed() {
        waitForElementToBeVisible(driver, myAccount);
        return driver.findElement(myAccount).isDisplayed();
    }

    public void clickAddressBookLink() {
        click(driver,addressBookLink);
    }
}
