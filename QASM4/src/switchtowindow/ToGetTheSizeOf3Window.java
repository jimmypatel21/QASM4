package switchtowindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToGetTheSizeOf3Window {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	WebElement button = driver.findElement(By.name("newbrowserwindow123"));
	button.click();
	button.click();
	button.click();
	Set<String> windowIDs = driver.getWindowHandles();
	int count=0;
	for (String wid : windowIDs) {
		count++;
		if (count>3) {
			WebDriver childWindow = driver.switchTo().window(wid);
			System.out.println(childWindow.manage().window().getSize().height); 
			System.out.println(childWindow.manage().window().getSize().width); 
			childWindow.close();
			
			
			
		}
		
	}
	
	
	}

}
