package com.lookfirst.wepay.api;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;


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
	/** */
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
}