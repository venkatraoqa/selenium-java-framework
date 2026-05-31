package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Launch browser

        driver = new ChromeDriver();

        // Maximize browser

        driver.manage().window().maximize();

        // Wait

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        // Open application

        driver.get("https://automationexercise.com");
    }

    @AfterMethod
    public void tearDown() {

        // Close browser

        driver.quit();
    }
}