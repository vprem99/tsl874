package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
	public Properties prop;

	@BeforeTest
	public void beforeTest() throws Exception {
		prop = new Properties(); // making object of Property file reperesents we going to worl with property file.
		prop.load(new FileInputStream("src/test/resources/settingsAndOR.property"));
		driver = HelperFunctions.startBrowser(prop.getProperty("browserName"));
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
