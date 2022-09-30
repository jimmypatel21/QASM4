package basics;

import org.openqa.selenium.safari.SafariDriver;

public class safaribrowser {

	public static void main(String[] args) 
	{
		 
		
		 SafariDriver driver = new SafariDriver();
		
		driver.get("http://www.google.com");
		
		
		System.out.println(driver.getTitle());
		
	}

}
