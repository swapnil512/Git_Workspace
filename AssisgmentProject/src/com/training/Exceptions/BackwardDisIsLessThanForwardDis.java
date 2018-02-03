package com.training.Exceptions;

public class BackwardDisIsLessThanForwardDis extends Exception {
	private String message;

	public BackwardDisIsLessThanForwardDis(String msg) {

		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
