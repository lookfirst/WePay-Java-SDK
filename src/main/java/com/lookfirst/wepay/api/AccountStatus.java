package com.lookfirst.wepay.api;

import lombok.Data;

import java.io.Serializable;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
	private String incomingPaymentsStatus;
	private String outgoingPaymentsStatus;
}