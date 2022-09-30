package getattributemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTTTFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualToolTipText=driver.findElement(By.className("_2xm1JU")).getAttribute("title");
		System.out.println("actualToolTipText ="+actualToolTipText);
		String ExpectedTooTipText="Flipkart";
		if (actualToolTipText.equals(ExpectedTooTipText)) {
			System.out.println("Pass:Tool tip text is Verifiend and found corrcet");
		} else {
			System.out.println("fail:Tool tip text is Verifiend and found incorrcet");
		}
		driver.quit();
		
	}

}
