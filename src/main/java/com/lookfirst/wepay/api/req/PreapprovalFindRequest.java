package com.lookfirst.wepay.api.req;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Preapproval;
import com.lookfirst.wepay.api.Constants.SortOrder;
import com.lookfirst.wepay.api.Constants.State;

/**
 * https://stage.wepay.com/developer/reference/preapproval
 *
 * This call lets you search the preapprovals associated with an account or an application.
 * If account_id is blank, then the response will be all preapprovals for the application.
 * Otherwise, it will be specifically for that account. You can search by state and/or reference_id,
 * and the response will be an array of all the matching preapprovals.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PreapprovalFindRequest extends WePayRequest<Preapproval> {

	/** The unique ID of the account whose preapprovals you are searching. If empty, then the response will be all preapprovals for the application. */
	private Long accountId;
	/** The state of the preapproval you are searching for. */
	private State state;
	/** The reference ID of the preapproval you are searching for (set by the app in in /preapproval/create call). */
	private String referenceId;
	/** The start position for your search (default 0). */
	private Integer start;
	/** The maximum number of returned entries (default 50). */
	private Integer limit;
	/** Sort the results of the search by time created. Use 'DESC' for most recent to least recent. Use 'ASC' for least recent to most recent. Defaults to 'DESC'. */
	private SortOrder sortOrder;
	/** Finds the preapproval associated with the given checkout ID. The checkout must have been successful (state captured). */
	private Long lastCheckoutId;
	/** All preapprovals with the given shipping fee. */
	private BigDecimal shippingFee;

	/** */
	@Override
	public String getEndpoint() {
		return "/preapproval/find";
	}
}