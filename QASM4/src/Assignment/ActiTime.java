package Assignment;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		//WebElement userName = driver.findElement(By.id("username"));
		//userName.sendKeys("admin");
		Thread.sleep(3000);
		WebElement passWord = driver.findElement(By.name("pwd"));
		passWord.sendKeys("manager");
		Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();
		//loginButton.click();
		Thread.sleep(4000);
		WebElement logoName = driver.findElement(By.id("logo_aT"));
		logoName.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		





	}

}
