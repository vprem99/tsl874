package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.HelperFunctions;

public class BingExample {

	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		Actions ac=new Actions(driver);
		
		driver.get("http://bing.com");
		
		WebElement search=driver.findElement(By.name("q"));

		Action a=ac.keyDown(Keys.SHIFT)     // for pressing shift key by selenium
		  .sendKeys(search,"lti")
		  .doubleClick(search)      // for selecting
		  .contextClick(search)    // for right click
		  .build();
		
		a.perform();
		
		//driver.getTitle();
		
		Select s=new Select(search);
		s.selectByIndex(5);
		s.selectByValue("");
		s.selectByVisibleText("");
		s.deselectAll();
		s.deselectByIndex(0);
		s.deselectByValue("");
		s.deselectByVisibleText("");
		s.isMultiple();
	}
}