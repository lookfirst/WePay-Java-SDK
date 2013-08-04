package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Checkout.ShippingAddress;
import com.lookfirst.wepay.api.CreditCard;

/**
 * https://stage.wepay.com/developer/reference/credit_card
 *
 * This call allows you to pass credit card information and receive back a credit_card_id. You will then be able to use that credit_card_id on
 * the /checkout/create call to execute a payment immediately with that credit card (similar to how the preapproval_id on /checkout/create
 * works). Note that you will need to call the /checkout/create call OR the /credit_card/authorize call within 30 minutes or the credit card will expire.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CreditCardCreateRequest extends WePayRequest<CreditCard> {

	/** Yes The ID your your API application. You can find it on your app dashboard. */
	private Long clientId;

	/** Yes The number on the credit card. */
	private Long ccNumber;

	/** Yes The CVV (AKA card security code, CVV2, CVC etc) on the card. */
	private Integer cvv;

	/** Yes The expiration month on the credit card. */
	private Integer expirationMonth;

	/** Yes The expiration year on the credit card. */
	private Integer expirationYear;

	/** Yes The full name of the user that the card belongs to. */
	private String userName;

	/** Yes The email address of the user the card belongs to. */
	private String email;

	/**
	 * Yes
	 * The billing address on the card. It should be a valid JSON object (not a JSON serialized string) with the following format:
	 * {"address1":"380 Portage Ave","address2":"","city":"Palo Alto","state":"CA","zip":"94306","country":"US"}.
	 */
	private ShippingAddress address;

	/** */
	@Override
	public String getEndpoint() {
		return "/credit_card/create";
	}
}