package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConfirmationPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//UnhandledAlertException - Selenium - Unchecked Exception
		//Without Handling it we cannot Proceed further 
		driver.get("file:///Users/jaypatel/Documents/POPUP%20HTML/confirmation%20popup.html");
		//Handling the alert Popup
		//To Click on Ok
		String alertPopupText = driver.switchTo().alert().getText();
		System.out.println(alertPopupText);
		//driver.switchTo().alert().accept();
		//To Click on Cancel
		driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();
		
	}
}