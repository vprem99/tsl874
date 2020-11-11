package com.lti.day11;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.Base;
import utils.KeyWords;

public class GoogleTest extends Base {
	
	@Test(description = "Verifiying Title of Bing Home Page")
	public void bingTitleVerification() throws Exception{
		ExtentReports ex = new ExtentReports(); // For Working with Extent Report
		ex.attachReporter(new ExtentHtmlReporter("BingReport.html"));

		ExtentTest tc1 = ex.createTest("BingTitle Verification");
		tc1.info("Opening Url");  // logger in report
		driver.get("http://bing.com");
		tc1.info("Fetching Current Title");  // logger in report
		String actualTitle = driver.getTitle();
		tc1.info("Comparing Title -- Perfotming Test");
		try {
			Assert.assertEquals(actualTitle, "Bing India");
			tc1.pass("Title matched & test Successful");
		} catch (AssertionError E) {
			tc1.fail("Title did not matched & test unSuccessful " + E.getMessage());
			KeyWords key=new KeyWords(driver);
			String path=key.getSnap(".\\Bing");
			tc1.addScreenCaptureFromPath(path);
			Assert.fail(E.getMessage());
		} finally {
			ex.flush(); // For Writing report to Actual Memory
		}
	}
}
