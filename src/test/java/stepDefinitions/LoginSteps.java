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

    @Then("user should be navigated to the dashboard")
    public void user_should_be_navigated_to_the_dashboard() {
        dashboardPage = new DashboardPage(DriverManager.getDriver());
        Assert.assertTrue(dashboardPage.isUserLoggedIn(), "User is not on Dashboard");
    }
}
