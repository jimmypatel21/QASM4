package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLinkText {

	public static void main(String[] args) throws Throwable {
    
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();
	}

}
