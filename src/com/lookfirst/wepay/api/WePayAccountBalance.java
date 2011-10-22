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
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountBalance extends WePayRequest<WePayAccountBalanceResponse> {

	/** The name of the account you want the balance for. */
	private String accountId;

	/** */
	public WePayAccountBalance() {
		super(WePayAccountBalanceResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/balance";
	}
}