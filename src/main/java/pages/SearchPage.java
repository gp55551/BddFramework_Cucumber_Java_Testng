package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static utils.CommonMethods.*;

public class SearchPage {
    private WebDriver driver;

    private final By firstLink = By.xpath("//h4/a[1]");
    private final By addToCartButton = By.xpath("//*[text()='Add to Cart']");
    private final By heartButton = By.xpath("//*[@class='fa fa-heart']");
    private final By exchangeButton = By.xpath("//*[@class='fa fa-exchange']");
    private final By searchField = By.xpath("//*[@name='search']");
    private final By searchButton = By.xpath("//*[@name='search']/following::button[1]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySearchFieldAndButton()
    {
        verifyElementDisplayed(driver, searchField);
        verifyElementDisplayed(driver, searchButton);
    }

    public void searchProduct(String text)
    {
        sendKeys(driver, searchField,text);
        click(driver, searchButton);
    }

    public void verifyProductDisplayed(String text)
    {
        Assert.assertTrue(driver.findElement(firstLink).getText().contains(text));
    }

    public void verifyAddToCartDisplayed()
    {
        verifyElementDisplayed(driver, addToCartButton);
    }

    public void verifyHeartButtonDisplayed()
    {
        verifyElementDisplayed(driver, heartButton);
    }

    public void verifyExchangeButtonDisplayed()
    {
        verifyElementDisplayed(driver, exchangeButton);
    }
}