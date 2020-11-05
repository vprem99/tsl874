package day7;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.Base;

public class XpathExample extends Base{
  @Test
  public void f() throws Exception{
	  driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	  
	  driver.findElement(By.xpath("//*[contains(@name,'mobno')]")).sendKeys("123456789");
	  
	  driver.findElement(By.xpath("(//*[contains(@name,'passwd')])[1]")).sendKeys("123456789");
	  driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[2]")).sendKeys("123456789");
	  
	  Thread.sleep(3000);
	  List<WebElement> ls=driver.findElements(By.xpath("//*[contains(@name,'passwd')]"));
	  ls.get(1).clear();
	  

  }
}
