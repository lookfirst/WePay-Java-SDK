package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
public class WePayAccountId {

	/** The unique ID of the account. */
	private String accountId;
}