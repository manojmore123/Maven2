package com.serenity.steps.flightbookingStep;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.serenity.pages.HomePage;
import com.serenity.pages.flightbooking.FlightBookingPage;
import com.serenity.steps.CommonStep;

import net.thucydides.core.annotations.Step;

public class FlightBookingSteps extends CommonStep {

	FlightBookingPage fb;
	HomePage home;
	

	@Step
	public void booking_one_way_flight(Map<String, String> userDetails) throws Exception {
		Thread.sleep(5000);
		
		home.outsideLoginpage.click();
		home.lnk_flight.click();
		fb.one_way_booking_flight(userDetails);
		
	
//		home.outsideLoginpage.click();
//		fb.getDriver().navigate().refresh();
//		fb.getAlert().dismiss();
		Thread.sleep(2000);
		
		fb.closePopup.click();
		
		
//		JavascriptExecutor js = (JavascriptExecutor)fb.getDriver();
//		js.executeScript("arguments[0].scrollIntoView();", fb.btn_searchFlight);
		Thread.sleep(2000);
		fb.btn_searchFlight.click();
		
		
	}
	
	
	
	@Step
	public void flight_book_validation() throws Exception {
		Thread.sleep(5000);	
		fb.validate_flight_search_result();
	}
	
	
	@Step
	public void booking_reound_way_flight(Map<String, String> userDetails) throws Exception {
		Thread.sleep(5000);
		
		home.outsideLoginpage.click();
		Thread.sleep(5000);
//		home.btn_roundtrip.click();
		Thread.sleep(5000);
		fb.two_way_booking_flight(userDetails);
		
	
//		home.outsideLoginpage.click();
//		fb.getDriver().navigate().refresh();
//		fb.getAlert().dismiss();
		Thread.sleep(2000);
		
		fb.closePopup.click();
		
		
//		JavascriptExecutor js = (JavascriptExecutor)fb.getDriver();
//		js.executeScript("arguments[0].scrollIntoView();", fb.btn_searchFlight);
		Thread.sleep(2000);
		fb.btn_searchFlight.click();
		
		
	}
	
	
	

}
