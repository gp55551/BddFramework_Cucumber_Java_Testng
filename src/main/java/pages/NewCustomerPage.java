package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonMethods.*;

public class NewCustomerPage {
    private WebDriver driver;

    private final By registerAccount = By.xpath("//h1[contains(text(),'Register Account')]");
    private final By loginPageLink = By.xpath("//a[text()='login page']");
    private final By firstName = By.xpath("//input[@name='firstname']");
    private final By lastName = By.xpath("//input[@name='lastname']");
    private final By email = By.xpath("//input[@name='email']");
    private final By telephone = By.xpath("//input[@name='telephone']");
    private final By password = By.xpath("//input[@name='password']");
    private final By confirm = By.xpath("//input[@name='confirm']");
    private final By agreeCheckbox = By.xpath("//*[text()='I have read and agree to the ']//following-sibling::input[@type='checkbox']");
    private final By continueButton = By.xpath("//input[@type='submit']");

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyRegisterAccountHeader() {
        verifyElementDisplayed(driver, registerAccount);
    }

    public void verifyLoginPageLink() {
        verifyElementDisplayed(driver, loginPageLink);
    }

    public void verifyFieldsDisplayed() {
        verifyElementDisplayed(driver, firstName);
        verifyElementDisplayed(driver, lastName);
        verifyElementDisplayed(driver, email);
        verifyElementDisplayed(driver, telephone);
        verifyElementDisplayed(driver, password);
        verifyElementDisplayed(driver, confirm);
        verifyElementDisplayed(driver, agreeCheckbox);
    }

    public void verifyContinueButtonDisplayed() {
        verifyElementDisplayed(driver, continueButton);
    }
}
