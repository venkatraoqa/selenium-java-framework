package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistraionpage extends Basepage{
	
	WebDriver driver;
	public AccountRegistraionpage(WebDriver driver) 
	{
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement textusname;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtfirtname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement btnrgclick;
	
	
	
	
	public void setusername(String usname) 
	{
		textusname.sendKeys(usname);
	}
	
	public void setfirstname(String fname) 
	{
		txtfirtname.sendKeys(fname);
	}

	public void setlastname(String lname) 
	{
		txtlastname.sendKeys(lname);
	}
	public void setemail(String email) 
	{
		txtemail.sendKeys(email);
	}
	public void setpwd(String pwd) 
	{
		txtpwd.sendKeys(pwd);
	}
	public void clickregister() 
	{
		textusname.click();
	}
	
	
	
//	public String getConfirmationMsg() 
//	{
//	    try {
//	        return msgconfirmation.getText();
//	    } catch (Exception e) {
//	        return e.getMessage();
//	    }
//	}
	}
	

