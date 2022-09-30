package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetsize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
	    Dimension beforeMaxSize = driver.manage().window().getSize();
		int beforemaxheight = beforeMaxSize.getHeight();
		System.out.println("beforMaxWidth = " + beforemaxheight);
	    int beforeMaxWidth = beforeMaxSize.getWidth();
	    System.out.println("hightof the window after maximize = " + beforemaxheight);
	    System.out.println("width of the window after maximize = " + beforeMaxWidth);
	    
	   driver.manage().window().maximize(); 
		
	   
	    Dimension maximixedsize = driver.manage().window().getSize();
		int aftermaxheight = maximixedsize.getHeight();
		System.out.println("beforMaxWidth = " + beforemaxheight);
	    int afterMaxWidth = maximixedsize.getWidth();
	    System.out.println("hightof the window after maximize = " + aftermaxheight);
	    System.out.println("width of the window after maximize = " + afterMaxWidth);
	    
	    driver.quit();
	    
		
		
		
		
	}

}
