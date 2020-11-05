package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.Base;

public class ClearTrip extends Base {
	@Test
	public void flightSearch() throws Exception{
		//Implicit Wait which is Application thoughout your Programme 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver, 20);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("FromTag")).sendKeys("Mumbai");
	//	Thread.sleep(5000);
		//driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).click();
		
		WebElement E=wt.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li/a")));
	
		//ExpectedConditions.url
		E.click();
		
		
	}
}