package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
        driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL ="+ actualURL);
        String expectedURL = "https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("expectedURL= "+expectedURL);
		
		
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle ="+actualTitle);
        String expectedTitle = "vtiger";
        System.out.println("expectedTitle= "+ expectedTitle);
        
        if (actualURL.equals(expectedURL)&& actualTitle.equals(expectedTitle)) {
        	System.out.println("pass: The Singnup Page Has Displayed upon Verification of URL and Title");
			
		} else {
            System.out.println("Fail: The Singnup Page Has Not Displayed upon Verification of URL and Title");
		}
        
         WebElement username = driver.findElement(By.id("username"));
         username.clear();
         username.sendKeys("admin");
         
         WebElement password = driver.findElement(By.id("password"));
         password.clear();
         password.sendKeys("Test@123");
         
         driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
         
         
         try {
			wait.until(ExpectedConditions.titleIs("Dashboard"));  
			 wait.until(ExpectedConditions.urlToBe("https://demo.vtiger.com/vtigercrm/index.php"));
			 System.out.println("pass :the Dashboardpage has got upon Verification of URL and Title");
		} catch (Exception e) {
			 System.out.println("Fail :the Dashboardpage has not got upon Verification of URL and Title");
					}
        
        driver.findElement(By.xpath("//a[@role='button']")).click();
        WebElement signoutbutton = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
        if (signoutbutton.isDisplayed()) {
        	System.out.println("pass : the Dashboardpage has got upon Verification of signoutbutton ");
			
		} else {
			System.out.println("Fail : the Dashboardpage has not got upon Verification of signoutbutton ");
		}
        
        signoutbutton.click();
        driver.quit();
        
        
        
	}

}
