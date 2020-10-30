package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperFunctions {
	
	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		//Starts Browser
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}