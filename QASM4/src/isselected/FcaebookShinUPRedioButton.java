package isselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FcaebookShinUPRedioButton {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
		    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		    Thread.sleep(5000);
		    WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
		    maleradiobutton.click();
		    if (maleradiobutton.isSelected()) {
		    	System.out.println("Is Selected ReturingTrue");
		    	System.out.println("positive: testing selection after click ");
				System.out.println("True The Male RadioButton is Selected");
			}
		    else {
		    	System.out.println("Is Selected Returing false");
		    	System.out.println("positive testing selection after click ");
				System.out.println("True The Male RadioButton is Selected");
			} 
		    driver.quit();
	}

}
