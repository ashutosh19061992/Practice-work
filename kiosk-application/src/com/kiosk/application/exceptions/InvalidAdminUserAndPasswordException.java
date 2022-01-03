package com.kiosk.application.exceptions;

public class InvalidAdminUserAndPasswordException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAdminUserAndPasswordException(String message) {
		super(message);
	}
}
