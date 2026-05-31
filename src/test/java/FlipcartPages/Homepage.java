package FlipcartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	//constrctor
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(xpath="//span[@role='button']")
	WebElement closesbtn;
	
	@FindBy(xpath="//a[@href='/']")
	WebElement logo;
	
	@FindBy(xpath="//form[@class='lilxh_ header-form-search']//input[@placeholder='Search for Products, Brands and More']")
	WebElement searchenable;
	
	
	
	//Actions
	public void closeloginbtn() throws InterruptedException {
		Thread.sleep(5000);
		closesbtn.click();
	}
	
	public boolean logodisplayed() {
		return logo.isDisplayed();
	}
	
	public boolean sear5chenabled() {
		return searchenable.isEnabled();	
	}
	
	
	
	
	
	
	

}
