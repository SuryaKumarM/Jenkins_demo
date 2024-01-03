package com.example.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ClientNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(ClientNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String ClientNotFoundHandler(ClientNotFound ex) {
		return ex.getMessage();
	}
}
