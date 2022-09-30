package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("pateljimmy21@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("nuttertools@22");
	
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).submit();
		Thread.sleep(15000);
		driver.quit();
		
		
		
		
		
	}

}
