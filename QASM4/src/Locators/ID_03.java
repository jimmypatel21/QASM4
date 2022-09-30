package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_03 {

	        public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		    Thread.sleep(3000);
		    driver.findElement(By.id("password")).clear();
		    Thread.sleep(3000);
		    driver.quit();
		    
	}

}
