package selclassdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDateOfBath {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/signup");
			
			
			WebElement monthDropdown = driver.findElement(By.id("month"));
			Select monthSelect = new Select(monthDropdown);
		    monthSelect.selectByVisibleText("Jun");
		    
		    
		    WebElement dateDropDown = driver.findElement(By.id("day"));
		    Select dateSelect = new Select(dateDropDown);
		    dateSelect.selectByVisibleText("21");
		    
		    WebElement yearDropDown = driver.findElement(By.id("year"));
		    Select yerSelect = new Select(yearDropDown);
		    yerSelect.selectByVisibleText("1989");
		    Thread.sleep(3000);
		    
		    
		    
		    driver.quit();
	}

}
