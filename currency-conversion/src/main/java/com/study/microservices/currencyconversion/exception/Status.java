package com.study.microservices.currencyconversion.exception;

import java.util.Date;

public class Status {

	private Date date;
	private String message;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
