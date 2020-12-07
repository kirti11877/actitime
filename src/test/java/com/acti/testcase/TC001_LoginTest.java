package com.acti.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class TC001_LoginTest extends  DriverScript {
	
	
	@BeforeMethod
	public void preCondition()
	{
		initBrowser();	
		launchApplication();
	}
	
	
	@Test
	public void testLoginFuntion()
	{
		LoginPage lp = new LoginPage();
		lp.loginToApplication("admin", "manager");
		
	}
	
	@Test
	public void testVerifyLogoDisplayed()
	{
		LoginPage lp = new LoginPage();
		boolean flag = lp.verifyActiLogo();
		System.out.println(flag);
	}
	
	@AfterMethod
	public void postCondition()
	{
		closeApplication();
	}

}
