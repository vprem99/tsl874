package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		System.out.println("Total HyperLinks are "+ls.size());
		
		List<WebElement> ls2=driver.findElements(By.tagName("img"));
		System.out.println("Total Images are "+ls2.size());
		
		
		
	}
}
