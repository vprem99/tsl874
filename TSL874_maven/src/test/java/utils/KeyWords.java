package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class KeyWords {
	public WebDriver idriver;

	public KeyWords(WebDriver driver) {
		idriver = driver;
	}

	public void getURL(String url) {
		idriver.get(url);
	}
	public void type(String locator, String data) {
		idriver.findElement(By.xpath(locator)).sendKeys(data);
	}
	public void click(String locator) {
		idriver.findElement(By.xpath(locator)).click();
	}
	public void selectFromDropDown(String locator,String option) {
		Select s=new Select(idriver.findElement(By.xpath(locator)));
		s.selectByVisibleText(option);
	}
	public String getSnap(String locationWithFileName) {
		Date d = new Date();
		String date = d.toString();
		System.out.println(date);
		date=date.replaceAll(" ", "_").replaceAll(":", "_");
		TakesScreenshot sp=(TakesScreenshot)idriver;
		File src=sp.getScreenshotAs(OutputType.FILE); // It is in Java's Buffer Memory	
		try {
			FileHandler.copy(src, new File(locationWithFileName+date+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return locationWithFileName+date+".png";
	}
}