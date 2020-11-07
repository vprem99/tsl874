package day9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class All_Annotation {
	@Test
	public void f1() {
		System.out.println("In function 1");
		Date d = new Date();
		String date = d.toString();
		System.out.println(date);
		date=date.replaceAll(" ", "_").replaceAll(":", "_");
		System.out.println(date);
	}

	@Test
	public void f2() {
		System.out.println("In function 2");
	}

	@Test
	public void f3() {
		System.out.println("In function 3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("In Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("In after Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In After suite");
	}
}
