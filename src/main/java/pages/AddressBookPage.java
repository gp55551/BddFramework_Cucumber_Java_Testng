package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonMethods.*;

public class AddressBookPage {
    private WebDriver driver;

    private final By addressBookEntriesHeader = By.xpath("//h2[contains(text(),'Address Book Entries')]");
    private final By backButton = By.xpath("//a[text()='Back']");
    private final By newAddressButton = By.xpath("//a[text()='New Address']");

    public AddressBookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyAddressBookEntriesHeader() {
        verifyElementDisplayed(driver, addressBookEntriesHeader);
    }

    public void verifyButtonsPresent() {
        verifyElementDisplayed(driver, backButton);
        verifyElementDisplayed(driver, newAddressButton);
    }

}
