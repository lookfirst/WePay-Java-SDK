package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * This call allows you to lookup the details of a specific checkout on WePay using the checkout_id.
 * Response parameters marked "if available" will only show up if they have values.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutDetailsRequest extends WePayRequest<CheckoutDetails> {

	/** The unique ID of the checkout you want to look up. */
	private String checkoutId;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout";
	}
}