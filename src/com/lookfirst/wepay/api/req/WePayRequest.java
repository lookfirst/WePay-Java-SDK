package com.lookfirst.wepay.api.req;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Interface for a WePayRequest object.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
public abstract class WePayRequest<T> {
	@JsonIgnore
	public abstract String getEndpoint();
}
