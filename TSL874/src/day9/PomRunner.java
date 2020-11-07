package day9;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.ForgetPage;
import pom.LoginPage;
import utils.Base;

public class PomRunner extends Base {

	@Test(priority = 1)
	public void forgetAccTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode");
		ForgetPage fp = new ForgetPage(driver);
		fp.clickCancel();
		String cUrl = driver.getCurrentUrl();
		Assert.assertEquals(cUrl, "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test(priority = 2)
	public void f() {
		LoginPage lp = new LoginPage(driver);
		/*
		 * lp.setUserName("admin"); lp.setPassword("admin123"); lp.clickLogin();
		 */
		lp.doLogin("admin", "admin123");
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
}

// IS-A relationShip
/*
 * Every Car is a Vehicle Every Bike is a Vehicle Every Vehicle is Bike
 */

//Vehicle 
