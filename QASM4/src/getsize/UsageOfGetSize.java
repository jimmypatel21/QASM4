package getsize;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    
    Dimension userNameSize =driver.findElement(By.id("username")).getSize();
    
    int userNameHeight =userNameSize.getHeight();
    System.out.println("userNameHeight=" + userNameHeight);
    
    int userNameWidth=userNameSize.getWidth();
    System.out.println("userNameWidth= " + userNameWidth);
    
    Dimension passwordSize = driver.findElement(By.name("pwd")).getSize();
    
   int  passwordHeight =passwordSize.getHeight();
   System.out.println("passwordSize= "+ passwordSize);
   
   int passWordWidth =passwordSize.getWidth();
    System.out.println("passWordWidth= "+ passWordWidth);
    
    if (userNameSize.equals(passwordSize)) {
		System.out.println("Pass : Compared By Dimension Object Driectly");
	} else {
		System.out.println("Fail : Compared By Dimension Object Driectly");
	}
    if ((userNameHeight==passwordHeight)&&(userNameWidth==passWordWidth) )  {
		System.out.println("pass: the usreName and password Dimension is Same");
	} else {
		System.out.println("fail: the usreName and password Dimension is not Same");
	}
    driver.quit();
    
    
	}
	
	
	
}
