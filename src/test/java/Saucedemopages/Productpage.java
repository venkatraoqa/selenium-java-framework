package Saucedemopages;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Productpage {

    WebDriver driver;

    public Productpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchBox;

    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchBtn;

    By noResultMessage = By.cssSelector(".no-result");
    By productTitles = By.cssSelector(".product-title a");

    public void enterProduct(String product) {
        searchBox.clear();
        searchBox.sendKeys(product);
    }

    public void clickSearch() {
        searchBtn.click();
    }

    public boolean isNoResultMessageDisplayed() {
        return driver.findElements(noResultMessage).size() > 0;
    }

    public boolean areProductsDisplayed() {
        return driver.findElements(productTitles).size() > 0;
    }

    public List<WebElement> getProducts() {
        return driver.findElements(productTitles);
    }
}