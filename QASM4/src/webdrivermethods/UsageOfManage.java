package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//for maximaize
	
	driver.manage().window().minimize();
	Thread.sleep(3000);
	//for minimize
	
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	//for fullscreen
	
	
	driver.quit();
	
	}

}
