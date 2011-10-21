package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountDetailsResponse extends WePayResponse {

	/** The unique ID of the account. */
	private String accountId;
	/** The name of the account. */
	private String name;
	/** The account description. */
	private String description;
	/** The unique reference ID of the account (this is set by the application in the /account/create or /account/modify call). */
	private String referenceId;
	/** A uri that corresponds to the account's page on WePay. */
	private String accountUri;
	/** The maximum amount in dollars (including fees) that you can charge for payments to this account. */
	private String paymentLimit;
}