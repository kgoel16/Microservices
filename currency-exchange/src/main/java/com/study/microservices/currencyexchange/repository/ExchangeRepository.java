package com.study.microservices.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.microservices.currencyexchange.model.Exchange;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {
	
	Exchange findByFromAndTo(String from, String to);
	

}
