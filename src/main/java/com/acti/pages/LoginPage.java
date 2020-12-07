package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: LoginPage Class
 * Tester: Kirti
 * Verified by : Shantosh
 * Date modified: 12/07/20
 */


public class LoginPage extends DriverScript
{
	
//*******************************************************Page Elements*******************************************************//
	
	@FindBy(id="username") WebElement usernameTextbox;
	@FindBy(name ="pwd") WebElement passwordTextbox;
	@FindBy(id = "loginButton") WebElement loginbutton;
	@FindBy(className ="atLogoImg") WebElement actitimeLogo;
	
//*******************************************************Page Initialization************************************************//
	
	// PageFactory class in POM is use to initialize the page elements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//*******************************************************Page Actions************************************************//	
	
	public void loginToApplication(String username, String password)
	{
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		loginbutton.click();
	}

	public boolean verifyActiLogo()
	{
		return actitimeLogo.isDisplayed();
	}
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
}
