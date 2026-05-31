package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;

    // Constructor

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    // =========================
    // Locators
    // =========================

    // Products Button

    By productsBtn =
      By.xpath("//a[text()=' Products']");

    // Search Box

    By searchBox =
      By.id("search_product");

    // Search Button

    By searchBtn =
      By.id("submit_search");

    // Searched Products Text

    By searchedProducts =
      By.xpath("//h2[text()='Searched Products']");

    // Add To Cart Button

    By addToCart =
      By.xpath("(//a[text()='Add to cart'])[1]");

    // View Cart Button

    By viewCart =
      By.xpath("//u[text()='View Cart']");

    // =========================
    // Methods
    // =========================

    // Open Products Page

    public void openProductsPage() {

        driver.findElement(productsBtn)
              .click();
    }

    // Search Product

    public void searchProduct(
            String productName) {

        driver.findElement(searchBox)
              .sendKeys(productName);

        driver.findElement(searchBtn)
              .click();
    }

    // Verify Search Result

    public boolean isProductSearchSuccessful() {

        return driver.findElement(searchedProducts)
                     .isDisplayed();
    }

    // Add Product To Cart

    public void addProductToCart() {

        WebElement cartButton =
            driver.findElement(addToCart);

        JavascriptExecutor js =
            (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].click();",
            cartButton);
    }

    // View Cart

    public void clickViewCart() {

        WebElement cart =
            driver.findElement(viewCart);

        JavascriptExecutor js =
            (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].click();",
            cart);
    }
}