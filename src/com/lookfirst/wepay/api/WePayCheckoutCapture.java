package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * If auto_capture was set to 0 when the checkout was created, you will need to make this call
 * to release funds to the account. Until you make this call the money will be held by WePay.
 * You can only make this call if the checkout is in state 'reserved'.
 *
 * @author Jon Scott Stevens
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutCapture extends WePayRequest<WePayCheckoutCaptureResponse> {

	/** Yes	The unique ID of the checkout to be captured. */
	private String checkoutId;

	/** */
	public WePayCheckoutCapture() {
		super(WePayCheckoutCaptureResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/capture";
	}
}