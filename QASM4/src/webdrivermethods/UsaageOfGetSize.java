package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsaageOfGetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
	    Point position = driver.manage().window().getPosition();
	
	
	
	    int startx = position.getX();
	    System.out.println(startx);
	    
	    int starty = position.getY();
	    System.out.println(starty);
	
	   driver.quit();
	}

}
