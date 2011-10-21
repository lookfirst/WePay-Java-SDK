package com.lookfirst.wepay.api;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Base class that mostly deals with error handling. All 'response' objects
 * should extend this class.
 *
 * @author Jon Scott Stevens
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true) // necessary because error* may or may not exist.
public abstract class WePayResponse {
	private String error;
	private String error_description;

	/** https://stage.wepay.com/developer/reference/errors */
	public static class WePayException extends Exception {
		public WePayException(String errorDescription) {
			super(errorDescription);
		}

		public WePayException(String message, Exception e) {
			super(message, e);
		}
	}

	public WePayResponse() {}

	public String getError() {
		return error;
	}

	public String getErrorDescription() {
		return error_description;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setErrorDescription(String error_description) {
		this.error_description = error_description;
	}

	/**
	 * Processes the error strings and throws the appropriate runtime exception.
	 */
	public void checkError() throws WePayException {
		if (error != null) {
			throw new WePayException(error + " : " + error_description);
		}
	}
}
