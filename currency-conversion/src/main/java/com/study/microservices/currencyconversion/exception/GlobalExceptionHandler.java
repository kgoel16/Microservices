package com.study.microservices.currencyconversion.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	private Status status = new Status();
	@ExceptionHandler(CurrencyNotFound.class)
	public ResponseEntity<Status> handleCurrencyNotFoundException(Exception ex, WebRequest request){
	
		status.setDate(new Date());
		status.setMessage(ex.getMessage());
		return new ResponseEntity<>(status,HttpStatus.NOT_FOUND);
	}
}
