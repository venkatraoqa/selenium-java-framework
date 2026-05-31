package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
    
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//id
	boolean logodisplayed =	driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println(logodisplayed);
		
		//Linktext
		driver.findElement(By.linkText("Sell")).click();
		driver.findElement(By.partialLinkText("Se")).click();
		
		//classname
  List<WebElement> headerlinks =driver.findElements(By.className("nav-sprite"));
  System.out.println("Total number of header links:"+headerlinks.size());
  
  // tagname
List<WebElement> links =  driver.findElements(By.tagName("a"));
  System.out.println("Total number of links:"+links.size());
  
List<WebElement> images =	driver.findElements(By.tagName("img"));
System.out.println("Total number of images:"+images.size());


  
  
  
     

	}

}
