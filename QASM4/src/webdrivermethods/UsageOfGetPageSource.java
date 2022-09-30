package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {

	public static void main(String[] args) {
		// set the driver executable file 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		//Instantiate the browser specific class 
		ChromeDriver driver = new ChromeDriver();
		//pass the main URL of the application 
		driver.get("http://demo.actitime.com/");
		String expectedText = "Please identify yourself";
		System.out.println("expectedText ="+ expectedText);
		String actualpagesource = driver.getPageSource();
		//System.out.println(actualpagesource");
		if (actualpagesource.contains(expectedText)) {
			System.out.println("pass : the text is availebal");
		}
		else {
			System.out.println("fail : the text is not availebal");
		}
				
		

	}

}
