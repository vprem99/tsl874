package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.ExcelReader;
import utils.HelperFunctions;

public class ParaMetrization {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void loginTest(String un, String pwd) {
		driver.get("http://frontaccounting.squadinfotech.in/");
		driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
		Assert.assertEquals(driver.getTitle(), "Main Menu", "Login faield due to invalid credentials");
		driver.findElement(By.linkText("Logout")).click();
	}

	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser) {
		driver = HelperFunctions.startBrowser(browser);
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() { // It's internal storage of data ..very similar to excel sheet
								// Rows col
		// Object data[][] = new Object[4][2];
		/*
		 * data[0][0] = "admin"; 
		 * data[0][1] = "LTI"; 
		 * data[1][0] = "frontuser2";
		 * data[1][1] = "frontuser2"; 
		 * data[2][0] = "system"; 
		 * data[2][1] = "system123";
		 * data[3][0] = "frontuser1"; 
		 * data[3][1] = "frontuser1";
		 */
		ExcelReader ex = new ExcelReader("C:\\Users\\Bhajan\\Desktop\\SelJars\\data.xls");
		int sz = ex.getRowNum("Sheet1");
		Object data[][] = new Object[sz - 1][2];

		for (int i = 1; i < sz; i++) {
			data[i-1][0] = ex.getCellData("Sheet1", i, 0);
			data[i-1][1] = ex.getCellData("Sheet1", i, 1);
		}

		return data;
	}
}