package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.CheckoutState;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * Cancels the payment associated with the checkout created by the application. Checkout must be in "new" or "authorized" state.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutCancelRequest extends WePayRequest<CheckoutState> {

	/** Yes	The unique ID of the checkout to be canceled. */
	private Long checkoutId;
	/** Yes	The reason the payment is being cancelled. */
	private String cancelReason;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/cancel";
	}
}