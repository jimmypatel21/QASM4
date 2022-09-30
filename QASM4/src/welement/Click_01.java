package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_01 {

	public static void main(String[] args) throws Throwable {
     
		  
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	}

}
