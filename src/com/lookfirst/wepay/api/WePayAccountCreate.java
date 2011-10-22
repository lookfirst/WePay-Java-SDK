package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Creates a new payment account for the user associated with the access token used to make this call.
 * If reference_id is passed, it MUST be unique for the application/user pair or an error will be returned.
 * NOTE: You cannot create an account with the word 'wepay' in it. This is to prevent phishing attacks.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountCreate extends WePayRequest<WePayAccountCreateResponse> {

	/** The name of the account you want to create. */
	private String name;
	/** The description of the account you want to create. */
	private String description;
	/** The reference id of the account. Must be unique for the application/user pair. */
	private String referenceId;
	/** The uri for an image that you want to use for the accounts icon. This image will be used in the co-branded checkout process. */
	private String imageUri;

	/** */
	public WePayAccountCreate() {
		super(WePayAccountCreateResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/create";
	}
}