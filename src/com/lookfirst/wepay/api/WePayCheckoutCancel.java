package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * Cancels the payment associated with the checkout created by the application. Checkout must be in "new" or "authorized" state.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutCancel extends WePayRequest<WePayCheckoutCancelResponse> {

	/** Yes	The unique ID of the checkout to be canceled. */
	private String checkoutId;
	/** Yes	The reason the payment is being cancelled. */
	private String cancelReason;

	/** */
	public WePayCheckoutCancel() {
		super(WePayCheckoutCancelResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/cancel";
	}
}