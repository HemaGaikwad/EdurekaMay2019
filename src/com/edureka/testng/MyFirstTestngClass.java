package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestngClass {
  
	@Test
  public void display() 
	{
		Reporter.log("This is a sample method");
  
	}
}
