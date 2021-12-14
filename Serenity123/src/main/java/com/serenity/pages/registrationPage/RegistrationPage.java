package com.serenity.pages.registrationPage;

import java.util.Map;

import org.openqa.selenium.support.FindBy;

import com.serenity.pages.HomePage;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class RegistrationPage extends HomePage{

	
	
	@FindBy(xpath = "//input[contains(@name,'email')]")
	public WebElement  userName;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement  password;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement  confirmPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement  btn_submit;
	
	
	public void register_user(Map<String,String> userDetails) {
		userName.sendKeys(userDetails.get("UserName"));
		password.sendKeys(userDetails.get("Password"));
		confirmPassword.sendKeys(userDetails.get("Confirm Password"));
		btn_submit.click();
	}


	
	public WebElementFacade uniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
