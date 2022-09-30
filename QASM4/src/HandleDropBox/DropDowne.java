package HandleDropBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowne {

	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.facebook.com/signup");
	       Select Select = new Select(driver.findElement(By.id("month")));
	       Select.selectByVisibleText("Jun");
           
	}

}
