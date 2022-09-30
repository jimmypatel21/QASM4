package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {

	public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.instagrm.com");
	
	
	driver.navigate().to("https://www.instagram.com/accounts/login/");
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
	
		
	 
		
		
		
		
		
		
	}

}
