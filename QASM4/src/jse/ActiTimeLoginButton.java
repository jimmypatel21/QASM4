package jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"loginButton\").click();");
		
		long actiHight = (long) jse.executeScript("return document.body.scrollHeight");
		System.out.println("actiHight =" +actiHight);
		
		long actiWidth = (long) jse.executeScript("return document.body.scrollWidth");
		System.out.println("actiWidth =" +actiWidth);
		
		
		driver.quit();
		
		
	}

}
