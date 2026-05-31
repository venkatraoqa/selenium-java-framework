package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		//Id
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//		
//		//Name
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		
//		//Classname
//		boolean logodisplayed =	driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//		System.out.println(logodisplayed);
	
	
	//Linktext
//	driver.findElement(By.linkText("Sell")).click();
//	
//	//Partial linktext
//	driver.findElement(By.linkText("Se")).click();
		
		
	//Xpath
driver.findElement(By.xpath("//span[@role='button']")).click();
	
	
	}

}
