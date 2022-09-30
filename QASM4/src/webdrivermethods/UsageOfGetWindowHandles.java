package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {

	public static void main(String[] args) throws Throwable {
    
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    
    ChromeDriver driver = new ChromeDriver();
    
    driver .get("http://leafground.com/pages/Window.html");
    WebElement OpenMultipleWindows =  driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
	Thread.sleep(1000);
	OpenMultipleWindows.click();
	Thread.sleep(1000);
	OpenMultipleWindows.click();
	Thread.sleep(1000);
	OpenMultipleWindows.click();
	Thread.sleep(1000);
	 java.util.Set<String> allwindowIds = driver.getWindowHandles();
	//System.out.println(allwindowIds);
	System.out.println("size of the windows = " + allwindowIds.size());
	for (String wid : allwindowIds)
		System.out.println(wid);
	
	driver.quit();
	}

	
	

}
