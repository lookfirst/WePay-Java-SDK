package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CreditCard;

/**
 * https://stage.wepay.com/developer/reference/credit_card
 *
 * You should only use this call if you are not going to immediately make the /checkout/create call
 * with the credit_card_id. This call will authorize the card and let you use it at a later time or
 * date (for crowdfunding, subscriptions, etc). If you don’t call /credit_card/authorize or
 * /checkout/create within 30 minutes then the credit card will expire.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CreditCardAuthorizeRequest extends WePayRequest<CreditCard> {

	/** The ID your your API application. You can find it on your app dashboard. */
	private Long clientId;

	/** The secret for your API application. You can find it on your app dashboard. */
	private String clientSecret;

	/** The unique ID of the credit_card you want to look up. */
	private Long creditCardId;

	/** */
	@Override
	public String getEndpoint() {
		return "/credit_card/authorize";
	}
}