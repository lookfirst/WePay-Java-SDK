package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Checkout;

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
public class CheckoutRequest extends WePayRequest<Checkout> {

	/** The unique ID of the checkout you want to look up. */
	private Long checkoutId;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout";
	}
}