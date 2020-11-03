package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class Reading {

	public static void main(String[] args) throws Exception {
		// Reading File
		FileInputStream ip = new FileInputStream("C:\\Users\\Bhajan\\Desktop\\SelJars\\data.xlsx");
		// Reading File as Workbook
		XSSFWorkbook book = new XSSFWorkbook(ip);
		// Reading Sheet
		XSSFSheet sh = book.getSheet("Sheet1");
		// Reading Data from Cells
		String data = sh.getRow(3).getCell(1).toString();
		// Printing data
//		System.out.println(data);
		int rows = sh.getLastRowNum();
		WebDriver driver = HelperFunctions.startBrowser();

		System.out.println(sh.getLastRowNum());
		for (int i = 1; i <= rows; i++) {
			String un = sh.getRow(i).getCell(0).toString();
			String pwd = sh.getRow(i).getCell(1).toString();
			System.out.print(un + " ");
			System.out.println(pwd);
			driver.get("http://frontaccounting.squadinfotech.in/");
			driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("SubmitUser")).click();

			if (driver.getTitle().equals("Main Menu")) {
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Login Done");
				sh.getRow(i).createCell(2).setCellValue("Login Done");

			} else {
				System.out.println("Login Failed");
				sh.getRow(i).createCell(2).setCellValue("Login Failed");
			}
		}
		book.write(new FileOutputStream("C:\\Users\\Bhajan\\Desktop\\SelJars\\data99.xlsx"));				
		driver.quit();
		
		/*
		 * Try to do Login Process with above userName/Passsword & mention login done if
		 * login is successful & mention login failed if login in unsuccessfull
		 */ }
}