package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        ChromeOptions options =
                new ChromeOptions();

        options.addArguments(
                "--disable-notifications");

        options.addArguments(
                "--start-maximized");

        driver =
                new ChromeDriver(options);

        driver.manage().timeouts()
                .implicitlyWait(
                        Duration.ofSeconds(10));

        driver.get(
                "https://automationexercise.com");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}