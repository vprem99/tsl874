package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.dev");

		// For Searching Object
		WebElement E = driver.findElement(By.linkText("Downloads"));
		// For Click
		E.click();
		
		
		WebElement search=driver.findElement(By.id("gsc-i-id1"));
		search.sendKeys("LTI");

		Thread.sleep(5000);
		search.clear();    //Clearing Previous text

		driver.findElement(By.name("search")).sendKeys("Mumbai"); // In Single
		
		driver.findElement(By.linkText("Downloads")).sendKeys("DDD");
		Thread.sleep(5000);
		// For Getting title of Page
		String t = driver.getTitle();
		System.out.println("You are on " + t + " Page");
		// For Closing Browser
		driver.quit();
	}
}