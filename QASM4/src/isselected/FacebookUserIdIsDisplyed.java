package isselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUserIdIsDisplyed {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    
    WebElement UserNameTextFild =driver.findElement(By.id("email"));
    WebElement passWordTextFild =driver.findElement(By.id("pass"));
    WebElement logInButten =driver.findElement(By.name("login"));
    
    if (UserNameTextFild.isDisplayed()) {
		System.out.println("pass : UserNameTextFild Is Displayed");
	} else {
       System.out.println("fail : UserNameTextFild Is not Displayed");
	}
    
    
    
    if (passWordTextFild.isDisplayed()) {
		System.out.println("pass : passwordTextFild Is Displayed");
	} else {
    System.out.println("fail : passwordTextFild Is not Displayed");
	}
    
    
    
    if (logInButten.isDisplayed()) {
		System.out.println("Pass : Loginbutton Is Displayed");
	} else {
		System.out.println("fail : Loginbutton Is not Displayed");
		

	}
    
    driver.quit();
	}

}
