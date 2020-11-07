package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LoginPage;
import utils.Base;

public class DataBase2 extends Base {
	@Test(dataProvider = "dp")
	public void dbConnect(String un, String pwd) throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage(driver);
		lp.doLogin(un, pwd);
		Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	@DataProvider
	public Object[][] dp() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/selenium99", "mpremchand99",
				"mpremchand99");

		ResultSet rows = con.createStatement().executeQuery("select count(*) from login99");
		rows.next();
		int sz = rows.getInt(1);
		System.out.println("number of Rows are " + sz);
		ResultSet result = con.createStatement().executeQuery("select * from login99");

		Object[][] data = new Object[sz][2];
		int i = 0; // counter
		while (result.next() == true) {
			data[i][0] = result.getString("username");
			data[i][1] = result.getString("password");
			i++;
		}
		return data;
	}
}