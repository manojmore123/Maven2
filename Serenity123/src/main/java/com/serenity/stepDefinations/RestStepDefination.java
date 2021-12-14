package com.serenity.stepDefinations;


import net.thucydides.core.annotations.Steps;
import java.util.List;
import java.util.Map;

import com.serenity.steps.rest.RecordNewTrade;
import com.serenity.steps.rest.Trade;
import com.serenity.steps.rest.TradeResponse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;



public class RestStepDefination {
	
 
	
	/*
	@Steps
    RecordNewTrade recordNewTrade;

    @Steps
    TradeResponse theTradeDetails;

    Trade trade;
    
	@Given("^the following trade:$")
	public void the_following_trade(List<Map<String, String>> tradeDetails) {
		
		String security = tradeDetails.get(0).get("security");
		String  buySell = tradeDetails.get(0).get("buySell");
		String quantity =tradeDetails.get(0).get("quantity");
		String priceInCents = tradeDetails.get(0).get("priceInCents");		
		
		trade=recordNewTrade.createRecord(security,buySell,quantity,priceInCents);
	}

	@When("^I record the trade$")
	public void i_record_the_trade() {
		recordNewTrade.withDetails(trade);
	}

	@Then("^the recorded trade should include the following details:$")
	public void the_recorded_trade_should_include_the_following_details(List<Map<String, String>> tradeDetails) {     
		Map<String, String> expectedTrade = tradeDetails.get(0);		
		
		Trade actualTrade=theTradeDetails.getDetails();
		
	    assertEquals(actualTrade.getBuySell(),expectedTrade.get("buySell"));
	    assertEquals(actualTrade.getSecurity(),(expectedTrade.get("security")));
	    assertEquals(actualTrade.getQuantity(),(expectedTrade.get("quantity")));
	    assertEquals(actualTrade.getPriceInCents(),(expectedTrade.get("priceInCents")));
	}*/
}
