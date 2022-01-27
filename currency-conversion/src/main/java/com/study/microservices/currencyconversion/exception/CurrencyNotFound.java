package com.study.microservices.currencyconversion.exception;

public class CurrencyNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CurrencyNotFound(String msg) {
		super(msg);
	}
}
