package switchtowindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindow1 {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    driver.get("https://nxtgenaiacademy.com/multiplewindows/");
    driver.findElement(By.name("newbrowserwindow123")).click();
    Set<String> windowIds = driver.getWindowHandles();
    
    int count=0;
    
    for (String wid : windowIds) {
    	count++;
    	
    	if (count>1) {
    	WebDriver childWindow = driver.switchTo().window(wid);
		System.out.println(childWindow.getTitle());
		System.out.println(childWindow.getCurrentUrl());
		childWindow.manage().window().maximize();
		Thread.sleep(5000);
		childWindow.close();
			
		}
		
	}
    
    driver.quit();
    
    
	}

}
