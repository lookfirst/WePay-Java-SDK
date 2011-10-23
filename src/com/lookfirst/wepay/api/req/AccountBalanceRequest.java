package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.AccountBalance;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Gets the balance for the account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountBalanceRequest extends WePayRequest<AccountBalance> {

	/** The name of the account you want the balance for. */
	private String accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/balance";
	}
}