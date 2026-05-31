package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//tag id  tag#id
//		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T shirts");
//		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T shirts");
		
   
		//tag class tag.classname
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("T shirts");
		
		driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute")).sendKeys("T shirts");
		
	}

}
