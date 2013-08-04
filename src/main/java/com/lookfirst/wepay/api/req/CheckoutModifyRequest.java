package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Checkout;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * This call allows you to modify the callback_uri of a checkout.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutModifyRequest extends WePayRequest<Checkout> {

	/** Yes	The unique ID of the checkout to be captured. */
	private Long checkoutId;
	/** The uri that will receive any instant payment notifications sent. Needs to be a full uri (ex https://www.wepay.com ) and must NOT be localhost or 127.0.0.1 or include wepay.com. Max 2083 chars. */
	private String callbackUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/modify";
	}
}