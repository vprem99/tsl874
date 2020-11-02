package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class YesBankRediff {

	public static void main(String[] args) {
		WebDriver driver = HelperFunctions.startBrowser();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		String pid = driver.getWindowHandle(); // Current Window/Tab ID

		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("YES BANK LTD");
		driver.findElement(By.cssSelector("input.getqbtn")).click();
		
		Set<String> allWin = driver.getWindowHandles(); // ID of Both TAB
		List<String> allWinList = new ArrayList<>(allWin);

		for (int i = 0; i < allWinList.size(); i++) {
			if (!allWinList.get(i).equals(pid)) { // if it is Child
				driver.switchTo().window(allWinList.get(i)); // Focus to Child 
				System.out.println("You was on Page " + driver.getTitle());
				driver.close(); // For Closing Particular TAB
			}
		}
		driver.switchTo().window(pid);// SWITCHING to Parent TAB
	}
}