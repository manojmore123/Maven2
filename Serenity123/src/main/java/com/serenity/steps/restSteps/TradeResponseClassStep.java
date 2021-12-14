package com.serenity.steps.restSteps;

import net.thucydides.core.annotations.Step;
import static io.restassured.RestAssured.given;
public class TradeResponseClassStep extends RestClass{
	
	
	
	@Step
	public TradeDetails get_trade_details() {
		
		return given().spec(secRequest).get("/store").then().extract().as(TradeDetails.class);
		
	}

}
