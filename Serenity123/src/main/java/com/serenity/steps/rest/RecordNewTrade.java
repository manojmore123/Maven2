package com.serenity.steps.rest;
 

import net.thucydides.core.annotations.Step;
import static io.restassured.RestAssured.given;
public class RecordNewTrade extends Rest {

	@Step("Record a new trade")
	public void withDetails(Trade trade) {
		given().spec(specRequest).body(trade).when().post("/store");
	}

	public Trade createRecord(String security, String buySell, String quantity,String priceInCents) {
			return new Trade(security, buySell, quantity, priceInCents);
	}

}
