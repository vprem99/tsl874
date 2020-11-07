package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.LoginPage;
import utils.Base;

public class DataBase extends Base {
	@Test
	public void dbConnect() throws Exception {
		// This Makes Connection with DataBase : Making a Bridge
		Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/selenium99", "mpremchand99",
				"mpremchand99");
		// Firing sql query to database & Storing to ResultSet
		ResultSet result = con.createStatement().executeQuery("select * from login99");

		while (result.next() == true) {
			String un = result.getString("username");
			String pwd = result.getString("password");
			System.out.print(un);
			System.out.println(" " + pwd);

			driver.get("https://opensource-demo.orangehrmlive.com/");
			LoginPage lp = new LoginPage(driver);
			lp.doLogin(un, pwd);

			if (driver.getCurrentUrl().contains("dashboard")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Login Pass");
			} else {
				System.out.println("Login Failed");
			}
		}
	}
	
	
	
	
	
	
	
}