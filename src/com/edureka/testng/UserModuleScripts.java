package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts 
{
	@Test(groups= {"Smoke"})
	public void createUser()
	{
		Reporter.log("User created successfully");
	}
	
	@Test(groups = {"Regression"})
	public void editUser()
	{
		Reporter.log("User edited successfully");
	}
	
	@Test(groups = {"Regression"})
	public void deleteUser()
	{
		Reporter.log("User deleted successfully");
	}
	

}
