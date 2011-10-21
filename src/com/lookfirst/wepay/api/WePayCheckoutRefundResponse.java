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
public class WePayCheckoutRefundResponse extends WePayResponse {

	/** The unique ID of the checkout that was successfully refunded. */
	private String checkoutId;
	/** The state the payment is in. See the IPN section for a list of payment states. */
	private String state;
}