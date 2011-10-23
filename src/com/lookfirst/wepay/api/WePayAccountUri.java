package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString
public class WePayAccountUri extends WePayAccountId {

	/** A uri that corresponds to the account's page on WePay. */
	private String accountUri;
}