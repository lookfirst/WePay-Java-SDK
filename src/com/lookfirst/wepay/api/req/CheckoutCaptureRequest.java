package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CheckoutState;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * If auto_capture was set to 0 when the checkout was created, you will need to make this call
 * to release funds to the account. Until you make this call the money will be held by WePay.
 * You can only make this call if the checkout is in state 'reserved'.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutCaptureRequest extends WePayRequest<CheckoutState> {

	/** Yes	The unique ID of the checkout to be captured. */
	private Long checkoutId;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/capture";
	}
}