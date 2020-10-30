package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class BingExample {

	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		Actions ac=new Actions(driver);
		
		driver.get("http://bing.com");
		
		WebElement search=driver.findElement(By.name("q"));

		ac.keyDown(Keys.SHIFT)     // for pressing shift key by selenium
		  .sendKeys(search,"lti")
		  .doubleClick(search)      // for selecting
		  .contextClick(search)    // for right click
		  .perform();
	}
}