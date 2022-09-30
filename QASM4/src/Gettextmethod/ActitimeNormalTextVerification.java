package Gettextmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeNormalTextVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demo.actitime.com/login.do");
		String actualNormalText = driver.findElement(By.id("headerContainer")).getText();
		System.out.println("actualNormalHeader Text="+actualNormalText);
		String expectedNormalText ="Please identify yourself";
		System.out.println("expected normal text="+expectedNormalText);
		if (actualNormalText.equals(expectedNormalText)) {
			System.out.println("Pass:normal text is Verifiend and found corrcet");
		} else {
			System.out.println("fail:normal text is Verifiend and found incorrcet");
		}
		driver.quit();
	}

}
