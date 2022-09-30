package selclassdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_01 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/signup");
	WebElement monthDropdwon = driver.findElement(By.id("month"));
    Select select = new Select(monthDropdwon);
    List<WebElement> options = select.getOptions();
    System.out.println("Total Number Of Options in the dropodown is =" + options.size());
    
    for (WebElement opt : options) {
		System.out.println("Option = "+ opt.getText());
	}
    driver.quit();
		
		
		
		
	}

}
