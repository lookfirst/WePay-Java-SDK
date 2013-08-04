package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Constants.Mode;
import com.lookfirst.wepay.api.Withdrawal;

/**
 * https://stage.wepay.com/developer/reference/withdrawal
 *
 * This call allows you to create a withdrawal object. A withdrawal object represents
 * the movement of money from a WePay account to a bank account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WithdrawalCreateRequest extends WePayRequest<Withdrawal> {

	/** The unique ID of the WePay account the money will be withdrawn from. */
	private String accountId;
	/** The uri that the account owner will be sent to after they authorize the withdrawal. Defaults to the application homepage. */
	private String redirectUri;
	/** The uri that will receive POST notifications each time the withdrawal changes state. See the IPN tutorial for more details. Needs to be a full uri (ex https://www.wepay.com ) and must NOT be localhost or 127.0.0.1 or include wepay.com. Max 2083 chars. */
	private String callbackUri;
	/** A short description of the withdrawal (255 characters). */
	private String note;
	/** What mode the withdrawal will be displayed in. The options are 'iframe' or 'regular'. Choose 'iframe' if this is an iframe withdrawal. Mode defaults to 'regular'. */
	private Mode mode;

	/** */
	@Override
	public String getEndpoint() {
		return "/withdrawal/create";
	}
}