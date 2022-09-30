package submit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSdmitButten {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("pateljimmy21@gmail.com");
    driver.findElement(By.id("passContainer")).sendKeys("jimmy22");
    
	}

}
