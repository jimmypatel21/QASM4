package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");//to set the executable path
		WebDriver driver= new ChromeDriver();//instantiating browser specific class
		driver.manage().window().maximize();//maximizing the browser

		driver.get("https://www.flipkart.com/");
		URL mainUrl = new URL("https://www.flipkart.com/");
		URL contactUs = new URL(mainUrl, "/helpcentre?otracker=undefined_footer_navlinks");
		URL aboutUs = new URL(mainUrl, "/about-us?otracker=undefined_footer_navlinks");
		URL careers = new URL(mainUrl, "https://www.flipkartcareers.com/?otracker=undefined_footer_navlinks");
		URL flipkartstories = new URL(mainUrl, "http://stories.flipkart.com/?otracker=undefined_footer_navlinks");
		URL press = new URL(mainUrl, "/s/press?otracker=undefined_footer_navlinks");
		URL flipkart = new URL(mainUrl, "https://www.flipkartwholesale.com/?otracker=undefined_footer_navlinks");
		URL corporateInformation = new URL(mainUrl, "/corporate-information");

		URL payment = new URL(mainUrl, "/pages/payments");
		URL shipping = new URL(mainUrl, "/pages/shipping");
		URL cancellation = new URL(mainUrl, "/helpcentre?catalog=55c9c6edb000002e002c1701&view=CATALOG");
		URL faq = new URL(mainUrl, "/helpcentre?catalog=55c9c8e2b0000023002c1702&view=CATALOG");
		URL report = new URL(mainUrl, "https://seller.flipkart.com/fiv?otracker=undefined_footer_navlinks");

		URL returnPolicy = new URL(mainUrl, "href=\"/corporate-information\"");
		URL termsOfUse = new URL(mainUrl, "/pages/terms?otracker=undefined_footer_navlinks");
		URL security = new URL(mainUrl, "/pages/paymentsecurity?otracker=undefined_footer_navlinks");
		URL privacy = new URL(mainUrl, "/pages/privacypolicy?otracker=undefined_footer_navlinks");
		URL sitemap = new URL(mainUrl, "/sitemap?otracker=undefined_footer_navlinks");
		URL eprCompliance = new URL(mainUrl, "/pages/ewaste-compliance-tnc?otracker=undefined_footer_navlinks");

		URL facebook = new URL(mainUrl, "https://www.facebook.com/flipkart");
		URL twitter = new URL(mainUrl, "https://www.twitter.com/flipkart");
		URL youtube = new URL(mainUrl, "https://www.youtube.com/flipkart");


		//ABOUT
		driver.navigate().to(contactUs);
		Thread.sleep(3000);
		driver.navigate().to(aboutUs);
		Thread.sleep(3000);
		driver.navigate().to(careers);
		Thread.sleep(3000);
		driver.navigate().to(flipkart);
		Thread.sleep(3000);
		driver.navigate().to(press);
		Thread.sleep(3000);
		driver.navigate().to(flipkartstories);
		Thread.sleep(3000);
		driver.navigate().to(corporateInformation);
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		//HELP
		driver.navigate().to(payment);
		Thread.sleep(3000);
		driver.navigate().to(shipping);
		Thread.sleep(3000);
		driver.navigate().to(cancellation);
		Thread.sleep(3000);
		driver.navigate().to(faq);
		Thread.sleep(3000);
		driver.navigate().to(report);
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		//POLICY
		driver.navigate().to(returnPolicy);
		Thread.sleep(3000);
		driver.navigate().to(termsOfUse);
		Thread.sleep(3000);
		driver.navigate().to(security);
		Thread.sleep(3000);
		driver.navigate().to(privacy);
		Thread.sleep(3000);
		driver.navigate().to(sitemap);
		Thread.sleep(3000);
		driver.navigate().to(eprCompliance);
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		//SOCIAL
		driver.navigate().to(facebook);
		Thread.sleep(3000);
		driver.navigate().to(twitter);
		Thread.sleep(3000);
		driver.navigate().to(youtube);
		Thread.sleep(3000);


		//terminate the browser specific class
		driver.quit();









		}

		}

