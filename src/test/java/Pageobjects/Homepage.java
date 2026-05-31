package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		super(driver);
	}
		
	@FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
	WebElement lnkregister;
	
	


public void clickregister() {
	
	lnkregister.click();
}

}