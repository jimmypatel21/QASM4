package selclassdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToChekTheTypeOfTheDropDown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/signup");
			WebElement monthDropdwon = driver.findElement(By.id("month"));
		    Select select = new Select(monthDropdwon);
		    if (select.isMultiple()) {
				System.out.println("This Dropdown Is mulipal() is true");
				System.out.println("the month dropdown is multy select type");
				
			} else {
				System.out.println("This Dropdown Is mulipal() is fails");
				System.out.println("the month dropdown is singal select type");
			}
		    
		    driver.quit();
	}

}
