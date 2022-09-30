package jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageHeightAndWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		long webpageHeight = (long)jse.executeScript("return document.body.scrollHeight");
		long webpageWidth = (long)jse.executeScript("return document.body.scrollWidth");
		System.out.println(webpageHeight+webpageWidth);
		System.out.println("webpageHeight = " +webpageHeight);
		System.out.println("webpageWidth = " +webpageWidth);
		driver.quit();
		
		
	}

}
