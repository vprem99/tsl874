package day10;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.Base;
import utils.HelperFunctions;

public class PropertyExample extends Base {
	@Test
	public void f() throws Exception{
		System.out.println(prop.getProperty("browserName"));
		System.out.println(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		WebElement E=driver.findElement(By.xpath(prop.getProperty("searchField")));
		E.sendKeys("LTI");
		E.sendKeys(Keys.ENTER);
	}
}
