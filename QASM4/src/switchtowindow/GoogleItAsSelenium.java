package switchtowindow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleItAsSelenium {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium");
		 List<WebElement> seleniumAutosuggestions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		System.out.println("Total seleniumAutosuggestions" + seleniumAutosuggestions);
		for (WebElement ele : seleniumAutosuggestions) {
			System.out.println(ele.getText());
			if (ele.getText().contains("webdriver")) {
				
				ele.click();
				break;
				
				
			}
			
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
