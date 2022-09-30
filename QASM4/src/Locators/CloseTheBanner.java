package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBanner {

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.selenium.dev/");
		    Thread.sleep(3000);
		    driver.findElement(By.className("close")).click();
		    Thread.sleep(5000);
		    driver.quit();
		    
	}

}
