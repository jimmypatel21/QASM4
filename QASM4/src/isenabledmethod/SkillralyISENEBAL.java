package isenabledmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillralyISENEBAL {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://live.skillrary.com/testing-app/");
		   if (driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled()) {
			   System.out.println("False: The Eliment is Enabled");
		} 
		   else { 
		    System.out.println("True: The Element is Disebale");
	}driver.quit();
		   }
	}


