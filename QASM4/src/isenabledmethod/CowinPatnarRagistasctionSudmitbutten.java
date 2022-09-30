package isenabledmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinPatnarRagistasctionSudmitbutten {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitbutton = driver.findElement(By.name("submit"));
		
		
		if (submitbutton.isEnabled()) {
			System.out.println("fail: The Button Enable");
			
		} else {
        System.out.println("pass: The Button Disabled");
		}
		driver.quit();
	}

}
