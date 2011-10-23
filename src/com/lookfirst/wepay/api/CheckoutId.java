package com.lookfirst.wepay.api;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class CheckoutId {

	/** The unique ID of the checkout */
	private Long checkoutId;
}