package com.serenity.pages.registrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.serenity.pages.HomePage;

import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationSuccess extends HomePage{
	
	@FindBy(xpath = "//*[contains(text(),' Thank you ')]")
	public WebElementFacade  successMessage;

}
