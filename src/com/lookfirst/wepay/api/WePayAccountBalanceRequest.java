package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Gets the balance for the account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountBalanceRequest extends WePayRequest<WePayAccountBalance> {

	/** The name of the account you want the balance for. */
	private String accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/balance";
	}
}