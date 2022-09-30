package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {

	public static void main(String[] args) {
		//set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
    //instantiating the browser specific class
	ChromeDriver driver = new ChromeDriver();
	//pass the main URL of the application
	driver.get("https://www.facebook.com/");
	
	}
	

}
