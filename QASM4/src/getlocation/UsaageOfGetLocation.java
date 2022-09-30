package getlocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsaageOfGetLocation {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.get("https://demo.actitime.com/login.do");
		    
		    
		  Point userNameLoction = driver.findElement(By.id("username")).getLocation();
		  System.out.println("userNameLoction = "+ userNameLoction);
		  int userNameStartX=userNameLoction.getX();
		  System.out.println("userNameStartX ="+ userNameStartX);
		  int userNameStartY =userNameLoction.getY();
		  System.out.println("userNameStartY = "+ userNameStartY);
		  
		  driver.findElement(By.name("pwd")).getLocation();
		  driver.quit();
		  
		  
		  
		  
		  
		  
	}

}
