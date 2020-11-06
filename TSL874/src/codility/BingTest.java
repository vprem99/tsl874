package codility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BingTest extends WebDriverTestCase {

	@Test
	public void a() {
		webDriver.get("http://bing.com");
		String actualTitle = webDriver.getTitle();
		assertEquals("Bing", actualTitle);
	}

	@Test
	public void b() throws Exception{
		webDriver.findElement(By.name("q")).sendKeys("LTI");
		webDriver.findElement(By.cssSelector("label[class='search icon tooltip']")).click();
		Thread.sleep(5000);
		List<WebElement> ls=webDriver.findElements(By.xpath("//ol[@id='b_results']/li"));
		assertTrue(ls.size()>=1);
		System.out.println("Total available search Results "+ls.size());
	}
}