package isenabledmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledWrongScenario {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
    driver.findElement(By.xpath("//td[(text())=' Oracle Solaris (SPARC systems, 64-bit)']/..//a[text()='ZIP']")).click();
    //
    if (driver.findElement(By.xpath("//a[text()='Download SOLARIS.SPARC64_193000_db_home.zip']")).isEnabled()) {
    	System.out.println("true");
		
	}else {
    System.out.println("false");
	}
driver.quit();
}
}