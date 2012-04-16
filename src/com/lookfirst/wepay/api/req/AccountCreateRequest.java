package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountUri;

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
	/** The uri for an image that you want to use for the accounts icon. This image will be used in the co-branded checkout process. */
	private String imageUri;
	/** The list of Google Analytics account ids that WePay will throw events to and use for tracking. */
	private List<String> gaqDomains;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/create";
	}
}