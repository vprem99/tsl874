package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class AlertExample {

	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		driver.get("https://www.magneticautomation.in/2019/01/alert-example.html");

		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Alert a=driver.switchTo().alert();  // For Focusing on Alert
		
		String txt=a.getText();	// For getting txt from alert
		System.out.println("Alert Message is >>>>  "+txt);
		
		a.sendKeys("Prem");   // For Typing in alert 
	//	a.accept(); // For Clicking on OK button
		a.dismiss(); // For Clicking on Cancel button
	}
}