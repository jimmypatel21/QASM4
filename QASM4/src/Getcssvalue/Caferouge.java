package Getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Caferouge {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caferouge.com/");
		String booknowcolour =driver.findElement(By.xpath("//a[@href='/#booking']")).getCssValue("background-color");
		System.out.println("Book Now rgb code="+booknowcolour);
		String findoutmorecolour = driver.findElement(By.id("home-about-find-out-more")).getCssValue("background-color");
		System.out.println("findout more rgb color="+findoutmorecolour);
		String hexaDecimalFind = Color.fromString(findoutmorecolour).asHex();
		System.out.println("hexaDecimal of find out more button="+hexaDecimalFind);
		String hexaDecimalBook = Color.fromString(booknowcolour).asHex();
		System.out.println("hexa decimal of book now button="+hexaDecimalBook);
		if (hexaDecimalFind.equals(hexaDecimalBook)) {
		System.out.println("pass: both bookknow and findoutmore color is same");	
	
		} else {
			System.out.println("fail: both bookknow and findoutmore color is not same");

		}
		
	driver.quit();
	}

}
