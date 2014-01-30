package com.lookfirst.wepay.api;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountReserve extends AccountId {
	private static final long serialVersionUID = 1L;

	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
	/** The actual amount of money in dollars that is reserved and is not available for withdrawal (ie the minimum balance). */
	private BigDecimal reservedAmount;
	/** An array of time/amount pairs up to the next 10 withdrawals based on current balance, the reserves and withdrawals schedules. It will be empty if withdrawals are not yet configured or if there is no balance. */
	private List<WithdrawalSchedule> withdrawalsSchedule;

	@Data
	private class WithdrawalSchedule {
		private Long time;
		private BigDecimal amount;
	}
}

