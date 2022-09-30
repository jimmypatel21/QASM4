package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
    
    WebElement userName = driver.findElement(By.id("username"));
    userName.clear();
    userName.sendKeys("jimmy");
    userName.sendKeys(Keys.CONTROL+"A");
    Thread.sleep(5000);
    userName.sendKeys(Keys.CONTROL+"X");
    Thread.sleep(5000);
    userName.sendKeys(Keys.CONTROL+"v");
    Thread.sleep(5000);
    
    WebElement password =driver.findElement(By.id("password"));
    password.clear();
    Thread.sleep(5000);
    password.sendKeys(Keys.CONTROL+"v");
    Thread.sleep(5000);
    driver.quit();
    
    
    
    
    
    
    
    
    
    
    
	}

}
