package submit;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInButtenOfVtiger {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	    WebElement username = driver.findElement(By.id("username"));
	    username.clear();
	    username.sendKeys("admin");
	    WebElement password = driver.findElement(By.id("password"));
	    password.clear();
	    password.sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    
	    Thread.sleep(9000);
	    driver.quit();
	}

}
