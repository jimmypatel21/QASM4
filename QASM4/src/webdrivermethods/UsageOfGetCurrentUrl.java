package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {


		
		public static void main(String[] args) {
			//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	    //instantiating the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		String expectedUrl ="https://demo.actitime.com/login.do";
		System.out.println("expectedURL = " + expectedUrl);
	
	//capture the URL of the loginpage
		String actualURL = driver.getCurrentUrl();
		//print the captured achual URL in the Console
		if (actualURL.contains(expectedUrl)) {
		System.out.println("pass: the login page has got displayed");
		}
		else {
			System.out.println("fail: the login page is not displayed");
		}
		}
	}

