package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * This call allows you to lookup the details of a specific checkout on WePay using the checkout_id.
 * Response parameters marked "if available" will only show up if they have values.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutDetails extends WePayRequest<WePayCheckoutDetailsResponse> {

	/** The unique ID of the checkout you want to look up. */
	private String checkoutId;

	/** */
	public WePayCheckoutDetails() {
		super(WePayCheckoutDetailsResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout";
	}
}