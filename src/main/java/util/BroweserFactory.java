package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBroweser() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		// return the driver to the test class
		driver.get("http://techfios.com/test/billing/?ng=login/");
		return driver;
		
	}
}
