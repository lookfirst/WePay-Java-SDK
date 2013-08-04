package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountUri;
import com.lookfirst.wepay.api.ThemeObject;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Creates a new payment account for the user associated with the access token used to make this call.
 * If reference_id is passed, it MUST be unique for the application/user pair or an error will be returned.
 * NOTE: You cannot create an account with the word 'wepay' in it. This is to prevent phishing attacks.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountCreateRequest extends WePayRequest<AccountUri> {

	/** The name of the account you want to create. */
	private String name;
	/** The description of the account you want to create. */
	private String description;
	/** The reference id of the account. Must be unique for the application/user pair. */
	private String referenceId;
	/** The type of account you are creating. Can be "nonprofit", "business", or "personal". */
	private String type;
	/** The uri for an image that you want to use for the accounts icon. This image will be used in the co-branded checkout process. */
	private String imageUri;
	/** The list of Google Analytics account ids that WePay will throw events to and use for tracking. */
	private List<String> gaqDomains;
	/** The theme object you want to be used for account's checkout flows, withdrawal flows, and emails */
	private ThemeObject themeObject;
	/** The mcc code that is relevant to the type of account this is. See the mcc reference page for more information. */
	private Integer Mcc;
	/** The uri that will receive IPNs for this account. You will receive an IPN whenever the account is verified or deleted. */
	private String callbackUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/create";
	}
}