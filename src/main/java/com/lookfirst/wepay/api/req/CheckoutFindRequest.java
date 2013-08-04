package com.lookfirst.wepay.api.req;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.CheckoutId;
import com.lookfirst.wepay.api.Constants.SortOrder;
import com.lookfirst.wepay.api.Constants.State;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * This call allows you to search for checkouts associated with an account. Returns an array of matching checkout IDs.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutFindRequest extends WePayRequest<List<CheckoutId>> {
	/** The unique ID of the account whose checkouts you are searching. */
	private Long accountId;
	/** The start position for your search (default 0). */
	private Integer start;
	/** The maximum number of returned entries (default 50). */
	private Integer limit;
	/** The unique reference id of the checkout (set by the application in /checkout/create */
	private String referenceId;
	/** What state the checkout is in (see the Instant Payment Notifications reference for details). */
	private State state;
	/** The ID of the preapproval that was used to create the checkout. Useful if you want to look up all of the payments for an auto_recurring preapproval. */
	private Integer preapprovalId;
	/** All checkouts after given start time. Can be a unix_timestamp or a valid, parse-able date-time. */
	private String startTime;
	/** All checkouts before given end time. Can be a unix_timestamp or a valid, parse-able date-time. */
	private String endTime;
	/** Sort the results of the search by time created. Use 'DESC' for most recent to least recent. Use 'ASC' for least recent to most recent. Defaults to 'DESC'. */
	private SortOrder sortOrder;
	/** All checkouts that have the given shipping fee. */
	private BigDecimal shippingFee;

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/find";
	}
}