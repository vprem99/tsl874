package day6;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.HelperFunctions;

public class ColorTest {
	WebDriver driver;
	@Test(description = "Checking color of find flight button")
	public void colorCheck() throws Exception{
		driver.get("http://blazedemo.com");
		WebElement E=driver.findElement(By.cssSelector("input[value='Find Flights']"));
		String backColor=E.getCssValue("background-color");
		System.out.println(backColor);  // RGB back Color
		
		String HexBackColor=Color.fromString(backColor).asHex();
		System.out.println(HexBackColor);
		//   #006dcc
		Assert.assertEquals(HexBackColor, "#006dcc","Backgroud Color did not match");
		
		TakesScreenshot snap=(TakesScreenshot)driver;  // Converting driver to TakesScreenShot type
		// Will take ScreenShot but it will be in Java's Buffer memory
		File src=snap.getScreenshotAs(OutputType.FILE);  
		FileHandler.copy(src, new File("C:\\Users\\Bhajan\\Desktop\\TSL874-AT\\blaze.jpg") );
	}

	@BeforeTest
	public void beforeTest() {
		driver = HelperFunctions.startBrowser("chrome");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
