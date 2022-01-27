package com.study.microservices.currencyconversion.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="exchange-service")
public interface ConversionProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion getExchangeValues(@PathVariable String from, @PathVariable String to);
		
}
