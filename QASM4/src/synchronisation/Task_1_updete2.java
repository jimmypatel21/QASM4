package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_1_updete2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(5000);
		
		String actualTitle = driver.getTitle();
		String expectedTital = "actiTIME - Login";
		
		wait.until(ExpectedConditions.titleIs(expectedTital));
		
		if (actualTitle.equals(expectedTital)) {
			System.out.println("pass: Tital is present ");
		}else
			System.out.println("fail: Tital ia not Present");


		driver.findElement(By.id("username")).sendKeys("admin");
		//Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(5000);

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://demo.actitime.com/user/submit_tt.do";
		try {
			wait.until(ExpectedConditions.urlToBe(expectedURL));
			System.out.println("pass: URL is present");
		} catch (TimeoutException e) {
			System.out.println("fail: URL is not present");
		}
			
			
		
		
		String actualTital2 = driver.getTitle();
		String expectedTital2 = "actiTIME - Enter Time-Track";
		if (actualTital2.equals(expectedTital2)) {
			System.out.println("pass: Tital2 is present ");
		} else {
			System.out.println("fail: Tital2 is not present ");
		}
		boolean logOutLink = driver.findElement(By.id("logoutLink")).isDisplayed();
		if (logOutLink) {
			System.out.println("pass:LogOut Butten is Present");
		} else {
			System.out.println("fail:LogOut Butten is not Present");
		}
		 WebElement logOutButton = driver.findElement(By.id("logoutLink"));
		
		
		//driver.findElement(By.id("logoutLink")).click();
		//Thread.sleep(10000);
		
		driver.quit();
	}

}
