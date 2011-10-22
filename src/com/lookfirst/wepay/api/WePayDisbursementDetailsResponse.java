package com.lookfirst.wepay.api;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to lookup the details of a disbursement. A disbursement is a collection
 * of monetary transfers from a WePay account to an email address.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayDisbursementDetailsResponse extends WePayResponse {

	/** The unique ID of the disbursement. */
	private String disbursementId;
	/** The reference_id passed by the application (if set). */
	private String referenceId;
	/** The uri that you need to send the account owner to so they can approve the disbursement. */
	private String disbursementUri;
	/** The uri that the account owner will return to after approving the disbursement. Set to app homepage if not passed in /disbursement/create. */
	private String redirectUri;
	/** The state that the disbursement is in (new, sent, or failed). */
	private String state;
	/** The list of all transfers from the account to emails, including transfer information. See /transfer for a list of parameters in each transfer object. */
	private List<WePayTransfer> transfers;
}