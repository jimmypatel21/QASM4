package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSubmit {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("jimmy21");
		driver.findElement(By.name("password")).sendKeys("patel12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
