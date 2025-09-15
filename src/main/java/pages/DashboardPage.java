package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonMethods.*;

public class DashboardPage {
    private WebDriver driver;
    private By myAccount = By.xpath("//h2[text()='My Account']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyMyAccountDisplayed() {
        waitForElementToBeVisible(driver, myAccount);
        return driver.findElement(myAccount).isDisplayed();
    }
}
