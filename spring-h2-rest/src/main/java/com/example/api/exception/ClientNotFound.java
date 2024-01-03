package com.example.api.exception;

public class ClientNotFound extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ClientNotFound(String consumer){
		super("Given consumer is not available");
	}
}
