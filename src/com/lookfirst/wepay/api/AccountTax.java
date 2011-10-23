package com.lookfirst.wepay.api;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountTax {

	/** The tax tables for the account. */
	private String taxes;
}