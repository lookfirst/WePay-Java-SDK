package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutUri extends CheckoutId {
	private static final long serialVersionUID = 1L;

	/** The uri you can send a user to so they can pay. */
	private String checkoutUri;

}