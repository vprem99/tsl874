package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class EaseMytripAlert  {
	public static void main(String[] args) throws Exception{
		WebDriver driver=HelperFunctions.startBrowser();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		Actions ac=new Actions(driver);
		//ac.moveToElement(driver.findElement(By.id("spnMyAcc"))).perform();
		driver.findElement(By.id("spnMyAcc")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("txtEmailMobF")).sendKeys("vprem919@gmail.com");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[1]/div[7]/input[1]")).click();
		Thread.sleep(2000);

		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
	}
}
