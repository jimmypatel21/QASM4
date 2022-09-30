package selclassdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectTheSeptMonth {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/signup");
			WebElement monthDropdwon = driver.findElement(By.id("month"));
		    Select select = new Select(monthDropdwon);
		    
		    select.selectByVisibleText("Sep");
		    if (select.getFirstSelectedOption().isSelected()) {
				System.out.println("sep month is selected");
			} else {
				System.out.println("sep month is not selected");
			}
		    select.selectByValue("12");
		    if (select.getFirstSelectedOption().isSelected()) {
				System.out.println("dec month is selected");
			} else {
				System.out.println("dec month is not selected");
			}
		    
		    select.selectByIndex(5);
		    if (select.getFirstSelectedOption().isSelected()) {
				System.out.println("jun month is selected");
			} else {
				System.out.println("jun month is not selected");
			}
		    driver.quit();
		    
	}
	

}
