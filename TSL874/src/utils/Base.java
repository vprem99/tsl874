package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		// driver = HelperFunctions.startBrowser("chrome");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--headless");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
