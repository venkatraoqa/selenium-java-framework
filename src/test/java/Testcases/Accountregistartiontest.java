package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pageobjects.AccountRegistraionpage;
import Pageobjects.Homepage;

public class Accountregistartiontest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		
		
	}
	

	@Test
	public void Accountregistraiontest() 
	{
		Homepage hp = new Homepage(driver);
		hp.clickregister();
		AccountRegistraionpage rgpage = new AccountRegistraionpage(driver);
		rgpage.setusername("venkatrao");
		rgpage.setfirstname("venkatrao");
		rgpage.setlastname("pagadala");
		rgpage.setemail("venkatraopagadala99@gmail.com");
		rgpage.setpwd("Venky@123");
		rgpage.clickregister();
		
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
