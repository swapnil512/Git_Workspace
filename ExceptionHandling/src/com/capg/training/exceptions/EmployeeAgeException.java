package com.capg.training.exceptions;

public class EmployeeAgeException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeAgeException(String msg) {
		this.message = msg;
	}

}
