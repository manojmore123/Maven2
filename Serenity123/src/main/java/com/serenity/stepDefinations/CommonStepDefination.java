package com.serenity.stepDefinations;

import com.serenity.steps.CommonStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CommonStepDefination {
	
	@Steps
	CommonStep cs;
	
	@Given("I am on travel portal")
	public void i_am_on_travel_portal() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		cs.i_am_on_travel_page();
	   
	}

}
