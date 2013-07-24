package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountBalance;

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

	/** The unique ID of the account you want to get the balance of. */
	private Long accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/balance";
	}
}