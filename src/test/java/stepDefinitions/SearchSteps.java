package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import utils.DriverManager;

public class SearchSteps {
    SearchPage searchPage;

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
