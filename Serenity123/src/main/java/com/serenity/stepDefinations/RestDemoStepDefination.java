package com.serenity.stepDefinations;

import java.util.List;
import java.util.Map;

import com.serenity.steps.restSteps.RecordNewTradeInfo;
import com.serenity.steps.restSteps.TradeDetails;
import com.serenity.steps.restSteps.TradeResponseClassStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.assertEquals;
public class RestDemoStepDefination {
	
	@Steps
	RecordNewTradeInfo recordNewTradeInfo;
	
	@Steps
	TradeResponseClassStep tradeResponseClassStep;
	
	
	TradeDetails trade;
	@Given("the following trade:")
	public void the_following_trade(List<Map<String, String>> tradeDetails ) {
		
	       String security= tradeDetails.get(0).get("security");
		   String buySell= tradeDetails.get(0).get("buySell");
		   String quantity= tradeDetails.get(0).get("quantity");
		   String priceInCents= tradeDetails.get(0).get("priceInCents");
		   
		   trade=recordNewTradeInfo.createRecord(security, buySell, quantity, priceInCents);
		  
		
	}

	@When("I record the trade")
	public void i_record_the_trade() {
		
		recordNewTradeInfo.send_Post_Request(trade);
	    
	}

	@Then("the recorded trade should include the following details:")
	public void the_recorded_trade_should_include_the_following_details(List<Map<String, String>> tradeDetails) {
		Map<String, String > expectedTradeResults=tradeDetails.get(0);
		TradeDetails actualResult=tradeResponseClassStep.get_trade_details();
		assertEquals(actualResult.getSecurity(), expectedTradeResults.get("security")); 
	}

}
