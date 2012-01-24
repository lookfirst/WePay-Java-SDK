package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class CheckoutId implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the checkout */
	private Long checkoutId;
}