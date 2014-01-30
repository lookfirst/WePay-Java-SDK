package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayAccount extends AccountUri {
	private static final long serialVersionUID = 1L;

	/** The name of the account. */
	private String name;
	/** The state of the account: active, disabled or deleted. */
	private String state;
	/** The account description. */
	private String description;
	/** The unique reference ID of the account (this is set by the application in the /account/create or /account/modify call). */
	private String referenceId;
	/** The maximum amount in dollars (including fees) that you can charge for payments to this account. */
	private String paymentLimit;
	/** An array of Google Analytics domains associated with the app. */
	private List<String> gaqDomains;
	/** The theme object associated with the App (if applicable). */
	private ThemeObject themeObject;
	/** Returns "verified" if the account has been verified and "unverified" if it has not. If the account has pending verification, then it is "pending". */
	private String verificationState;
	/** If the account is "unverified" then you can send the user to this url to verify their account. */
	private String verificationUrl;
	/** The account type. Can be "personal", "nonprofit", or "business". */
	private String type;
	/** The unixtime when the account was created. */
	private Long createTime;
	/** Array of account balances for each currency. */
	private List<AccountBalance> balances;
	/** Array of account incoming and outgoing payments status for each currency. */
	private List<AccountStatus> statuses;
	/** Array of action strings explaining all the actions that are required to make this account active. It will be empty if no action is required. */
	private List<String> actionReasons;
	/** The account's country of origin 2-letter ISO code (e.g. 'US') */
	private String country;
	/** Array of supported currency strings for this account (e.g. ["USD"]). Only "USD" is supported for now. */
	private List<String> currencies;
}