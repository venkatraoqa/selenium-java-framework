package FlipcartTestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import FlipcartBase.BaseTest;
import FlipcartPages.Homepage;
import FlipcartPages.Searchpage;

public class SearchTest extends BaseTest {

    @Test
    public void verifysearchpage() throws InterruptedException {
        Homepage home = new Homepage(driver);
        home.closeloginbtn();

        // Step 2: search
        Searchpage search = new Searchpage(driver);
        search.searchproduct("iPhone 14");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until title contains keyword
        wait.until(ExpectedConditions.titleContains("iPhone"));

        String actualTitle = driver.getTitle();
        System.out.println("Page title: " + actualTitle);

        // Assertion 1: Title check
        Assert.assertTrue(actualTitle.toLowerCase().contains("iphone"),
                "Results page not loaded. Actual title: " + actualTitle);

        // Updated locator for product cards (Flipkart often changes DOM)
        By productLocator = By.cssSelector("div._13oc-S"); // current Flipkart product card container

        // Wait until product cards are present
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productLocator));

        List<WebElement> products = driver.findElements(productLocator);
        System.out.println("Number of products found: " + products.size());

        // Assertion 2: Products check
        Assert.assertTrue(products.size() > 0,
                "No products displayed on search results page.");
    }
}
