package takesscreenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenShort {

	public static void main(String[] args) throws Throwable {
		LocalDateTime lsd = LocalDateTime.now();
		String timeStamp = lsd.toString().replace(':', '-');

    
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/");
	//DownCast the webdriver type object into takesscreenshot type
    //Driver object getScreenShotAs() is their but through autoupcasting it is not Possible
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	//call the getScreenShotAs() - returns object/nothing - means not even void
		//Call the OutputType - interface
		//Call Static final variable of userdefined type i.e FILE/BASE64/BYTE
		//FILE - File
		//BASE64 - String
		//BYTE - Byte[]
	File facebookloginpage = ts.getScreenshotAs(OutputType.FILE);
	 //Printing the absolute path of the captured screenm Shot
	
	System.out.println("My Absolute Path: "+facebookloginpage.getAbsolutePath());
	 //Create the file object by specifying permanent location with in the scope of your project
	
	File destfile = new File("./errorshots/facebookloginpage.png");
	//Call FileUtils Concrete class of Common-io and Static method called copyFile()
    //CopyFile(File srcFile, File destFile)
	
	FileUtils.copyFile(facebookloginpage, destfile);
	//refresh and check in the project to see the screenshot
	
	//Thread.sleep(30000);
	driver.quit();
	
	}

}
