package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malaicha_If_Else {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shop-global.malaicha.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("my-acc-btn")).click();
		Thread.sleep(4000);
		
		String expectedLoginTitle = ("Login to Malaicha - Malaicha.com | Send Goods and Groceries ");
		Thread.sleep(3000);
		String actualLoginTitle = driver.getTitle();
		if (actualLoginTitle.contains(expectedLoginTitle)) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		driver.findElement(By.name("username")).sendKeys("jimmy patel");
		Thread.sleep(3000);
		driver.findElement(By.name("pin")).sendKeys("manya patel");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(3000);
		
	}

}
