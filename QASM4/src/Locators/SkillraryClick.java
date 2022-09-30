package Locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryClick {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver  driver  = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://skillrary.com/");
    Thread.sleep(3000);
    driver.findElement(By.linkText("INR")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("SGD")).click();
    Thread.sleep(3000);
    driver.quit();
	}

}
