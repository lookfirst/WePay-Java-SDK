package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountModifyResponse extends WePayResponse {

	/** The unique ID of the account. */
	private String accountId;
	/** A uri that corresponds to the account's page on WePay. */
	private String accountUri;
}