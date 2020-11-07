package day8;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Base;

public class LinkImageTest extends Base {
	@Test
	public void printingLinks() throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> ls = driver.findElements(By.xpath("//a"));
		System.out.println("total available links are " + ls.size());

		for (int i = 0; i < ls.size(); i++) {
			String href = ls.get(i).getAttribute("href");
			System.out.print(href);
			
			URL url=new URL(href);  // Converting String to href	
			// It will Open a Channel But It will not do actual Connection with remote server
			URLConnection con=url.openConnection();
			HttpURLConnection hCon=(HttpURLConnection)con;  // Type Casting for HTTP related functions
			hCon.connect(); // It will actual Connection with actual webSite in Background
			
			int status=hCon.getResponseCode();
			
			if(status==200)
				System.out.println(" is working");
			else
				System.out.println(" is not working and Status Code & Message is -->> "+status +", "+hCon.getResponseMessage());			
		}
		/*	// take a variable of List/set/array type
		for (WebElement E : ls) {
			System.out.println(">>> ----" + E.getAttribute("href"));
		}*/
	}
	
	
	@Test
	public void printingImg() throws Exception{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> ls = driver.findElements(By.xpath("//img"));
		System.out.println("total available Images are " + ls.size());

		for (int i = 0; i < ls.size(); i++) {
			String href = ls.get(i).getAttribute("src");
			System.out.print(href);
			
			URL url=new URL(href);  // Converting String to href	
			// It will Open a Channel But It will not do actual Connection with remote server
			URLConnection con=url.openConnection();
			HttpURLConnection hCon=(HttpURLConnection)con;  // Type Casting for HTTP related functions
			hCon.connect(); // It will actual Connection with actual webSite in Background
			
			int status=hCon.getResponseCode();
			
			if(status==200)
				System.out.println(" is working");
			else
				System.out.println(" is not working and Status Code & Message is -->> "+status +", "+hCon.getResponseMessage());			
		}
	}
}