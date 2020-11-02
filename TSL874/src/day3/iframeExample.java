package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class iframeExample {

	public static void main(String[] args) {
		WebDriver driver=HelperFunctions.startBrowser();
		driver.manage().window().maximize(); // Maximizing Window/browser
		
		driver.get("file:///C:/Users/Bhajan/Desktop/TSL874-AT/iframe.html");
		
		driver.switchTo().frame("blaze");  //String argument accepts id/name of frame
		driver.findElement(By.linkText("destination of the week! The Beach!")).click();		

		driver.switchTo().defaultContent(); // to focus on parent window
		driver.switchTo().frame("bing");
		driver.findElement(By.name("q")).sendKeys("LTI");
		
		driver.switchTo().defaultContent(); // to focus on parent window

		//driver.switchTo().frame(2); // This is using index of Iframe
		
		//Switching by WebElement Argument
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.dummy")));
		driver.findElement(By.linkText("ISTQB")).click();
	}
}

