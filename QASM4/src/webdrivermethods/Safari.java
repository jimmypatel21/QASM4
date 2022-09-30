package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Safari {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		driver.quit();
		
		}

}
