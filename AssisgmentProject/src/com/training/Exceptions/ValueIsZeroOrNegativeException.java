package com.training.Exceptions;

public class ValueIsZeroOrNegativeException extends Exception {
	
	private String message;
	public ValueIsZeroOrNegativeException(String msg) {
		
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
