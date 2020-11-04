package day6JUnit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class ScrollingExample {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver=HelperFunctions.startBrowser();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
	@Test
	public void test() throws Exception{	
		//WebDriver,TakesScreenshot, JavascriptExecutor is Parent of ChromeDriver,FirefoxDriver		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("http://selenium.dev");
		WebElement E=driver.findElement(By.linkText("shs96c"));
		//Scroll Directly to particular Object
		js.executeScript("arguments[0].scrollIntoView();", E);  
		//Scroll Pixel By Pixel
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");		
	}
}