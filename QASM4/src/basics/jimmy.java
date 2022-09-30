package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class jimmy {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");

	}

}
