package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		WebElement firstAnchorTag = driver.findElement(By.tagName("a"));
		//firstAnchorTag.click();
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		int countOfAnchorTags =  anchorTags.size();
		System.out.println("countOfAnchorTags=" + countOfAnchorTags);
		driver.quit();
		
		
		

		
	}

}
