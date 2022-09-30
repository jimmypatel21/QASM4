package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googel_facebook {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		//Validation of the Current URL
		Thread.sleep(4000);
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://www.facebook.com/login/";

		if(actualCurrentUrl.contains(expectedCurrentUrl)) {
			System.out.println("PASS: Current URL is correct");
		}
		else
		{
			System.out.println("FAIL: Current URL is NOT correct");
		}

		//Validation of the PAGE TITLE
		String actualLoginTitle = driver.getTitle();
		String expectedLoginTitle = "Log in to Facebook";

		if (actualLoginTitle.contains(expectedLoginTitle)) {
			System.out.println("PASS: Page title is shown correctly");

		}
		else {
			System.out.println("FAIL: Page title is NOT shown correctly");
		}


		driver.quit();











	}

}
