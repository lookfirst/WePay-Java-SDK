package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Withdrawal;

/**
 * https://stage.wepay.com/developer/reference/withdrawal
 *
 * This call allows you to change the callback_uri on a withdrawal.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WithdrawalModifyRequest extends WePayRequest<Withdrawal> {

	/** The unique ID of the withdrawal you want to look up. */
	private Long withdrawalId;
	/** The uri that will receive POST notifications each time the withdrawal changes state. See the IPN tutorial for more details. Needs to be a full uri (ex https://www.wepay.com ) and must NOT be localhost or 127.0.0.1 or include wepay.com. Max 2083 chars. */
	private String callbackUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/withdrawal/modify";
	}
}