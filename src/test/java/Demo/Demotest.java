package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/account/login");

        // Enter mobile number
        driver.findElement(By.xpath("//input[contains(@class,'c3Bd2c')]"))
              .sendKeys("7989487091");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Wait for OTP screen
        Thread.sleep(5000);

        // 🔥 Use dummy OTP (Real-time approach for testing)
        String otp = "123456";

        driver.findElement(By.cssSelector("input[autocomplete='one-time-code']"))
              .sendKeys(otp);

        driver.findElement(By.xpath("//button[contains(text(),'Login')]"))
              .click();

        Thread.sleep(5000);
        driver.quit();
    }
}