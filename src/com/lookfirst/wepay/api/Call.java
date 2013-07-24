package com.lookfirst.wepay.api;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/batch
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class Call implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The name of the API call you want to make (ie. /checkout/find). */
	private String call;

	/** The access token of the user that is making the API call. */
	private String authorization;

	/** A unique id that you can attach to an API call so that you can specifically identify that call. */
	private String referenceId;

	/** The parameters required by the API call that you specified in the "call" parameter. */
	private Map<String, String> parameters;
}