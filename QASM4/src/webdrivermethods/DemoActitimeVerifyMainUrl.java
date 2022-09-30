package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitimeVerifyMainUrl {

	public static void main(String[] args) {
	//set the driver executable path
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http://demo.actitime.com");
		
	}

}
