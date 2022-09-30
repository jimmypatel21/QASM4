package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrdoClickCareers {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.drdo.gov.in/");
    Thread.sleep(3000);
    driver.findElement(By.linkText("Careers")).click();
    Thread.sleep(3000);
    System.out.println("URL : "+ driver.getCurrentUrl());
    
    System.out.println("Title :"+ driver.getTitle());
    driver.quit();
	}

}
