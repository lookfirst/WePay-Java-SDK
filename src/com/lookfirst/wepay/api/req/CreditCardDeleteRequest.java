package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CreditCard;

/**
 * https://stage.wepay.com/developer/reference/credit_card
 *
 * Delete the credit card when you don't need it anymore. Note that you won't be able to use this card to make payments any more.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CreditCardDeleteRequest extends WePayRequest<CreditCard> {

	/** The ID your your API application. You can find it on your app dashboard. */
	private Long clientId;

	/** The secret for your API application. You can find it on your app dashboard. */
	private String clientSecret;

	/** The unique ID of the credit_card you want to look up. */
	private Long creditCardId;

	/** */
	@Override
	public String getEndpoint() {
		return "/credit_card/delete";
	}
}