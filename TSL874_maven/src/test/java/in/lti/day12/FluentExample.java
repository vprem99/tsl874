package in.lti.day12;

import java.net.URL;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import utils.Base;

public class FluentExample extends Base {
  @Test
  public void f() throws Exception{
	  // Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	  driver.get("http://google.com");
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30))
	       .pollingEvery(Duration.ofSeconds(5))
	       .ignoring(NoSuchElementException.class);   // Declaration of Fluent Wait
	 
	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.name("qq"));
	     }
	   });
	   foo.sendKeys("ABC");
	   
	   driver.navigate().to(new URL("http://google.com"));
	   //driver.navigate().refresh();
  }
}
