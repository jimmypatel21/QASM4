package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbChangeLang {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
   
     WebDriver driver = new ChromeDriver();
     driver.get("https://ml-in.facebook.com/");
     Thread.sleep(3000);
     driver.findElement(By.linkText("English (UK)")).click();
     Thread.sleep(3000);
     
     driver.quit();
     
	}

}