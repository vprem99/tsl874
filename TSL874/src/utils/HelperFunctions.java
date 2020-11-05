package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HelperFunctions {

	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		// Starts Browser
		WebDriver driver = new ChromeDriver();
		//Parent p=new Child
		return driver;
	}

	public static WebDriver startBrowser(String browserName) {
		// Taking Parameter from user for Starting Specific Browser
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Bhajan\\Desktop\\SelJars\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			
			FirefoxOptions op=new FirefoxOptions();
			op.addPreference("dom.webnotifications.enabled", false);
			WebDriver driver = new FirefoxDriver(op);
			return driver;
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(op);
			return driver;
		} else
			return null;
	}
}