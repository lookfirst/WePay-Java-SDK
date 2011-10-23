package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
public class WePayCheckoutId {

	/** The unique ID of the checkout */
	private String checkoutId;
}