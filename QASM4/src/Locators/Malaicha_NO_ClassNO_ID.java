package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malaicha_NO_ClassNO_ID {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://shop.malaicha.com/login");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	
	driver.quit();
		
		
	}

}
