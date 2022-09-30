package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
     
	   public static void main(String[] args) {
			//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	    //instantiating the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		
		String expectedTitle = "actiTIME - Login";
		System.out.println("expectedTitle = " + expectedTitle);
        //capture the title of the webpage 
		
		
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle = " + actualTitle);
		//validate the login page by it's title 
		
		
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("pass: login page is displayed");
		
		}
		else {
			System.out.println("fail: login page is not displayed");
		}
		
		}
		

	

	}


