package com.lti.day11;

import org.testng.annotations.Test;

public class GroupingExample {
	
  @Test(groups="smoke")
  public void test1() {
	  System.out.println("In Smoke Testing");
  }
  
  @Test(groups= {"smoke","sanity"})
  public void test2() {
	  System.out.println("In Smoke & Sanity Testing");
  }
  
  @Test(groups="regression")
  public void test3() {
	  System.out.println("In Regression Test");
  }
  
  @Test(groups= {"regression","functional"})
  public void test4() {
	  System.out.println("In Regression n functional Test");
  }
}
