package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception {
		/*
		Parent p=new Child
		Child c=new Child
		ChromeDriver driver;  // driver is of ChromeDriver type
		driver=new ChromeDriver(); // Initialization
		
		//1.Child c=new Child();
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("");  // Parent Specific Function
		driver1.getScreenshotAs(OutputType.FILE);  // Child Specific Function
		//300 lines
			
		
		//2.Parent P=new Child
		WebDriver driver2=new ChromeDriver();
		driver2.get("");//Parent Specific Function
		driver2.getScreenshotAs(OutputType.FILE);  // Child Specific Function

		*/
		
		
		// For Setting the Path of Executable Driver
		/*System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		*/
		// For setting the path of Executable Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		//For Starting Browser
		WebDriver driver=new ChromeDriver();
		//Opening URL
		driver.get("http://google.com");
		Thread.sleep(5000);
		
		//For Getting title of Page 
		String t=driver.getTitle();
		System.out.println("You are on "+t+" Page");
		//For Closing Browser
		driver.quit();
	}
}