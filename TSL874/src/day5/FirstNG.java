package day5;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstNG {
	WebDriver driver;	 

	@Test(priority=1,description="Verifying title of Bing.com") // Test Script will be here
	public void bingTest() {
		driver.get("http://bing.com");
		String actualTitle=driver.getTitle();  // It returns in String format
						//  Actual       Expected
		Assert.assertEquals(actualTitle, "Bing","Title did not match");
	}
	
	@Test(priority=2,dependsOnMethods="bingTest",description="Verifying search on Bing.com") // Test Script will be here
	public void appleSearchTest() throws Exception {
		
		driver.findElement(By.name("q")).sendKeys("apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "apple - Bing","Title did not match");
	}

	@BeforeTest // pre-conditions
	public void beforeTest() {
		//driver = HelperFunctions.startBrowser();
	/*	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		//Starts Browser
		driver = new FirefoxDriver();
	*/		
		driver=HelperFunctions.startBrowser("FireFOX");
	}

	@AfterTest // post-condition
	public void afterTest() throws Exception{
		Thread.sleep(3000);
		driver.quit();  
	}
}