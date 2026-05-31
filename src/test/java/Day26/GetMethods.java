package Day26;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.getCurrentUrl());
//		
//		
	String windowid =	driver.getWindowHandle();
		System.out.println("window id:"+windowid);
//		
//		
	driver.findElement(By.linkText("Sell")).click();
	Set<String> windowids =	driver.getWindowHandles();
	System.out.println(windowids);
	
	
	
		

	}

}
