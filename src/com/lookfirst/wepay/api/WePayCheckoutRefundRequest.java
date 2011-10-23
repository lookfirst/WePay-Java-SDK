package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * Refunds the payment associated with the checkout created by the application. Checkout must be in "reserved" or "captured" state.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutRefundRequest extends WePayRequest<WePayCheckoutState> {

	/** Yes	The unique ID of the checkout to be refunded. */
	private String checkoutId;
	/** Yes	The reason the payment is being refunded. */
	private String refundReason;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/refund";
	}
}