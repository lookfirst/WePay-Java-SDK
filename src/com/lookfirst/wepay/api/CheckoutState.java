package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Checkout.State;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class CheckoutState extends CheckoutId {
	private static final long serialVersionUID = 1L;

	/** The state the payment is in. See the IPN section for a list of payment states. */
	private State state;
}