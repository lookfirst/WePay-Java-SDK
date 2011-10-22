package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountBalanceResponse extends WePayResponse {

	/** The pending balance of the account. */
	private String pendingBalance;
	/** The actual amount of money that has cleared and is available to the account. */
	private String availableBalance;
	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
}