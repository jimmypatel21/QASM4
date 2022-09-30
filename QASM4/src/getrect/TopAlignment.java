package getrect;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/signin");
    Thread.sleep(3000);
    
    Rectangle emailRect = driver.findElement(By.name("email")).getRect();
    //int emailHeight = emailRect.getHeight();
    //int emailWidth = emailRect.getWidth();
    //int emailStartX = emailRect.getX();
    //System.out.println("emailStartX="+ emailStartX);
    int emailStartY = emailRect.getY();
    System.out.println("emailStartY = "+ emailStartY);
    
    Rectangle passwordRect = driver.findElement(By.name("pass")).getRect();
    //int passwordHight = passwordRect.getHeight();
    //int psaawordWidth = passwordRect.getWidth();
    //int passwordStartX = passwordRect.getX();
    //System.out.println("passwordStartX=" + passwordStartX);
    int passwordStartY = passwordRect.getY();
    System.out.println("passwordStartY = " + passwordStartY);
    
    
    if (emailStartY==passwordStartY) {
		System.out.println("pass: the top Alignment of Emailtextfeeld is same");
	} else {
        System.out.println("fail: the top Alignment of Emailtextfeeld is not same");
	}
    
    driver.quit();
}

}
