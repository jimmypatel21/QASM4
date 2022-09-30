package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpaceClassName {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(4000);

		driver.findElement(By.className("searchBtn pin-search-btn district-search accessibility-plugin-ac")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
