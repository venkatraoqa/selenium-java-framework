package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//driver.get("https://demo.guru99.com/test/radio.html");

		driver.manage().window().maximize();
		
//	isDisplayed
		
	WebElement logo =	driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	
	if(logo.isDisplayed()) {
		System.out.println("Logo is displayed");
	}
	else {
		System.out.println("Logi is not displayed");
	}
   
   
	//isEnabled
	
WebElement searchbox =	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   if(searchbox.isEnabled()) {
	   searchbox.sendKeys("Mobiles");
	   System.out.println("Search box is enabled");
   } else {
		   System.out.println("Search box is not enabled");
	   }
   
   
   //isSelected
   
//		WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
//
//		if (!checkbox.isSelected()) {
//		    checkbox.click();
//		}
//
//		System.out.println("Checkbox selected status: " + checkbox.isSelected());
		
		
		

				
	   
   }
   
	}


