package com.serenity.pages;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{
	
	@FindBy(xpath = "//a[contains(.,'REGISTER')]")
	public WebElementFacade rEGISTER;
	
	@FindBy(xpath = "//div[@data-cy='outsideModal']")
	public WebElementFacade outsideLoginpage;
	

	@FindBy(xpath = "//li[@class='menu_Flights']//span[1]")
	public WebElementFacade lnk_flight;
	
	@FindBy(xpath = "//li[@data-cy='roundTrip']")
	public WebElementFacade  btn_roundtrip;

	@FindBy(xpath = "//a")
	public List<WebElementFacade> all;

	public void clickOnRegistration() {
		System.out.println(all.size());
		rEGISTER.click();
	}

	
}
