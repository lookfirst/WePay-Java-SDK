package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Withdrawal;

/**
 * https://stage.wepay.com/developer/reference/withdrawal
 *
 * This call allows you to lookup the details of a withdrawal.
 * A withdrawal object represents the movement of money from a WePay account to a bank account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WithdrawalRequest extends WePayRequest<Withdrawal> {

	/** The unique ID of the withdrawal you want to look up. */
	private Long withdrawalId;

	/** */
	@Override
	public String getEndpoint() {
		return "/withdrawal";
	}
}