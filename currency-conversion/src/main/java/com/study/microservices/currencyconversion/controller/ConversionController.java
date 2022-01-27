package com.study.microservices.currencyconversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.study.microservices.currencyconversion.exception.CurrencyNotFound;

@RestController

public class ConversionController {

	@Autowired
	ConversionProxy proxy; 
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		ResponseEntity<CurrencyConversion> response = new RestTemplate()
				.getForEntity("http://localhost:8000/currency-exchange/from/"+from+"/to/"+to, CurrencyConversion.class);
		CurrencyConversion currencyConversion = response.getBody();
		return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
				currencyConversion.getConversionfactor().multiply(BigDecimal.valueOf(quantity)),
				currencyConversion.getConversionfactor(), currencyConversion.getPort());

	}
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getConversionFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		CurrencyConversion currencyConversion = proxy.getExchangeValues(from, to);
		return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
				currencyConversion.getConversionfactor().multiply(BigDecimal.valueOf(quantity)),
				currencyConversion.getConversionfactor(), currencyConversion.getPort());

	}

	
	//Added this method to show how to use exception handling
	@GetMapping("/currency-conversion")
	public String getExceptionMethod() {
		
		throw new CurrencyNotFound("Currency not found in the DB");
	}
}
