package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript 
{
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement customerNameTextBox;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTextArea;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustomerButton;

	
	public TaskListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickNewCustomerItem()
	{
		newCustomerItem.click();
	}
	
	public void enterCustomerName(String custName)
	{
		customerNameTextBox.sendKeys(custName);
	}
	
	public void enterCustomerDescription(String custDescription)
	{
		customerDescriptionTextArea.sendKeys(custDescription);
	}
	
	public void clickCreateCustomer()
	{
		createCustomerButton.click();
	}

}
