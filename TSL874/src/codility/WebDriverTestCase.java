package codility;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class WebDriverTestCase {
	static WebDriver webDriver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		webDriver = HelperFunctions.startBrowser("chrome");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		webDriver.quit();
	}
}