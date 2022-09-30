package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitClildAndPerents {

	public static void main(String[] args)throws Throwable {
		//set the deiver executable file 
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
				//instantiate the browser specific class 
				ChromeDriver driver = new ChromeDriver();
				//pass the main URL of the application
				driver.get("http://leafground.com/pages/Window.html");
				driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
				//close the current browser windos
				Thread.sleep(3000);
		         driver.quit();
				//broser is not only close its totely quit 
				
			}

		}