package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = HelperFunctions.startBrowser("chrome");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}

}
