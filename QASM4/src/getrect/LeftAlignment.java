package getrect;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.get("https://demo.actitime.com/login.do");
		    Rectangle userNameRect = driver.findElement(By.id("username")).getRect();
		   int useNameHeight = userNameRect.getHeight();
		   int userNameWidth = userNameRect.getWidth();
		   int userNameStartX = userNameRect.getX();
		   System.out.println("userNameStartX =" + userNameStartX);
		   int userNameStartY = userNameRect.getY();
		   System.out.println("userNameStartY =" + userNameStartY);
		   
		   Rectangle passWordRect = driver.findElement(By.name("pwd")).getRect();
		   int passWordHeight = passWordRect.getHeight();
		   int passWordWidth = passWordRect.getWidth();
		   int pasWordStartX = passWordRect.getX();
		   System.out.println("pasWordStartX = "+ pasWordStartX);
		   int passWordStartY = passWordRect.getY();
		   System.out.println("passWordStartY = "+ passWordStartY);
		   
		   if (userNameStartX==pasWordStartX) {
			System.out.println("pass : The Left Alignament Of Username and password textfild is correct");
		} else {
			System.out.println("fail : The Left Alignament Of Username and password textfild is not correct");
		}
		   driver.quit();
		   
		   
		    
		   
		    
		    
	}

}
