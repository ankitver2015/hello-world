package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_2 {
	
	public static WebDriver driver;
	public static boolean isBrowserOpened =false;
	
	@Test (priority=1)

	public void testyahoo() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/nayyaan/Chrome/chromedriver");
		// FirefoxDriver driver = new FirefoxDriver();
		 driver = new ChromeDriver();

		driver.get("http://www.yahoo.com/");
		Thread.sleep(5000);
		
	}
	
/*	public void closeBrowser()
	{
		driver.quit();
		isBrowserOpened= false;
		
	
	}
*/		

	}


