package com.wissen.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5165837674225272378L;

	public UserNotFoundException(String message) {
		super(message);

	}

}
