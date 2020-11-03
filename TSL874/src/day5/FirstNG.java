package day5;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstNG {
	WebDriver driver; // Declare Variable at Class Level

	@Test(priority=1,description="Verifying title of Bing.com") // Test Script will be here
	public void bingTest() {
		driver.get("http://bing.com");
		String actualTitle=driver.getTitle();  // It returns in String format
						//  Actual       Expected
		Assert.assertEquals(actualTitle, "Bing India","Title did not match");
	}
	
	@Test(priority=2,dependsOnMethods="bingTest",description="Verifying search on Bing.com") // Test Script will be here
	public void appleSearchTest() {
		
		driver.findElement(By.name("q")).sendKeys("apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "apple - Bing","Title did not match");
	}

	@BeforeTest // pre-conditions
	public void beforeTest() {
		driver = HelperFunctions.startBrowser();
	}

	@AfterTest // post-condition
	public void afterTest() throws Exception{
		Thread.sleep(3000);
		driver.quit();  
	}
}