package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.NewCustomerPage;
import utils.DriverManager;

public class NewCustomerSteps {
    LoginPage loginPage;
    NewCustomerPage newCustomerPage;

   /* @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage = new LoginPage(DriverManager.getDriver());
    }*/
    
    @When("user clicks continue button")
    public void userClicksContinueButton() {
        loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.clickContinue();
    }

    @Then("user navigates to New Customer page")
    public void userNavigatesToNewCustomerPage() {
        newCustomerPage = new NewCustomerPage(DriverManager.getDriver());
        newCustomerPage.verifyRegisterAccountHeader();
    }

    @Given("user is on the new Customer page")
    public void userIsOnTheNewCustomerPage() {
        newCustomerPage = new NewCustomerPage(DriverManager.getDriver());
    }

    @Then("user login page link displayed")
    public void userLoginPageLinkDisplayed() {
        newCustomerPage.verifyLoginPageLink();
    }

    @Then("user verifies all the fields displayed")
    public void userVerifiesAllTheFieldsDisplayed() {
        newCustomerPage.verifyFieldsDisplayed();
    }

    @And("user verifies buttons displayed")
    public void userVerifiesButtonsDisplayed() {
        newCustomerPage.verifyContinueButtonDisplayed();
    }
}
