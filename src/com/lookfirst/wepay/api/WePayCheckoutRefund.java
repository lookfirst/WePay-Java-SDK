package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * Refunds the payment associated with the checkout created by the application. Checkout must be in "reserved" or "captured" state.
 *
 * @author Jon Scott Stevens
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutRefund extends WePayRequest<WePayCheckoutRefundResponse> {

	/** Yes	The unique ID of the checkout to be refunded. */
	private String checkoutId;
	/** Yes	The reason the payment is being refunded. */
	private String refundReason;

	/** */
	public WePayCheckoutRefund() {
		super(WePayCheckoutRefundResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/refund";
	}
}