package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
			WebDriver driver = new FirefoxDriver();
			return driver;
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
		} else
			return null;
	}
}