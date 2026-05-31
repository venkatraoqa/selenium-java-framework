package Saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Loginpage {

    WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginBtn;

    public void openLoginPage() {
        driver.get("https://demo.nopcommerce.com/login");
    }

    public void setEmail(String em) {
        email.clear();
        email.sendKeys(em);
    }

    public void setPassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}