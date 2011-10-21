package com.lookfirst.wepay.api;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Interface for a WePayRequest object.
 *
 * @author Jon Scott Stevens
 */
public abstract class WePayRequest<T extends WePayResponse> {
	@JsonIgnore
	public abstract String getEndpoint();

	@JsonIgnore
	Class<T> responseClass;

	public WePayRequest(Class<T> responseClass) {
		this.responseClass = responseClass;
	}

	public Class<T> getResponseClass() {
		return responseClass;
	}
}
