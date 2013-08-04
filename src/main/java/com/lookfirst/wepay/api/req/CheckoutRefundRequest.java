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
	/** The portion of the 'amount' that will be refunded as an app_fee refund. For example, if 'amount' is 100.00 and 'app_fee' is 10.00, then the payer will receive a refund of 100.00, where 90.00 is the net refund from the payment account, and 10.00 is the app_fee refund. Note that this value must be less than the remaining balance of the app fee. */
	private BigDecimal appFee;
	/** A short message that will be included in the payment confirmation email to the payer. */
	private String payerEmailMessage;
	/** A short message that will be included in the payment confirmation email to the payee. */
	private String payeeEmailMessage;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/refund";
	}
}