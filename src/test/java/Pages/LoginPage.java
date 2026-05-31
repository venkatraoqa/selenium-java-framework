package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Constructor

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // ======================
    // Locators
    // ======================

    By loginEmail =
      By.xpath("//input[@data-qa='login-email']");

    By loginPassword =
      By.name("password");

    By loginBtn =
      By.xpath("//button[text()='Login']");

    By loggedInText =
      By.xpath("//a[contains(text(),'Logged in as')]");

    // Popup Close Button

    By popupClose =
      By.xpath("//span[text()='Close']");

    // ======================
    // Methods
    // ======================

    public void login(
            String email,
            String password) {

        // Enter Email

        driver.findElement(loginEmail)
              .sendKeys(email);

        // Enter Password

        driver.findElement(loginPassword)
              .sendKeys(password);

        // Login Button

        WebElement loginButton =
            driver.findElement(loginBtn);

        // JavaScript Executor

        JavascriptExecutor js =
            (JavascriptExecutor) driver;

        // Click Login

        js.executeScript(
            "arguments[0].click();",
            loginButton);
    }

    // ======================
    // Validation
    // ======================

    public boolean isLoginSuccessful() {

        return driver.findElement(loggedInText)
                     .isDisplayed();
    }

    // ======================
    // Close Popup
    // ======================

    public void closePopup() {

        try {

            // Wait for popup

            Thread.sleep(8000);

            // Find Close Button

            WebElement closeBtn =
                driver.findElement(popupClose);

            // JavaScript Executor

            JavascriptExecutor js =
                (JavascriptExecutor) driver;

            // Click Popup Close

            js.executeScript(
                "arguments[0].click();",
                closeBtn);

            System.out.println(
                "Popup Closed");

            // Wait for page load

            Thread.sleep(3000);

        } catch (Exception e) {

            System.out.println(
                "Popup Not Present");
        }
    }
}