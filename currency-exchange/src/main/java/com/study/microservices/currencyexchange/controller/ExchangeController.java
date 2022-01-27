package com.study.microservices.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.microservices.currencyexchange.model.Exchange;
import com.study.microservices.currencyexchange.repository.ExchangeRepository;

@RestController
public class ExchangeController {

	@Autowired
	Environment environment;
	@Autowired
	ExchangeRepository repo;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public Exchange getExchangeValues(@PathVariable String from, @PathVariable String to) {
		
		Exchange exchange = repo.findByFromAndTo(from, to);
		exchange.setPort(environment.getProperty("local.server.port"));
		return exchange;
	}
	
}
