package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.Base64Class;
import utils.ConfigReader;
import utils.DriverManager;

public class LoginSteps {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername(Base64Class.decryptPassword(ConfigReader.getProperty("username")));
        loginPage.enterPassword(Base64Class.decryptPassword(ConfigReader.getProperty("password")));
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be navigated to the My Account screen")
    public void user_should_be_navigated_to_the_myAccount() {
        dashboardPage = new DashboardPage(DriverManager.getDriver());
        Assert.assertTrue(dashboardPage.verifyMyAccountDisplayed(), "User is not on My Account screen");
    }

    @Then("user verifies fields username and password")
    public void userVerifiesFieldsUsernameAndPassword() {
        loginPage.verifyFields();
    }

    @And("user verifies forgotten password should be displayed")
    public void userVerifiesForgottenPasswordShouldBeDisplayed() {
        loginPage.verifyForgottenPasswordDisplayed();
    }

    @Then("user verifies Sign In header displayed")
    public void userVerifiesSignInHeaderDisplayed() {
        loginPage.verifySignInHeaderDisplayed();
    }

    @And("user verifies New Customer header displayed")
    public void userVerifiesNewCustomerHeaderDisplayed() {
        loginPage.verifyNewCustomerHeaderDisplayed();
    }
}
