package day10;

import org.testng.annotations.Test;

import utils.Base;
import utils.KeyWords;

public class KeyRunner extends Base {
  @Test
  public void f() {
	  KeyWords key=new KeyWords(driver);
	  key.getURL("http://blazedemo.com");
	  key.selectFromDropDown("//*[@name='fromPort']", "Boston");
	  key.selectFromDropDown("//*[@name='toPort']", "Rome");
	  key.click("//input[@value='Find Flights']");
	  key.getSnap(".\\blaze");
  }
}
