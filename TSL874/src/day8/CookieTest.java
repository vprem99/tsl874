package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Base;

public class CookieTest extends Base {

	@Test(priority = 1, description = "Test for Cookie on Google")
	public void cookiePrint() {
		driver.get("https://google.com/");
		//driver.manage().get
		Set<Cookie> ck = driver.manage().getCookies();
		List<Cookie> allCK = new ArrayList<>(ck);

		for (int i = 0; i < allCK.size(); i++) {
			System.out.println("Domain of Cookie is " + allCK.get(i).getDomain());
			System.out.println("Name of Cookie is " + allCK.get(i).getName());
			System.out.println("Path of Cookie is " + allCK.get(i).getPath());
			System.out.println("Value of Cookie is " + allCK.get(i).getValue());
			System.out.println("Expiery of Cookie is " + allCK.get(i).getExpiry());
			System.out.println("-----------------------Next Cookie details----------");
		}
	}
	@Test(priority = 2)
	public void orangeHrmLoginCookieTest() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().deleteAllCookies();
		//driver.manage().dele
		driver.navigate().refresh();
		Assert.assertTrue(driver.findElement(By.name("txtUsername")).isDisplayed());
	}
}