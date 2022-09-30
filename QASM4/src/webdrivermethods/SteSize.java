package webdrivermethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SteSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
        Dimension targetSize = new Dimension(500,350);
		driver.manage().window().setSize(targetSize);
	
	}

}
