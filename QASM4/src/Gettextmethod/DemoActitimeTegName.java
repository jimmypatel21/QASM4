package Gettextmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitimeTegName {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
			WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://demo.actitime.com/login.do");
			String actualusernameTagname =driver.findElement(By.id("username")).getTagName();
			System.out.println("actualusertagname ="+ actualusernameTagname);
			if (actualusernameTagname.equals("input")) {
				System.out.println("pass: The username tagnamr is correct");
			
				
			} else {
				System.out.println("fail: The username tegname is incorrect");

			}
			String actualpasswordTexfild=driver.findElement(By.name("pwd")).getTagName();
			System.out.println("actualpasswordTexfild="+ actualpasswordTexfild);
			if (actualpasswordTexfild.equals("input")) {
				System.out.println("pass:The Password tagnameis correct");
				
			} else {
              System.out.println("fail: The Password tagname is incorrect");
              
			}
			String actualloginbutten=driver.findElement(By.id("loginButton")).getTagName();
			System.out.println("actualloginbutten=" +actualloginbutten);
			if (actualloginbutten.equals("a")) {
				System.out.println("pass : The loginbutten tagname is correct");
				
			} else {
				
            System.out.println(("fail:the loginbutten tagename is incorrect"));
			}
			driver.quit();
	}

}
