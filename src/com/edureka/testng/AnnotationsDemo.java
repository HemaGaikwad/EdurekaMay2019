package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
	@BeforeSuite
	public void setUp()
	{
		Reporter.log("Establish connections with servers/ databases/download files");
	}

			@BeforeTest
			public void beforeTestMethod()
			{
				Reporter.log("This gets executed before each and every test block in testng.xml file");
			}
			
					@BeforeClass
					public void beforeClassMethod()
					{
						Reporter.log("This gets executed before each and every class in testng.xml file");
					}
					
								@BeforeMethod
								public void precondition()
								{
									Reporter.log("Method gets  executed before each and every test method");
								}
								
											@Test
											public void actualTestCases()
											{
												Reporter.log("Executable block of code");
											}
								
								@AfterMethod
								public void closeBrowser()
								{
									Reporter.log("Method gets  executed after each and every test method");
								}
								
					@AfterClass
					public void afterbeforeClassMethod()
					{
						Reporter.log("This gets executed before each and every class in testng.xml file");
					}
			
			@AfterTest
			public void afterTestMethod()
			{
				Reporter.log("This gets executed after each and every test block in testng.xml file");
			}
	
	@AfterSuite
	public void afterSuiteMethod()
	{
		Reporter.log("Disconnect the connections/Trigger an email");
	}



}
