package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call allows you to lookup the details of the a payment account on WePay.
 * The payment account must belong to the user associated with the access token used to make the call.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountDetails extends WePayRequest<WePayAccountDetailsResponse> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** */
	public WePayAccountDetails() {
		super(WePayAccountDetailsResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account";
	}
}