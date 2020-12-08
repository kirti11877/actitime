package com.acti.testcase;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;

public class TC002_CreateCustomer extends BaseTest {
 

	@Test
	public void testCreateCustomer()
	{
	
		lp.loginToApplication("admin", "manager");
		enterTimePage.clickTaskMenu();
		taskPage.clickAddNewButton();
		taskPage.clickNewCustomerItem();
		taskPage.enterCustomerName("John");
		
	}
}
