package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SearchPage;
import utils.DriverManager;

public class SearchSteps {
    SearchPage searchPage;

    @Then("user verifies Search field displayed")
    public void userVerifiesSearchFieldDisplayed() {
        searchPage = new SearchPage(DriverManager.getDriver());
        searchPage.verifySearchFieldAndButton();
    }

    @And("user search iphone in the search field and clicks search button")
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

    @And("user clicks heart button")
    public void userClicksHeartButton() {
       searchPage.clickHeartButton();
    }

    @Then("user verifies wishlist Success message")
    public void userVerifiesWishlistSuccessMessage() {
        searchPage.verifySuccessMessageDisplayed();
    }

    @And("user navigates to wishlist")
    public void userNavigatesToWishlist() {
        searchPage.clickWishlistLink();
    }

    @And("user verifies Wishlist header")
    public void userVerifiesWishlistHeader() {
        searchPage.verifyWishlistHeaderDisplayed();
    }

    @And("user verifies iphone is in the list")
    public void userVerifiesIphoneIsInTheList() {
        searchPage.verifyProductDisplayedInList("iPhone");
    }
}
