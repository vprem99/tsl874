package day2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontAcc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName & Password");
		String un = s.next();
		String pwd = s.next();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhajan\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.frontaccounting.eu/index.php");

		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
		/*try {
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Login Done");
		} catch (Exception E) {
			System.out.println("Login Failed");
		}*/
		
		
		if(driver.getTitle().equals("Main Menu")) {
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Login Done");
		} else{
			System.out.println("Login Failed");
		}
	}
}