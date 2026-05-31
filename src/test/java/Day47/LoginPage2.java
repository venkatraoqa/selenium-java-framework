package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btn_login;
	
	
	//Action methods
	public void setusername(String user)
	{
		txt_username.sendKeys(user);
		
	}
	public void setuserpassword(String pwd)
	{
		txt_password.sendKeys(pwd);
		
	}
	public void clicklogin()
	{
		
		btn_login.click();
	}
}
