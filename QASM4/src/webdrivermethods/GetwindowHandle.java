
package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {

	public static void main(String[] args) throws Throwable {
	//set the driver executable path
		
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    //instantiate the browser spicification
    ChromeDriver driver = new ChromeDriver();
    //pass the main URL of the applicatin 
    driver.get("http://www.flipkart.com/");
    //capture the current window ID
    String windowId = driver.getWindowHandle();
    //print the captured window ID
    System.out.println("windowId = " + windowId);
    //pause the execution of the script blindly
    Thread.sleep(3000);
    //Tarminat the session
    driver.quit();
    

	}

}
