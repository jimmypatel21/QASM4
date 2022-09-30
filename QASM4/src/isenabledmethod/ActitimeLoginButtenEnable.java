package isenabledmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginButtenEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		if(loginButton.isEnabled())
		{
        System.out.println("Pass : the button is enabled");
			
		} else {
        System.out.println("Fail : The Button Disabled");
		}
		driver.quit();

		}
		
	}


