package FlipcartBase;

import java.time.Duration;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import utils.ExtentReportManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void reportSetup() {
        ExtentReportManager.initReport();   // ✅ correct
    }

    @BeforeMethod
    public void setup(Method method) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com/");

        ExtentReportManager.createTest(method.getName());   // ✅ test name
    }

    @AfterMethod
    public void teardown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentReportManager.logFail("Test Failed: " + result.getName());
        } 
        else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentReportManager.logPass("Test Passed");
        } 
        else {
            ExtentReportManager.logSkip("Test Skipped");
        }

        driver.quit();
    }

    @AfterSuite
    public void reportFlush() {
        ExtentReportManager.flushReport();   // ✅ correct
    }
}