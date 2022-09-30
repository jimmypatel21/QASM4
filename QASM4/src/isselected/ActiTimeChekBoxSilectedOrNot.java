package isselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeChekBoxSilectedOrNot {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver =new ChromeDriver();
   
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    
    String actualtitle =driver.getTitle();
    String expectedTital = "actiTIME - Login";
    
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl="https://demo.actitime.com/login.do";
    
    
    
    if (actualtitle.equals(expectedTital)&& actualUrl.equals(expectedUrl)) {
		System.out.println("pass : Title and Url is present");
    	
	} else {
    System.out.println("fail : Title and Url is not Present");
	}
    
    
    
    WebElement keepLoggedInCheckBox =driver.findElement(By.id("keepLoggedInCheckBox"));
    if (keepLoggedInCheckBox.isEnabled()) {
		System.out.println("pass : keepLogInChekBoxIsEnable");
		
	} else {
		System.out.println("fail : keepLogInChekBoxIsDisebal");

	}
    
    if (keepLoggedInCheckBox.isSelected()) {
		System.out.println("fail: befro clicking ChekBox is selected");
	} else {
		System.out.println("pass: befro clicking ChekBox is not selected");

	}
    keepLoggedInCheckBox.click();
    if (keepLoggedInCheckBox.isSelected()) {
		System.out.println("pass : after clicking chekbox is selected");
	} else {
    System.out.println("fail : after clicking chekbox is not selected");
	}
    
    
    driver.quit();
    
    
    
    
	}

}
