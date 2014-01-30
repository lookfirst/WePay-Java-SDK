package com.lookfirst.wepay.api;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountBalance implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
	private BigDecimal balance;
	private BigDecimal incomingPendingAmount;
	private BigDecimal outgoingPendingAmount;
	/** The actual amount of money in dollars that is reserved and is not available for withdrawal (ie the minimum balance). */
	private BigDecimal reservedAmount;
	/** The actual amount of money in dollars that is currently in dispute between the payee and the payer and is not available for withdrawal. */
	private BigDecimal disputedAmount;
	/** "daily" */
	private String withdrawalPeriod;
	/** Unix time */
	private Long withdrawalNextTime;
	/** Name of the bank */
	private String withdrawalBankName;

	/** Older api */

	/** The pending balance of the account. */
	@Deprecated
	private BigDecimal pendingBalance;
	/** The actual amount of money that has cleared and is available to the account. */
	@Deprecated
	private BigDecimal availableBalance;
	/** The actual amount of money in dollars that is pending. */
	@Deprecated
	private BigDecimal pendingAmount;
}