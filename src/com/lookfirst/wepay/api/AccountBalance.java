package com.lookfirst.wepay.api;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountBalance implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The pending balance of the account. */
	private BigDecimal pendingBalance;
	/** The actual amount of money that has cleared and is available to the account. */
	private BigDecimal availableBalance;
	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
}