package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVerifaiTital {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
