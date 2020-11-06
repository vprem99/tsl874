package codility;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Solution extends WebDriverTestCase {

	@Test
	public void test() {
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get("https://www.shoppersstop.com");
		webDriver.findElement(By.xpath("//input[@type='submit']")).click();
		boolean x=webDriver.findElement(By.
							xpath("//h1[contains(text(),'No Results Found')]")).isDisplayed();	
		assertTrue(x);
		assertEquals(true, x);
	}
}