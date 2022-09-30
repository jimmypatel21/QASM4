package welement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTshirt {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/men-tshirts");
			
			driver.findElement(By.xpath("//label[text()='Tshirts']//div[@class='common-checkboxIndicator']")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
	}

}
