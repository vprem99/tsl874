package in.lti.day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.HelperFunctions;

public class NewTest {
	WebDriver driver;

	@Test(priority = 1)
	public void f1() {
		//local WebDriver is Initialized
		WebDriver driver = HelperFunctions.startBrowser("chrome");
		driver.get("http://www.google.com");
	}

	@Test(priority = 2)
	public void f2() {
		System.out.println(driver);
		driver.get("http://www.bing.com");
	}
}
