package com.serenity.stepDefinations.FlightBooking;

import java.util.Map;

import com.serenity.steps.flightbookingStep.FlightBookingSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class FlightBookingStepDefination {
	
	@Steps
	FlightBookingSteps fb;
	
	@When("I am searching flight for onetrip")
	public void i_am_searching_flight_for_onetrip(io.cucumber.datatable.DataTable dataTable) throws Exception {
		Map<String, String> userDetails=dataTable.asMap(String.class, String.class);
		fb.booking_one_way_flight(userDetails);
	    
	}

	@Then("I should be successfully searched flight for onetrip")
	public void i_should_be_successfully_searched_flight_for_onetrip() throws Exception {
		
		fb.flight_book_validation();    
	}

	
	
	
	
	@When("I am searching flight for round trip")
	public void i_am_searching_flight_for_round_trip(io.cucumber.datatable.DataTable dataTable) throws Exception {
		Map<String, String> userDetails=dataTable.asMap(String.class, String.class);
		fb.booking_reound_way_flight(userDetails);
	}
	
	
	@Then("I should be successfully searched flight for roundtrip")
	public void i_should_be_successfully_searched_flight_for_roundtrip() throws Exception {
		
		fb.flight_book_validation();    
	}
	
}
