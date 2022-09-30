package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chektital {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");	
		WebDriver driver = new ChromeDriver();//launch Chrome
		driver.get("http://www.google.com");//enter URL
		
		String title = driver.getTitle();//get title
		
		System.out.println(title);
		
		if(title.equals("Google"))
		{
		System.out.println("corrent title");
		}
		else {
			System.out.println("in-correct");
			
		}
		System.out.println(driver.getCurrentUrl());//for current URL
		//System.out.println(driver.getPageSource());//for PageSource
		driver.quit();
		
	}

}
