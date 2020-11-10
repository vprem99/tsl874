package day10;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginPage;

public class GridExample {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage(driver);
		lp.doLogin("admin", "admin123");
		/*
		 * 1000 TC > Chrome of Windows 1000 tc > Chrome of Linux 1000 tc > Chrome of MAC
		 * For various Browser-OS combination
		 */
	}

	@BeforeTest
	@Parameters({ "browser", "node" })
	public void beforeTest(String browser, String node) throws Exception {
		DesiredCapabilities dc=null;// temp Initilization
		// This for Telling which browser Need to be run on remote system
		if (browser.equalsIgnoreCase("chrome")) {
			dc = DesiredCapabilities.chrome();
		} else if (browser.equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
		}

		dc.setPlatform(Platform.LINUX); // For telling type of platform node is using
		// url of node cap
		driver = new RemoteWebDriver(new URL(node), dc);
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}