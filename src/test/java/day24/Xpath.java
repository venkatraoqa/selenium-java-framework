package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Xpath with single attribuite
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T shirts");

		//Xpath with multiple attribuites
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@placeholder='Search Amazon.in']")).sendKeys("T shirts");

		//Xpath with 'and' operator
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and @placeholder='Search Amazon.in']")).sendKeys("T shirts");

		//Xpath with 'or' operator
		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @placeholder='Search Amazon.in']")).sendKeys("T shirts");

		
		//Xpath with contains
//		driver.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("T shirts");
		
		//Xpath with starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'tw')]")).sendKeys("T shirts");
		
		
	}

}
