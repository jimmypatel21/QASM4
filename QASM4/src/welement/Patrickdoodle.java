package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Patrickdoodle {

	public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/doodles");
	
	driver.findElement(By.xpath("//a[contains(text(),//a[contains(text(),\"Winter Games 2022 Begin! (Mar 4)\")])]")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
	
	
	
		
	}

}
