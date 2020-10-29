package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		//Starts Browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com");
		
		//WebElement fPort=driver.findElement(By.name("fromPort"));	
		Select port=new Select(driver.findElement(By.name("fromPort")));      // for dropdown Starting from Select tag
//		port.selectByVisibleText("Paris");	
//		port.selectByIndex(5); // for Maxico
		
		port.selectByValue("Boston");
		
		Select toPort=new Select(driver.findElement(By.name("toPort")));
		toPort.selectByIndex(0);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();	
		
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		driver.findElement(By.name("zipCode")).sendKeys("400074");
		
		driver.findElement(By.id("rememberMe")).click();
/*		int x=400074;
		String pin=String.valueOf(x);*/
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	}
}