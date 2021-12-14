package com.serenity.steps.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Rest {
	
	RequestSpecification specRequest;
	ResponseSpecification specResponse;

	Rest() {
		String url = "http://localhost:3000";
				
		specRequest = new RequestSpecBuilder().setContentType("application/json")
				.addHeader("Content-Type", "application/json").setBaseUri(url).build();
		
		//specResponse = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
	}

}
