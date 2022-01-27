package com.study.microservices.currencyconversion.controller;

import java.math.BigDecimal;

public class CurrencyConversion {

	private long id;

	private String from;
	private String to;
	private int quantity;
	private BigDecimal convertedAmount;

	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(long id, String from, String to, int quantity, BigDecimal convertedAmount,
			BigDecimal conversionfactor, String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.convertedAmount = convertedAmount;
		this.conversionfactor = conversionfactor;
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public BigDecimal getConversionfactor() {
		return conversionfactor;
	}

	public void setConversionfactor(BigDecimal conversionfactor) {
		this.conversionfactor = conversionfactor;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	private BigDecimal conversionfactor;
	private String port;

}
