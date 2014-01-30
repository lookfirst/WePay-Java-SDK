package com.lookfirst.wepay.api;

import com.lookfirst.wepay.api.Constants.State;
import com.lookfirst.wepay.api.Constants.WithdrawalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * https://stage.wepay.com/developer/reference/withdrawal
 *
 * This call allows you to lookup the details of a withdrawal.
 * A withdrawal object represents the movement of money from a WePay
 * account to a bank account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Withdrawal implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the withdrawal. */
	private Long withdrawalId;
	/** The unique ID of the account that the money is coming from. */
	private Long accountId;
	/** The state that the withdrawal is in See the section on payment states for a list of possible states. */
	private State state;
	/** The uri that the account owner will return to after completing the withdrawal. Set to app homepage if not passed in /withdrawal/create. */
	private String redirectUri;
	/** The uri that you will send the account owner to to complete the withdrawal. */
	private String withdrawalUri;
	/** The uri that we will post notifications to each time the state on this withdrawal changes. */
	private String callbackUri;
	/** The amount on money withdrawn from the WePay account to the bank account. */
	private BigDecimal amount;
	/** The currency used, default "USD" ("USD" for now). */
	private String currency;
	/** A short description for the reason of the withdrawal (255 characters). */
	private String note;
	/** Whether the recipient of the money has been confirmed (for bank withdrawals this is the receiving bank account). */
	private boolean recipientConfirmed;
	/** The type of withdrawal. Will be "check" for a sent paper check, or "ach" for a withdrawal to a bank account. */
	private WithdrawalType type;
	/** The unixtime when the withdrawal was created. */
	private Long createTime;
	/** The unixtime when the withdrawal was captured and credited to the payee's bank account. Returns 0 if withdrawal is not yet captured. */
	private Long captureTime;
}