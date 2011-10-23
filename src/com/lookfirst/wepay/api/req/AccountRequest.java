package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.WePayAccount;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call allows you to lookup the details of the a payment account on WePay.
 * The payment account must belong to the user associated with the access token used to make the call.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountRequest extends WePayRequest<WePayAccount> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account";
	}
}