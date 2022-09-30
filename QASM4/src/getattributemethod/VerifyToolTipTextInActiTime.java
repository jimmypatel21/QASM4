package getattributemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTipTextInActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		String actualToolTipText = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		String expectedToolTipText="Do not select if this computer is shared";
		if(actualToolTipText.equals(expectedToolTipText))
			System.out.println("Pass:Tool tip text is Verifiend and found corrcet");

		else {
			System.out.println("fail:Tool tip text is Verifiend and found incorrcet");

		}
	 driver.quit();

	}}
