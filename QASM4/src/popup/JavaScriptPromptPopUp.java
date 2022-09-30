package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPromptPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//UnhandledAlertException - Selenium - Unchecked Exception
		//Without Handling it we cannot Proceed further 
		driver.get("file:///Users/jaypatel/Documents/POPUP%20HTML/promptpopup.html");
		//Handling the prompt Popup
		//Enter the user information asked for
		driver.switchTo().alert().sendKeys("99");
		//Click On ok on popup by using accept
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
	}
}