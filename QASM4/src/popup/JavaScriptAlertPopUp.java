package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//UnhandledAlertException - Selenium - Unchecked Exception
		//Without Handling it we cannot Proceed further 
		driver.get("file:///Users/jaypatel/Documents/POPUP%20HTML/alertpopup.html");
		//Handling the alert Popup
		//driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
	}
}