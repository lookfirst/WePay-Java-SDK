package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString
public class WePayCheckoutState extends WePayCheckoutId {

	/** The state the payment is in. See the IPN section for a list of payment states. */
	private String state;
}