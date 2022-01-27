package com.study.microservices.currencyexchange.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exchange {

	public Exchange(long id, String from, String to, BigDecimal conversionfactor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionfactor = conversionfactor;
	}

	public Exchange() {
	}

	@Id
	private long id;
	
	@Column(name="Currency_from")
	private String from;
	@Column(name="Currency_to")
	private String to;
	private BigDecimal conversionfactor;
	private String port;

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

}
