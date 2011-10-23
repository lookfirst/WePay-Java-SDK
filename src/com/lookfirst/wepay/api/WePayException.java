package com.lookfirst.wepay.api;

/** https://stage.wepay.com/developer/reference/errors */
public class WePayException extends Exception {
	private static final long serialVersionUID = 1L;

	public WePayException(String errorDescription) {
		super(errorDescription);
	}

	public WePayException(String message, Exception e) {
		super(message, e);
	}
}