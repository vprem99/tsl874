package day6JUnit;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class FirstJUnitTestCase {
	static WebDriver driver;
	@BeforeClass // Pre-condition >> Starting Browser
	public static void setUpBeforeClass() throws Exception {
		driver = HelperFunctions.startBrowser();
	}
	@AfterClass // Post-Condition >> script for Closing Browser
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
	@Test
	public void test() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement E = driver.findElement(By.id("remember"));
		
		
		System.out.println(E.isDisplayed());
		System.out.println(E.isEnabled());
		System.out.println(E.isSelected());
		System.out.println(E.getAttribute("type"));
		// Assert.assertEquals(expected, actual);
		assertEquals(true, E.isDisplayed());
		assertEquals(true, E.isEnabled());
		assertEquals(true, E.isSelected());
		assertEquals("checkbox", E.getAttribute("type"));
		assertTrue(E.isSelected());
		
	}
}