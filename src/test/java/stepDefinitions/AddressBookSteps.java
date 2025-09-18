package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AddressBookPage;
import pages.DashboardPage;
import utils.DriverManager;

public class AddressBookSteps {
    DashboardPage dashboardPage;
    AddressBookPage addressBookPage;

    @Then("user clicks Address Book link")
    public void userClicksAddressBookLink() {
        dashboardPage = new DashboardPage(DriverManager.getDriver());
        dashboardPage.clickAddressBookLink();
    }

    @Then("user verifies Address book header")
    public void userVerifiesAddressBookHeader() {
        addressBookPage = new AddressBookPage(DriverManager.getDriver());
        addressBookPage.verifyAddressBookEntriesHeader();
    }

    @And("user verifies Buttons present")
    public void userVerifiesButtonsPresent() {
        addressBookPage.verifyButtonsPresent();
    }
}
