package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class RadioExample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = HelperFunctions.startBrowser();
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));
		boolean isDisplayed = male.isDisplayed(); // Checking if it is available on Screen or not
		boolean isEnabled = male.isEnabled(); // Checking if Male is Enabled or not
		boolean isSelected = male.isSelected(); // Checking if Male is Selected or not

		System.out.println("Male is displaying " + isDisplayed);
		System.out.println("Male is Enabled  " + isEnabled);
		System.out.println("Male selection is " + isSelected);
		System.out.println("Type of Object " + male.getAttribute("type"));
		male.click(); // Selecting Male

		Thread.sleep(3000);
		
		// Grouping of Objects : Grouping WebElements which is having comman Property
		List<WebElement> ls = driver.findElements(By.name("sex")); 
		int sz = ls.size();  // gives counts of WebElements available on Screen
		System.out.println("Total gender Options are " + sz);

		ls.get(0).click();

		for (int i = 0; i < sz; i++) {
			Thread.sleep(1500);
			ls.get(i).click();
		}
	}
}