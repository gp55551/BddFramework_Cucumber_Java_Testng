package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SearchPage;
import utils.Base64Class;
import utils.ConfigReader;
import utils.DriverManager;

public class LoginSteps {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    SearchPage searchPage;

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

    @Then("user verifies Search field displayed")
    public void userVerifiesSearchFieldDisplayed() {
        searchPage = new SearchPage(DriverManager.getDriver());
        searchPage.verifySearchFieldAndButton();
    }

    @When("user search iphone in the search field and clicks search button")
    public void userSearchIphoneInTheSearchFieldCLickSearchButton() {
        searchPage = new SearchPage(DriverManager.getDriver());
        searchPage.searchProduct("iPhone");
    }


    @Then("user verifies product iphone is displayed")
    public void userVerifiesProductIphoneIsDisplayed() {
        searchPage = new SearchPage(DriverManager.getDriver());
        searchPage.verifyProductDisplayed("iPhone");
    }

    @Then("user verifies Add to cart button  is displayed")
    public void userVerifiesAddToCartButtonIsDisplayed() {
        searchPage.verifyAddToCartDisplayed();
    }

    @And("user verifies Heart Button is displayed")
    public void userVerifiesHeartButtonIsDisplayed() {
        searchPage.verifyHeartButtonDisplayed();
    }

    @And("user verifies Exchange Button is displayed")
    public void userVerifiesExchangeButtonIsDisplayed() {
        searchPage.verifyExchangeButtonDisplayed();
    }
}
