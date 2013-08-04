package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CreditCard;

/**
 * https://stage.wepay.com/developer/reference/credit_card
 *
 * This call allows you to lookup the details of the a credit card that you have tokenized.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CreditCardRequest extends WePayRequest<CreditCard> {

	/** The ID your your API application. You can find it on your app dashboard. */
	private Long clientId;

	/** The secret for your API application. You can find it on your app dashboard. */
	private String clientSecret;

	/** The unique ID of the credit_card you want to look up. */
	private Long creditCardId;

	/** */
	@Override
	public String getEndpoint() {
		return "/credit_card";
	}
}