package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class Redifftask {
	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		driver.manage().window().maximize(); // For Maximizing window

		driver.get("http://rediff.com");
		driver.switchTo().frame("moneyiframe");
		
		System.out.println(driver.findElement(By.id("bseindex")).getText());
		System.out.println(driver.findElement(By.id("nseindex")).getText());
	}

}