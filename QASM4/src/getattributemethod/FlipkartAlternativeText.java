package getattributemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAlternativeText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/");
		WebElement attribute = driver.findElement(By.className("_2xm1JU"));
		System.out.println("width :"+attribute.getAttribute("width"));
		System.out.println("src : "+attribute.getAttribute("src"));
		System.out.println("alternate name : "+attribute.getAttribute("alt"));
		System.out.println("tool tip title : "+attribute.getAttribute("title"));
		//driver.quit();
		
	}

}
