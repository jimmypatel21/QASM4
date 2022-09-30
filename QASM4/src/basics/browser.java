package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/java-tutorial");
	
	
	driver.quit();
	}

}
