package Getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FacebookLoginButtenColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    
		driver.get("https://www.facebook.com/");
		//get the element - login button and its coloring information
		
		String loginbackgroundcolor = driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println("loginbackgroundcolor="+loginbackgroundcolor);
		//convert the reg value into hexadecimal valiu
		
		String hexaDecimal =Color.fromString(loginbackgroundcolor).asHex();
		System.out.println(hexaDecimal);
		driver.quit();
	}

}
