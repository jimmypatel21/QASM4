package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=12746747786343208838&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062014&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA64GRBhCZARIsAHOLriLPs2_sEtqCvjx1u1bG4H26qMLZc0T7e-b8BfWcLAsJS6hufH6kmN0aAj6nEALw_wcB");

		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13 mini");
		//WebElement twotabsearchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		//twotabsearchtextbox.sendKeys("Iphone 13 mini");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("Apple iPhone 13 Mini (128GB)")).click();
		Thread.sleep(9000);
		
		
		driver.quit();
	
		
		
		
		
		
		
		
		
		
	}
		

}
