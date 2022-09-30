package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToURLUrl {

	public static void main(String[] args) throws MalformedURLException, Throwable {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.dassault-aviation.com/en/");
	 
	URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
	URL defensepage = new URL(mainUrl,"defense");
	URL civilAviationpage = new URL(mainUrl,"civil");
	URL spacepage = new URL(mainUrl, "space");
	Thread.sleep(3000);
	driver.navigate().to(spacepage);
	Thread.sleep(3000);
	driver.navigate().to(defensepage);
	Thread.sleep(3000);
	driver.navigate().to(civilAviationpage);
	Thread.sleep(3000);
	driver.quit();
	
	 
	}

}
