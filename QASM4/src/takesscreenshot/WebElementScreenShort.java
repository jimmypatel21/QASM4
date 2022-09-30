package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementScreenShort {

	public static void main(String[] args) {

	LocalDateTime lsd = LocalDateTime.now();
	String timeStamp =lsd.toString().replace(':', '-');
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
	driver.get("https://www.facebook.com/");
	
	File tempfile = driver.findElement(By.className("_9vtf")).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./errorshots/"+timeStamp+"loginFoem.png");
	
	try {
		FileUtils.copyFile(tempfile, destFile);
	} catch (IOException e) {
	}
	
		driver.quit();
		
		
	}

}
