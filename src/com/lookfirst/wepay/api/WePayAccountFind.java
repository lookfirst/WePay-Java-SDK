package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call lets you search the accounts of the user associated with the access token used to make the call.
 * You can search by name or reference_id, and the response will be an array of all the matching accounts.
 * If both name and reference_id are blank, this will return an array of all of the user's accounts.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountFind extends WePayRequest<WePayAccountFindResponse> {

	/** The name of the account you are searching for. */
	private String name;
	/** The reference ID of the account you are searching for (set by the app in in /account/create or account/modify). */
	private String referenceId;

	/** */
	public WePayAccountFind() {
		super(WePayAccountFindResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/find";
	}
}