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
public class CreditCardFindRequest extends WePayRequest<CreditCard> {

	/** The ID your your API application. You can find it on your app dashboard. */
	private Long clientId;

	/** The secret for your API application. You can find it on your app dashboard. */
	private String clientSecret;

	/** The unique ID of the credit_card you want to look up. */
	private Long creditCardId;

	/** The reference ID of the credit_card you want to find. */
	private String referenceId;

	/** The maximum number of results you want returned. Defaults to 50. */
	private Integer limit;

	/** The start position for your search (default 0). */
	private Integer start;

	/** Sort the results of the search by time created. Use 'DESC' for most recent to least recent. Use 'ASC' for least recent to most recent. Defaults to 'DESC'. */
	private String sortOrder;

	/** */
	@Override
	public String getEndpoint() {
		return "/credit_card/find";
	}
}