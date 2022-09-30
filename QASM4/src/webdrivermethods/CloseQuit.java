package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) {
		//set the deiver executable file 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		
		driver.quit();
		//broser is not only close its totely quit 
		
	}

}
