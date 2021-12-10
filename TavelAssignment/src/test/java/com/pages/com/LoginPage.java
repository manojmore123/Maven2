package com.pages.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resource.basedata;

public class LoginPage  {
	
	 WebDriver driver;
	 
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}	
		
	
	@FindBy(xpath ="//li[@class='tb_link dropdown tb_menu_system_account_account']")
	public  WebElement button_login;
	
	@FindBy(xpath ="//*[text()='Register']")
	public WebElement button_register;
	
	@FindBy(xpath ="//*[@id='input-firstname']")
	public WebElement input_firstName;
	
	@FindBy(xpath ="//*[@id='input-lastname']")
	public WebElement input_LastName;
	
	@FindBy(xpath ="//*[@id='input-email']")
	public WebElement input_email;
	
	@FindBy(xpath ="//*[@id='input-telephone']")
	public WebElement input_telephone;
	
	@FindBy(xpath ="//*[@id='input-address-1']")
	public WebElement input_Adress1;
	
	@FindBy(xpath ="//*[@id='input-address-2']")
	public WebElement input_Adress2;
	
	
	@FindBy(xpath ="//*[@id='input-city']")
	public WebElement input_City;
	
	@FindBy(xpath ="//*[@id='input-postcode']")
	public WebElement input_PostCode;
	
	@FindBy(xpath ="//*[@id='input-country']")
	public WebElement dropdown_Country;
	
	@FindBy(xpath ="//*[@id='input-zone']")
	 WebElement dropdown_Zone;
	
	
	@Test
	public void loginintoapp() throws IOException
	
	{
		
		button_login.click();
	}
	
	
	
}
