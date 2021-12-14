package com.serenity.steps;

import com.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class CommonStep {
	
	
	HomePage home;
	
	@Step
	public void i_am_on_travel_page() throws InterruptedException {
		home.getDriver().get("https://www.makemytrip.com/flights/");
		home.getDriver().manage().window().maximize();
		
		Thread.sleep(2000);
	}
	

}
