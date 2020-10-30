package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class MouseHoverExample {

	public static void main(String[] args) {

		WebDriver driver=HelperFunctions.startBrowser();
		driver.get("http://ugc.ac.in");
		
		WebElement pub=driver.findElement(By.linkText("Publications"));
		
		Actions ac=new Actions(driver); // For Working with Mouse & KeyBoard
		ac.moveToElement(pub).perform();
		
		//driver.findElement(By.linkText("Annual Reports/ Annual Accounts")).click();
		
		//Clicking with Actions Class
		ac.click(driver.findElement(By.linkText("Annual Reports/ Annual Accounts"))).perform();
	}
}