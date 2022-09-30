package isselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedErrorWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Use isSelected() on the wrong element to see the unpredicted behaviour
		if(driver.findElement(By.id("email")).isSelected()){
			System.out.println("isSelected() is returning True");
		}else {
			//Executing else block i.e. False even though by default email text field has got selected
			System.out.println("isSelected() is returning False");
		}
		driver.quit();
		
	}
	}
	

