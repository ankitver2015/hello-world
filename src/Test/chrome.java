package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class chrome {

	@Test

	public void testbbc() {

		System.setProperty("webdriver.chrome.driver", "/Users/nayyaan/Chrome/chromedriver");

		WebDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.bbc.com/");
		driver.close();
		driver.quit();

	}
}
