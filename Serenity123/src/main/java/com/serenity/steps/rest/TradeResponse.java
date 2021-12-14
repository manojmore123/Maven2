package com.serenity.steps.rest;

import static io.restassured.RestAssured.given;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import net.thucydides.core.annotations.Step;
public class TradeResponse extends Rest {
	@Step
	public Trade getDetails() {
		
		//ResponseSpecification spec=new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		return given().spec(specRequest).when().get("/store").then().extract()
				.as(Trade.class);
	}
}
