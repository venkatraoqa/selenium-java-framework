package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }

    // ======================
    // Locators
    // ======================

    By signupLogin =
      By.xpath("//a[text()=' Signup / Login']");

    By name =
      By.name("name");

    By email =
      By.xpath("//input[@data-qa='signup-email']");

    By signupBtn =
      By.xpath("//button[text()='Signup']");

    By genderMr =
      By.id("id_gender1");

    By password =
      By.id("password");

    By day =
      By.id("days");

    By month =
      By.id("months");

    By year =
      By.id("years");

    By newsletter =
      By.id("newsletter");

    By firstName =
      By.id("first_name");

    By lastName =
      By.id("last_name");

    By company =
      By.id("company");

    By address =
      By.id("address1");

    By country =
      By.id("country");

    By state =
      By.id("state");

    By city =
      By.id("city");

    By zipcode =
      By.id("zipcode");

    By mobile =
      By.id("mobile_number");

    By createAccount =
      By.xpath("//button[text()='Create Account']");

    By accountCreated =
      By.xpath("//b[text()='Account Created!']");

    By continueBtn =
      By.xpath("//a[text()='Continue']");

    // ======================
    // Methods
    // ======================

    public void clickSignupLogin() {

        driver.findElement(signupLogin)
              .click();
    }

    public void enterSignupDetails(
            String username,
            String useremail) {

        driver.findElement(name)
              .sendKeys(username);

        driver.findElement(email)
              .sendKeys(useremail);

        WebElement signupButton =
            driver.findElement(signupBtn);

        JavascriptExecutor js =
            (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].click();",
            signupButton);
    }

    public void completeRegistration() {

        driver.findElement(genderMr)
              .click();

        driver.findElement(password)
              .sendKeys("Test123");

        Select dayDropdown =
          new Select(driver.findElement(day));

        dayDropdown.selectByVisibleText("10");

        Select monthDropdown =
          new Select(driver.findElement(month));

        monthDropdown.selectByVisibleText("May");

        Select yearDropdown =
          new Select(driver.findElement(year));

        yearDropdown.selectByVisibleText("1998");

        driver.findElement(newsletter)
              .click();

        driver.findElement(firstName)
              .sendKeys("Venkat");

        driver.findElement(lastName)
              .sendKeys("Rao");

        driver.findElement(company)
              .sendKeys("ABC Company");

        driver.findElement(address)
              .sendKeys("Hyderabad");

        Select countryDropdown =
          new Select(driver.findElement(country));

        countryDropdown.selectByVisibleText("India");

        driver.findElement(state)
              .sendKeys("Telangana");

        driver.findElement(city)
              .sendKeys("Hyderabad");

        driver.findElement(zipcode)
              .sendKeys("500001");

        driver.findElement(mobile)
              .sendKeys("9876543210");

        driver.findElement(createAccount)
              .click();
    }

    public boolean isAccountCreated() {

        return driver.findElement(accountCreated)
                     .isDisplayed();
    }

    public void clickContinue() {

        driver.findElement(continueBtn)
              .click();
    }
}