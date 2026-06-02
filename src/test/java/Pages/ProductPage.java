package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Waits;

public class ProductPage {

    WebDriver driver;
    Waits wait;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new Waits(driver);
    }

    // Locators

    By productsBtn =
            By.xpath("//a[contains(text(),'Products')]");

    By searchBox =
            By.id("search_product");

    By searchBtn =
            By.id("submit_search");

    By searchedProducts =
            By.xpath("//h2[contains(text(),'Searched Products')]");

    By addToCart =
            By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    By viewCart =
            By.xpath("//u[contains(text(),'View Cart')]");

    // Open Products Page

    public void openProductsPage() {

        try {

            WebElement products =
                    driver.findElement(productsBtn);

            wait.waitForClickable(products);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    products);

            Thread.sleep(3000);

            // Google Ad Redirect Handle

            if (driver.getCurrentUrl()
                    .contains("google_vignette")) {

                driver.navigate().back();

                Thread.sleep(3000);

                products =
                        driver.findElement(productsBtn);

                js.executeScript(
                        "arguments[0].click();",
                        products);

                Thread.sleep(3000);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Search Product

    public void searchProduct(String productName) {

        try {

            WebElement search =
                    driver.findElement(searchBox);

            wait.waitForVisibility(search);

            search.clear();

            search.sendKeys(productName);

            WebElement searchButton =
                    driver.findElement(searchBtn);

            wait.waitForClickable(searchButton);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    searchButton);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Verify Search

    public boolean isProductSearchSuccessful() {

        try {

            WebElement result =
                    driver.findElement(searchedProducts);

            wait.waitForVisibility(result);

            return result.isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    // Add To Cart

    public void addProductToCart() {

        try {

            WebElement cartButton =
                    driver.findElement(addToCart);

            wait.waitForClickable(cartButton);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    cartButton);

            Thread.sleep(2000);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // View Cart

    public void clickViewCart() {

        try {

            WebElement cart =
                    driver.findElement(viewCart);

            wait.waitForClickable(cart);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    cart);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}