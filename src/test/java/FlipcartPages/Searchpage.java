package FlipcartPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	
	WebDriver driver;
	public Searchpage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	
		
	}
		
		@FindBy(name="q")
		WebElement searchproduct;
		
		
		public void searchproduct(String product) {
			searchproduct.sendKeys(product);
			searchproduct.sendKeys(Keys.ENTER);
			
		}
		
	

}
