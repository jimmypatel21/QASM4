package popup;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LICpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.linkText("Agents Portal")).click();
		driver.switchTo().alert().accept();


	}

}
