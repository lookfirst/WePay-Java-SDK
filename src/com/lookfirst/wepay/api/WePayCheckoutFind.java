package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * This call allows you to search for checkouts associated with an account. Returns an array of matching checkout IDs.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutFind extends WePayRequest<WePayCheckoutFindResponse> {
	/** The unique ID of the account whose checkouts you are searching. */
	private String accountId;
	/** The start position for your search (default 0). */
	private String start;
	/** The maximum number of returned entries (default 50). */
	private String limit;
	/** The unique reference id of the checkout (set by the application in /checkout/create */
	private String referenceId;
	/** What state the checkout is in (see the Instant Payment Notifications reference for details). */
	private String state;

	/** */
	public WePayCheckoutFind() {
		super(WePayCheckoutFindResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/find";
	}
}