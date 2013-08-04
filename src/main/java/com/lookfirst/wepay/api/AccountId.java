package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountId implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the account. */
	private Long accountId;
	/** The state of the account. */
	private String state;

}