package com.serenity.steps.rest;

public class Trade {
	
	private String security;
	private String buySell;
	private String quantity;
	private String priceInCents;

	public Trade(String security, String buySell, String quantity, String priceInCents) {

		this.security = security;
		this.buySell = buySell;
		this.quantity = quantity;
		this.priceInCents = priceInCents;

	}
	public Trade() {};

	public String getSecurity() {
		return security;
	}

	public String getBuySell() {
		return buySell;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getPriceInCents() {
		return priceInCents;
	}

}