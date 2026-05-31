package Saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy(id = "Email-error")
    WebElement emailError;

    // Actions
    public void enterFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void enterEmail(String em) {
        email.sendKeys(em);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        confirmPassword.sendKeys(cpwd);
    }

    public void clickRegister() {
        registerBtn.click();
    }

    // Validation
    public String getEmailError() {
        return emailError.getText();
    }

    public boolean isRegisterButtonDisplayed() {
        return registerBtn.isDisplayed();
    }
}