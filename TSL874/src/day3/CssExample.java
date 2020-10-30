package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class CssExample {

	public static void main(String[] args) throws Exception{
		/*
		 * 1.CSS with id 
		 * 		tagname#id 
		 * 2.CSS with name/type/value/any property
		 * 		tagname[name/type/value/any property='value of that property'] 
		 * 
		 * 3.CSS with ClassName 
		 		tagname.className
		 */

		WebDriver driver = HelperFunctions.startBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.panelTrigger")).click();
		driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();

	}
}
