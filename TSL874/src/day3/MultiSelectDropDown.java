package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.HelperFunctions;

public class MultiSelectDropDown {
	
	public static void main(String[] args) throws Exception{
		/*HelperFunctions h=new HelperFunctions();
		h.startBrowser();    // For non static method/variable*/
		
		//ClassName.MethodName
		
		WebDriver driver=HelperFunctions.startBrowser();  // For Static methods/variables
		/*driver.get("http://google.com");
		driver.quit();
	*/	

		driver.get("http://www.magneticautomation.in/p/dropdown.html");
		WebElement E=driver.findElement(By.name("multi"));
		Select s=new Select(E);
		
		boolean x=s.isMultiple(); // returns true if it is multiSelect
		System.out.println("Multi Selection is "+x);
		s.selectByVisibleText("One");
		s.selectByVisibleText("Three");
		s.selectByVisibleText("Four");

		Thread.sleep(3000);
		
		s.deselectByVisibleText("Three");
		//Thread.sleep(3000);
		s.deselectAll();  // Every thing will be deselected
		//Thread.sleep(3000);
		driver.quit();
	}
}