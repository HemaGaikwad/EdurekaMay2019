package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleScripts 
{
	@Test(groups= {"Smoke"})
	public void createTask()
	{
		Reporter.log("Task created successfully");
	}
	
	@Test(groups = {"Regression"})
	public void editTask()
	{
		Reporter.log("Task edited successfully");
	}
	
	@Test(groups = {"Regression"})
	public void deleteTask()
	{
		Reporter.log("Task deleted successfully");
	}
	

}
