package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutCreateResponse extends WePayResponse {

	/** The unique ID of the checkout. */
	private String checkoutId;
	/** The uri you can send a user to so they can pay. */
	private String checkoutUri;

}