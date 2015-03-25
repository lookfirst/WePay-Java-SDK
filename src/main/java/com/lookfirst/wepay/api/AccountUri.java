package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AccountUri extends AccountId {
	private static final long serialVersionUID = 1L;

	/** The URI to add or update info for the specified account id. */
	private String uri;
}