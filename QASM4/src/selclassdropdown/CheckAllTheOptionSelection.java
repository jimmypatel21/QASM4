package selclassdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckAllTheOptionSelection {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/signup");
			//============================================================================== for month
			
			WebElement monthDropDown = driver.findElement(By.id("month"));
			Select monthSelect = new Select(monthDropDown);
			List<WebElement> allMonthOption = monthSelect.getOptions();
			
			for (WebElement ele : allMonthOption) {
				String visibleText = ele.getText();
				monthSelect.selectByVisibleText(visibleText);
				
				if (ele.isSelected()) {
					System.out.println(visibleText+" Month is selected ");
				} else {
					System.out.println(visibleText+" Month is not selected ");
				}
			}
					//===============================================================================for date
			WebElement dateDropDown = driver.findElement(By.id("day"));
			Select dateSelect = new Select(dateDropDown);
			List<WebElement> allDateOption = dateSelect.getOptions();
			
			for (WebElement ele : allDateOption) {
				String visibaleText = ele.getText();
				dateSelect.selectByVisibleText(visibaleText);
				
				if (ele.isSelected()) {
					System.out.println(visibaleText+" Date is selected");
				} else {
					System.out.println(visibaleText+" Date is not selected");
				}
				
			}
			//===========================================================================for year
			
			WebElement yearDropDown = driver.findElement(By.id("year"));
			Select yearSelect = new Select(yearDropDown);
			List<WebElement> allYearOption =yearSelect.getOptions();
			
			for (WebElement ele : allYearOption) {
				String visibalText = ele.getText();
			    yearSelect.selectByVisibleText(visibalText);
			    
			    if (ele.isSelected()) {
					System.out.println(visibalText+" Year is selected");
				} else {
					System.out.println(visibalText+" Year is not selected");
				}
			}
					driver.quit();
				}
	}


