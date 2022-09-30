package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlevelentain {

	public static void main(String[] args) throws Throwable {
	 
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/doodles");
		
		driver.findElement(By.xpath("//a[contains(text(),//a[contains(text(),\"Valentine's Day 2022\")])]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
