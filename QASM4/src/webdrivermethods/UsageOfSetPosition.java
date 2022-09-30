package webdrivermethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition{

	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		Dimension targetsize = new Dimension(700,420);
		 driver.manage().window().setSize(targetsize);
		 Thread.sleep(5000);
		 Point targetPoint = new Point(100,500);
		 driver.manage().window().setPosition(targetPoint);
		 Thread.sleep(5000);
		 driver.quit();
		 
		
		
		
		
		
		
		
		
		}

}
