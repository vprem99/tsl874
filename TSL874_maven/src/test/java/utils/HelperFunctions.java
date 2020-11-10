package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HelperFunctions {

	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/drivers/chromedriver.exe");
		// Starts Browser
		WebDriver driver = new ChromeDriver();
		// Parent p=new Child
		return driver;
	}

	public static WebDriver startBrowser(String browserName) {
		// Taking Parameter from user for Starting Specific Browser
		browserName = browserName.toLowerCase(); // To make lower Case
		if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"src/test/resources/drivers/geckodriver.exe");

			FirefoxOptions op = new FirefoxOptions();
			op.addPreference("dom.webnotifications.enabled", false);
			if (browserName.contains("headless")) {
				op.addArguments("--headless");
			}
			WebDriver driver = new FirefoxDriver(op);
			return driver;
		} else if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src/test/resources/drivers/chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			if (browserName.contains("headless")) {
				op.addArguments("--headless");
			}
			WebDriver driver = new ChromeDriver(op);
			return driver;
		}
		else
			return null;
	}
}