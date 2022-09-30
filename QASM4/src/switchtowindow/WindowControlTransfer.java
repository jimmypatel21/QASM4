package switchtowindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowControlTransfer {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium");
		//driver.quit();
		
		
		
		
		
		
	}

}
