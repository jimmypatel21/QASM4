package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonClick {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		//driver.findElement(By.xpath("//a[@href='/gp/sva/dashboard?ref_=nav_cs_apay']")).click();
		
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
