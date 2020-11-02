package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=HelperFunctions.startBrowser();
		driver.manage().window().maximize(); // For Maximizing window
		
		
		Actions ac=new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
			
		ac.dragAndDrop(from, to).perform();
		
		System.out.println(from.getText());  // For getting text from WebElement
		
	}
}
