package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonMethods.*;

public class LoginPage {
    private WebDriver driver;

    private final By signInHeader = By.xpath("//h2[contains(text(),'Returning Customer')]");
    private final By usernameField = By.id("input-email");
    private final By passwordField = By.id("input-password");
    private final By loginBtn = By.xpath("//input[@value='Login']");
    private final By forgottenPassword = By.xpath("//*[text()='Forgotten Password']");
    private final By newCustomerHeader = By.xpath("//h2[contains(text(),'New Customer')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySignInHeaderDisplayed() {
        verifyElementDisplayed(driver, signInHeader);
    }

    public void verifyNewCustomerHeaderDisplayed() {
        verifyElementDisplayed(driver, newCustomerHeader);
    }

    public void verifyFields() {
        verifyElementDisplayed(driver, usernameField);
        verifyElementDisplayed(driver, passwordField);
    }

    public void verifyForgottenPasswordDisplayed() {
        verifyElementDisplayed(driver, forgottenPassword);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
