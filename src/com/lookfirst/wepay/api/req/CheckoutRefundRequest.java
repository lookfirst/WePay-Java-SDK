package com.lookfirst.wepay.api.req;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CheckoutState;

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
public class CheckoutRefundRequest extends WePayRequest<CheckoutState> {

	/** Yes	The unique ID of the checkout to be refunded. */
	private Long checkoutId;
	/** Yes	The reason the payment is being refunded. */
	private String refundReason;
	/** Optionally specified partial refund amount */
	private BigDecimal amount;
	/** Optional unique reference id, which allows partial refunds to be idempotent */
	String referenceId;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/refund";
	}
}